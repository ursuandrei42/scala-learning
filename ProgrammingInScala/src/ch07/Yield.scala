package ch07

object Yield {
  def main(args: Array[String]): Unit = {
    val args = List("one","two","three")
    
    val res = for (a <- args) yield a.toUpperCase
    
    println("Arguments: " + res.toString)
  }
}