package ch16

object Lists {
  def main(args: Array[String]): Unit = {
    val fruit = List("apples", "oranges", "pears")
    val nums = List(1, 2, 3, 4)
    val diag3 =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1))
    val empty = List()

    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums1 = 1 :: (2 :: (3 :: (4 :: Nil)))
    val diag32 = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil
    val empty1 = Nil

    println(fruit.head)
    println(fruit.tail)
    println(fruit.isEmpty)

    val List(a, b, c) = fruit
    val a1 :: b2 :: rest = fruit
    println(a1)
    println(b2)
    println(rest)

    println(List(1, 2) ::: List(3, 4, 5))

    def append[T](xs: List[T], ys: List[T]): List[T] =
      xs match {
        case List()   => ys
        case x :: xs1 => x :: append(xs1, ys)
      }

    println(append(List(1, 2), List(3, 4, 5)))

    println(List(1, 2, 3).length)

    val abcde = List('a', 'b', 'c', 'd', 'e')
    println(abcde.last)
    println(abcde.reverse)

    def rev[T](xs: List[T]): List[T] = xs match {
      case List()   => xs
      case x :: xs1 => rev(xs1) ::: List(x)
    }

    println(abcde take 2)
    println(abcde drop 2)
    println(abcde splitAt 2)
    println(abcde apply 2)
    println(abcde(2))

    println(List(List(1, 2), List(3), List(), List(4, 5)).flatten)

    println(fruit.map(_.toCharArray).flatten)

    println(abcde.indices zip abcde)

    println(abcde mkString ("[", ",", "]"))
    println(abcde mkString "")
    println(abcde.mkString)
    println(abcde mkString ("List(", ",", ")"))

    val arr = abcde.toArray
    arr.toList

    //insertion sort
    def isort1(xs: List[Int]): List[Int] =
      if (xs.isEmpty) Nil
      else insert1(xs.head, isort1(xs.tail))

    def insert1(x: Int, xs: List[Int]): List[Int] =
      if (xs.isEmpty || x <= xs.head) x :: xs
      else xs.head :: insert1(x, xs.tail)
      
    isort1(List(1,5,2,3))

    //insert sort with patterns
    def isort2(xs: List[Int]): List[Int] = xs match {
      case List()   => List()
      case x :: xs1 => insert2(x, isort2(xs1))
    }
    def insert2(x: Int, xs: List[Int]): List[Int] = xs match {
      case List() => List(x)
      case y :: ys => if (x <= y) x :: xs
      else y :: insert2(x, ys)
    }

    //merge sort
    def msort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs, ys) match {
          case (Nil, _) => ys
          case (_, Nil) => xs
          case (x :: xs1, y :: ys1) =>
            if (less(x, y)) x :: merge(xs1, ys)
            else y :: merge(xs, ys1)
        }
      val n = xs.length / 2
      if (n == 0) xs
      else {
        val (ys, zs) = xs splitAt n
        merge(msort(less)(ys), msort(less)(zs))
      }
    }
  }

}