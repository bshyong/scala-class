package week3

object rationals {
  val x = new Rational(1,2)                       //> x  : week3.Rational = 1/2
  val y = new Rational(2,2)                       //> y  : week3.Rational = 2/2
  val z = new Rational(3,2)                       //> z  : week3.Rational = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 2
  x.sub(y).sub(z)                                 //> res2: week3.Rational = -16/8
}

class Rational(x: Int, y: Int){
	def numer = x
	def denom = y
	def add(that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
	def neg: Rational = new Rational(-numer, denom)
	def sub(that: Rational) = add(that.neg)
	
	override def toString = numer + "/" + denom
}