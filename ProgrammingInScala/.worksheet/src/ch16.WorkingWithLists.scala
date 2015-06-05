package ch16

object WorkingWithLists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); val res$0 = 

  List(1, 2, 3) map (_ + 1);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(53); 

  val words = List("the", "quick", "brown", "fox");System.out.println("""words  : List[String] = """ + $show(words ));$skip(25); val res$1 = 

  words map (_.length);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(42); val res$2 = 

  words map (_.toList.reverse.mkString);System.out.println("""res2: List[String] = """ + $show(res$2));$skip(17); val res$3 = 

  "the".toList;System.out.println("""res3: List[Char] = """ + $show(res$3));$skip(25); val res$4 = 

  words map (_.toList);System.out.println("""res4: List[List[Char]] = """ + $show(res$4));$skip(29); val res$5 = 

  words flatMap (_.toList);System.out.println("""res5: List[Char] = """ + $show(res$5));$skip(76); val res$6 = 

  List.range(1, 5) flatMap (
    i => List.range(1, i) map (j => (i, j)));System.out.println("""res6: List[(Int, Int)] = """ + $show(res$6));$skip(16); 

  var sum = 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(41); 
  List(1, 2, 3, 4, 5) foreach (sum += _);$skip(6); val res$7 = 
  sum;System.out.println("""res7: Int = """ + $show(res$7));$skip(44); val res$8 = 

  List(1, 2, 3, 4, 5) filter (_ % 2 == 0);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(33); val res$9 = 

  words filter (_.length == 3);System.out.println("""res9: List[String] = """ + $show(res$9));$skip(47); val res$10 = 

  List(1, 2, 3, 4, 5) partition (_ % 2 == 0);System.out.println("""res10: (List[Int], List[Int]) = """ + $show(res$10));$skip(42); val res$11 = 

  List(1, 2, 3, 4, 5) find (_ % 2 == 0);System.out.println("""res11: Option[Int] = """ + $show(res$11));$skip(38); val res$12 = 

  List(1, 2, 3, 4, 5) find (_ <= 0);System.out.println("""res12: Option[Int] = """ + $show(res$12));$skip(43); val res$13 = 

  List(1, 2, 3, -4, 5) takeWhile (_ > 0);System.out.println("""res13: List[Int] = """ + $show(res$13));$skip(37); val res$14 = 
  List(1, 2, 3, 4, 5) filter (_ > 0);System.out.println("""res14: List[Int] = """ + $show(res$14));$skip(39); val res$15 = 

  words dropWhile (_ startsWith "t");System.out.println("""res15: List[String] = """ + $show(res$15));$skip(38); val res$16 = 

  List(1, 2, 3, -4, 5) span (_ > 0);System.out.println("""res16: (List[Int], List[Int]) = """ + $show(res$16));$skip(83); 

  def hasZeroRow(m: List[List[Int]]) =
    m exists (row => row forall (_ == 0));System.out.println("""hasZeroRow: (m: List[List[Int]])Boolean""");$skip(89); 

  val diag3 =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1));System.out.println("""diag3  : List[List[Int]] = """ + $show(diag3 ));$skip(22); val res$17 = 

  hasZeroRow(diag3);System.out.println("""res17: Boolean = """ + $show(res$17));$skip(41); val res$18 = 

  List(1, 3, 4, 2, 6) sortWith (_ < _);System.out.println("""res18: List[Int] = """ + $show(res$18));$skip(41); val res$19 = 

  words sortWith (_.length > _.length);System.out.println("""res19: List[String] = """ + $show(res$19));$skip(22); val res$20 = 
  
  List.range(1, 5);System.out.println("""res20: List[Int] = """ + $show(res$20))}
}
