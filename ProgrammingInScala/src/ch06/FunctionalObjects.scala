package ch06

object FunctionalObjects {
  def main(args: Array[String]): Unit = {
  implicit def intToRational(x: Int) = new Rational(x)
  println(new Rational(1,2))
  val half = new Rational(1,2)
  val twoThirds = new Rational(2,3)
  println (half + twoThirds)
  println (half add twoThirds)
  println (half * twoThirds)
  
  println (new Rational(66, 42))
  
  println(2*half)
  }
}

class Rational(n:Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer:Int = n / g
  val denom:Int = d / g
  
  def this(n:Int) = this(n,1)//auxiliary constructor
  
  override def toString = numer + "/" + denom
  
  def +(that:Rational): Rational = 
    new Rational(
      numer*that.denom + that.numer*denom, 
      denom*that.denom
    )
  
  def +(i: Int): Rational =
    new Rational(numer + i * denom, denom)
  
  def -(that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  
  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)
  
  def add(that:Rational): Rational = this + that
  
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  
  def * (i: Int): Rational =
    new Rational(numer * i, denom)
  
  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  
  def / (i: Int): Rational =
    new Rational(numer, denom * i)
  
  private def gcd(a:Int, b:Int): Int =
    if (b == 0) a else gcd(b,a%b) 
  
}

