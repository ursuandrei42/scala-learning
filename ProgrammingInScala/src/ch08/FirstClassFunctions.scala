package ch08

object FirstClassFunctions {
  (x: Int) => x + 1
  
  def main(args: Array[String]): Unit = {
    var increase = (x: Int) => x + 1
    println(increase)
    println(increase(20));
    
    
    increase = (x: Int) => {
      println("We")
      println("are")
      println("here!")
      x + 1
    }
     println(increase(20));
     
     val someNumbers = List(11,10,5,0, 5, -10)
     someNumbers.foreach((x: Int) => println(x))
     
     someNumbers.filter((x: Int) => x > 0)
     someNumbers.filter((x) => x > 0)
     someNumbers.filter(x => x > 0)
     someNumbers.filter(_ > 0)
     
     val f = (_: Int) + (_: Int)
     
     someNumbers.foreach(x => println(x))
     someNumbers.foreach(println _)
  }
}