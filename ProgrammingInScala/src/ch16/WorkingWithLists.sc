package ch16

object WorkingWithLists {

  List(1, 2, 3) map (_ + 1)                       //> res0: List[Int] = List(2, 3, 4)

  val words = List("the", "quick", "brown", "fox")//> words  : List[String] = List(the, quick, brown, fox)

  words map (_.length)                            //> res1: List[Int] = List(3, 5, 5, 3)

  words map (_.toList.reverse.mkString)           //> res2: List[String] = List(eht, kciuq, nworb, xof)

  "the".toList                                    //> res3: List[Char] = List(t, h, e)

  words map (_.toList)                            //> res4: List[List[Char]] = List(List(t, h, e), List(q, u, i, c, k), List(b, r,
                                                  //|  o, w, n), List(f, o, x))

  words flatMap (_.toList)                        //> res5: List[Char] = List(t, h, e, q, u, i, c, k, b, r, o, w, n, f, o, x)

  List.range(1, 5) flatMap (
    i => List.range(1, i) map (j => (i, j)))      //> res6: List[(Int, Int)] = List((2,1), (3,1), (3,2), (4,1), (4,2), (4,3))

  var sum = 0                                     //> sum  : Int = 0
  List(1, 2, 3, 4, 5) foreach (sum += _)
  sum                                             //> res7: Int = 15

  List(1, 2, 3, 4, 5) filter (_ % 2 == 0)         //> res8: List[Int] = List(2, 4)

  words filter (_.length == 3)                    //> res9: List[String] = List(the, fox)

  List(1, 2, 3, 4, 5) partition (_ % 2 == 0)      //> res10: (List[Int], List[Int]) = (List(2, 4),List(1, 3, 5))

  List(1, 2, 3, 4, 5) find (_ % 2 == 0)           //> res11: Option[Int] = Some(2)

  List(1, 2, 3, 4, 5) find (_ <= 0)               //> res12: Option[Int] = None

  List(1, 2, 3, -4, 5) takeWhile (_ > 0)          //> res13: List[Int] = List(1, 2, 3)
  List(1, 2, 3, 4, 5) filter (_ > 0)              //> res14: List[Int] = List(1, 2, 3, 4, 5)

  words dropWhile (_ startsWith "t")              //> res15: List[String] = List(quick, brown, fox)

  List(1, 2, 3, -4, 5) span (_ > 0)               //> res16: (List[Int], List[Int]) = (List(1, 2, 3),List(-4, 5))

  def hasZeroRow(m: List[List[Int]]) =
    m exists (row => row forall (_ == 0))         //> hasZeroRow: (m: List[List[Int]])Boolean

  val diag3 =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1))                              //> diag3  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //| 

  hasZeroRow(diag3)                               //> res17: Boolean = false

  List(1, 3, 4, 2, 6) sortWith (_ < _)            //> res18: List[Int] = List(1, 2, 3, 4, 6)

  words sortWith (_.length > _.length)            //> res19: List[String] = List(quick, brown, the, fox)
  
  List.range(1, 5)                                //> res20: List[Int] = List(1, 2, 3, 4)
}