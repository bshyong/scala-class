package week3

object rationals {
  val x = new Rational(1,2)                       //> x  : week3.Rational = 1/2
  val y = new Rational(2,2)                       //> y  : week3.Rational = 1/1
  val z = new Rational(3,2)                       //> z  : week3.Rational = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 2
  x.sub(y).sub(z)                                 //> res2: week3.Rational = -2/1
  x.max(z)                                        //> res3: week3.Rational = 3/2
}

class Rational(x: Int, y: Int){
	require(y != 0, "denominator must be positive")

	private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a % b)
	private val g = gcd(x,y)
	
	def numer = x / g
	def denom = y / g
	
	def add(that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
			
	def neg: Rational = new Rational(-numer, denom)
	
	def sub(that: Rational) = add(that.neg)
	
	def less(that: Rational) = this.numer * that.denom < that.numer * this.denom
	
	def max(that: Rational) = if (this.less(that)) that else this
	
	override def toString = numer + "/" + denom
}