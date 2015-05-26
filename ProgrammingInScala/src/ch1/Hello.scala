object Hello {

  def main(args: Array[String]): Unit = {

    def appendSpace(x: String): String = x + " "

    var i = 0
    while (i < args.length) {
      if (i != 0) {
        print(" ")
      }
      print(args(i));
      i += 1
    }
    println();

    args.foreach(arg => print(arg + " "))
    args.foreach(arg => print(appendSpace(arg)))

    println()
    val gs = new Array[String](3)
    gs(0) = "Hello"
    gs(1) = ", "
    gs(2) = "world!\n"
    for (i <- 0 to 2)
      print(gs(i))

    val gs2: Array[String] = new Array[String](3)
    val num = Array("zero", "one", "two")
    println(num)
    val oneTwoTree = List(1, 2, 3)
    println(oneTwoTree)
    val one23 = 1 :: 2 :: 3 :: Nil
    println(one23)
    val twoThree = List(2, 3)
    val oneTwo3 = twoThree ::: oneTwoTree
    println(oneTwo3)

    val thrill = "Will" :: "fill" :: "until" :: Nil
    println(thrill.count(s => s.length == 4))

    print("thrill.forall(s=>s.endsWith(\"l\"))=")
    val t = thrill.forall(s => s.endsWith("l"))
    println(t)

    val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)

    var jetSet = Set("Boeing", "Airbus");
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))

    import scala.collection.mutable.Map
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))

    def printArgs(args: Array[String]): Unit = {
      var i = 0
      while (i < args.length) {
        println(args(i))
        i += 1
      }
    }
    printArgs(args)

    def printArgsF(args: Array[String]): Unit = {
      args.foreach(println)
    }

    printArgsF(args)

    def formatArgs(args: Array[String]) = args.mkString("\n")
    def formatArgs2(args: List[String]) = args.mkString("\n")
    def formatArgs3(args: Map[Int,String]) = args.mkString("\n")

    println(formatArgs(args))
    println(formatArgs3(treasureMap))
    println(formatArgs2(thrill))

    import scala.io.Source

    if (args.length > 0) {
      for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
    } else
      Console.err.println("Please enter filename")

    val lines = Source.fromFile(args(0)).getLines().toList
    def widthOfLength(s: String) = s.length.toString.length
    var maxWidth = 0
    for (line <- lines)
      maxWidth = maxWidth.max(widthOfLength(line))

    println("maxWidth=" + maxWidth)

    //The reduceLeft method applies the passed function to the first two elements
    //in lines, then applies it to the result of the first application and the next
    //element in lines, and so on, all the way through the list.
    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b)

    println("longestLine=" + longestLine)
    println("maxWidth=" + widthOfLength(longestLine))
  }
}