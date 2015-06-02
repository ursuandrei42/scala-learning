package ch10

class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts

}

//Defining contents as a parametric field.
class ArrayElement2(val contents: Array[String]) extends Element

class Cat {
  val dangerous = false
}
class Tiger(
  override val dangerous: Boolean,
  private var age: Int) extends Cat