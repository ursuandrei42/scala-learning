package ch07

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

    for (file <- filesHere if file.getName.endsWith(".scala"))
      println(file)

    for (
      file <- filesHere if file.isFile if file.getName.endsWith(".scala")
    ) println(file)

    def fileLines(file: java.io.File) =
      scala.io.Source.fromFile(file).getLines().toList

    def grep(pattern: String) =
      for (
        file <- filesHere if file.getName.endsWith(".scala");
        line <- fileLines(file) if line.trim.matches(pattern)
      ) println(file + ": " + line.trim)
    println(grep(".*gcd.*"))

    def scalaFiles =
      for {
        file <- filesHere
        if file.getName.endsWith(".scala")
      } yield file

    println(scalaFiles.length)

    val n = 2
    val half =
      if (n % 2 == 0)
        n / 2
      else
        throw new RuntimeException("n must be even")

    import java.io.FileReader
    import java.io.FileNotFoundException
    import java.io.IOException
    try {
      val f = new FileReader("input.txt")
      // Use and close file
    } catch {
      case ex: FileNotFoundException => println("not found") // Handle missing file
      case ex: IOException           => // Handle other I/O error
    }

    import java.io.FileReader
    val file = new FileReader("input.txt")
    try {
      // Use the file
    } finally {
      file.close() // Be sure to close the file
      println("file closed")
    }
  }
}