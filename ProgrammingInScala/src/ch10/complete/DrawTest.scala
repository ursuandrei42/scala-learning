package ch10.complete
import Element.elem
object DrawTest {
  def main(args: Array[String]): Unit = {
    print(elem("andrei") above (elem("alex") beside elem(Array("a","b"))))
  }
}