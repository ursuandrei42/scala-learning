package ch14

import org.scalatest.junit.AssertionsForJUnit
import scala.collection.mutable.ListBuffer
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import ch10.complete.Element.elem
class ElementTest extends AssertionsForJUnit {

  @Test def verifyEasy() { // Uses JUnit-style assertions
    val ele = elem('x', 2, 3)
    assertEquals(2, ele.width)
    assertEquals(3, ele.height)
  }
}