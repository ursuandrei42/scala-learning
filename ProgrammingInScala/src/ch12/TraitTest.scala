package ch12

object TraitTest {
  def main(args: Array[String]): Unit = {
    val frog = new Frog
    println(frog.philosophize)

    val phil: Philosophical = frog

    class MyQueue extends BasicIntQueue with Doubling
    val queue = new MyQueue
    queue.put(10)
    println(queue.get())

    val queue2 = (new BasicIntQueue with Incrementing with Filtering)
  }
}