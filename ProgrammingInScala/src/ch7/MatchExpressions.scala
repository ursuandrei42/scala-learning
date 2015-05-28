package ch7

object MatchExpressions {
  def main(args: Array[String]): Unit = {
    val firstArg = "salt"
    firstArg match {
      case "salt"  => println("pepper")
      case "chips" => println("salsa")
      case "eggs"  => println("bacon")
      case _       => println("huh?")
    }

    //suppose you are
    //searching through an argument list for a string that ends with “.scala” but
    //does not start with a hyphen.

    val args = Array("asdasd", "a.scala", "_a.scala")
    println(args(0))
    var i = 0
    var foundIt = false
    while (i < args.length && !foundIt) {
      if (!args(i).startsWith("")) {
        if (args(i).endsWith(".scala"))
          foundIt = true
      }
      i = i + 1
    }
    println(foundIt)
    println("==============")

    def searchFrom(i: Int): Int = {
      if (i >= args.length) -1
      else if (args(i).startsWith("-")) searchFrom(i + 1)
      else if (args(i).endsWith(".scala")) i
      else searchFrom(i + 1)
    }

    i = searchFrom(0)

    println(i)
  }
}