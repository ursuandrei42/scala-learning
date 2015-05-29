package ch10

class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts

}

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width = s.length
  override def height = 1
}

//Defining contents as a parametric field.
class ArrayElement2(val contents: Array[String]) extends Element

class Cat {
  val dangerous = false
}
class Tiger(
  override val dangerous: Boolean,
  private var age: Int) extends Cat