package ch17

object Collections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  val fiveInts = new Array[Int](5);System.out.println("""fiveInts  : Array[Int] = """ + $show(fiveInts ));$skip(39); 
  val fiveToOne = Array(5, 4, 3, 2, 1);System.out.println("""fiveToOne  : Array[Int] = """ + $show(fiveToOne ));$skip(47); 

  val text = "See Spot run. Run, Spot. Run!";System.out.println("""text  : String = """ + $show(text ));$skip(41); 
  val wordsArray = text.split("[ !,.]+");System.out.println("""wordsArray  : Array[String] = """ + $show(wordsArray ));$skip(26); val res$0 = 

  (1, "hello", Console);System.out.println("""res0: (Int, String, Console.type) = """ + $show(res$0));$skip(233); 

  def longestWord(words: Array[String]) = {
    var word = words(0)
    var idx = 0
    for (i <- 1 until words.length)
      if (words(i).length > word.length) {
        word = words(i)
        idx = i
      }
    (word, idx)
  };System.out.println("""longestWord: (words: Array[String])(String, Int)""");$skip(64); 

  val longest = longestWord("The quick brown fox".split(" "))
  class Time {
    var hour = 12
    var minute = 0
  };System.out.println("""longest  : (String, Int) = """ + $show(longest ));$skip(82); 

  var time = new Time();System.out.println("""time  : ch17.Collections.Time = """ + $show(time ));$skip(12); val res$1 = 
  time.hour;System.out.println("""res1: Int = """ + $show(res$1));$skip(17); 
  time.hour = 10

  class Thermometer {
    var celsius: Float = _
    def fahrenheit = celsius * 9 / 5 + 32
    def fahrenheit_=(f: Float) {
      celsius = (f - 32) * 5 / 9
    }
    override def toString = fahrenheit + "F/" + celsius + "C"
  };$skip(260); 
  
  val t = new Thermometer;System.out.println("""t  : ch17.Collections.Thermometer = """ + $show(t ));$skip(18); 
  t.celsius = 100;$skip(4); val res$2 = 
  t;System.out.println("""res2: ch17.Collections.Thermometer = """ + $show(res$2));$skip(21); 
  t.fahrenheit = -40;$skip(4); val res$3 = 
  t;System.out.println("""res3: ch17.Collections.Thermometer = """ + $show(res$3))}
}
