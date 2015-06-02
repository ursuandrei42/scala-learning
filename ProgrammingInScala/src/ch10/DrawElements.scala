package ch10

object DrawElements {

  def main(args: Array[String]): Unit = {
    println(new ArrayElement(Array("one", "two")) beside
      new ArrayElement(Array("one")))

  }
}