package ch7

/**
 * @author Andrei
 */
object BuildInControlStructures {
  def main(args: Array[String]): Unit = {
    //if
    var filename = "default.txt"
    if (!args.isEmpty)
      filename = args(0)

    val filename2 =
      if (!args.isEmpty) args(0)
      else "default.txt"

    //while
    def gcdLoop(x: Long, y: Long): Long = {
      var a = x
      var b = y
      while (a != 0) {
        val temp = a
        a = b % a
        b = temp
      }
      b
    }

    var line = ""
    do {
      line = "" //was readLine() instead of ""
      println("Read: " + line)
    } while (line != "")

    def greet() { println("hi") }
    println(greet() == ())

    //for
    val filesHere = (new java.io.File(".")).listFiles
    for (file <- filesHere)
      println(file)

    for (i <- 1 to 4)
      println("Iteration " + i)

    for (i <- 1 until 4)
      println("Iteration " + i)
  }
}