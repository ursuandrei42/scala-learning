package ch10

abstract class Element {
  def contents: Array[String] //abstract method
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length

  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)

  def beside(that: Element): Element =
    new ArrayElement(
      for (
        //the two arrays this.contents and that.contents are transformed
        //into an array of pairs (as Tuple2s are called) using the zip operator. The
        //zip method picks corresponding elements in its two arguments and forms
        //an array of pairs.
        //For instance, this expression:
        //Array(1, 2, 3) zip Array("a", "b")
        //will evaluate to:
        //Array((1, "a"), (2, "b"))
        (line1, line2) <- this.
          contents zip that.contents
      ) yield line1 + line2)

  override def toString = contents mkString "\n"

  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)
  def elem(chr: Char, width: Int, height: Int): Element =
    new UniformElement(chr, width, height)
  def elem(line: String): Element =
    new LineElement(line)
}