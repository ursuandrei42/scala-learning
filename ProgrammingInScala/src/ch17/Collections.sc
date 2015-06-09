package ch17

object Collections {
  val fiveInts = new Array[Int](5)                //> fiveInts  : Array[Int] = Array(0, 0, 0, 0, 0)
  val fiveToOne = Array(5, 4, 3, 2, 1)            //> fiveToOne  : Array[Int] = Array(5, 4, 3, 2, 1)

  val text = "See Spot run. Run, Spot. Run!"      //> text  : String = See Spot run. Run, Spot. Run!
  val wordsArray = text.split("[ !,.]+")          //> wordsArray  : Array[String] = Array(See, Spot, run, Run, Spot, Run)

  (1, "hello", Console)                           //> res0: (Int, String, Console.type) = (1,hello,scala.Console$@79b4d0f)

  def longestWord(words: Array[String]) = {
    var word = words(0)
    var idx = 0
    for (i <- 1 until words.length)
      if (words(i).length > word.length) {
        word = words(i)
        idx = i
      }
    (word, idx)
  }                                               //> longestWord: (words: Array[String])(String, Int)

  val longest = longestWord("The quick brown fox".split(" "))
                                                  //> longest  : (String, Int) = (quick,1)
  class Time {
    var hour = 12
    var minute = 0
  }

  var time = new Time()                           //> time  : ch17.Collections.Time = ch17.Collections$$anonfun$main$1$Time$1@13a5
                                                  //| 7a3b
  time.hour                                       //> res1: Int = 12
  time.hour = 10

  class Thermometer {
    var celsius: Float = _
    def fahrenheit = celsius * 9 / 5 + 32
    def fahrenheit_=(f: Float) {
      celsius = (f - 32) * 5 / 9
    }
    override def toString = fahrenheit + "F/" + celsius + "C"
  }
  
  val t = new Thermometer                         //> t  : ch17.Collections.Thermometer = 32.0F/0.0C
  t.celsius = 100
  t                                               //> res2: ch17.Collections.Thermometer = 212.0F/100.0C
  t.fahrenheit = -40
  t                                               //> res3: ch17.Collections.Thermometer = -40.0F/-40.0C
}