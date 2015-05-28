package ch8
import scala.io.Source

class LocalFunctions {

  def processFile(filename: String, width: Int) {
    def processLine(line: String) {
      if (line.length > width)  //local functions can access the parameters of their enclosing function.
        println(filename + ": " + line)
    }
    val source = Source.fromFile(filename)
    for (
      line <- source.
        getLines()
    ) processLine(line)
  }
  
}