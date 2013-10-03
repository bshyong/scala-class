package week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,2);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(2,2);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(12); val res$2 = 
  x - y - z;System.out.println("""res2: week3.Rational = """ + $show(res$2));$skip(10); val res$3 = 
  x max z;System.out.println("""res3: week3.Rational = """ + $show(res$3));$skip(18); val res$4 = 
  new Rational(2);System.out.println("""res4: week3.Rational = """ + $show(res$4))}

}

class Rational(x: Int, y: Int){
	require(y != 0, "denominator must be positive")
	
	def this(x: Int) = this(x, 1)

	private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a % b)
	private val g = gcd(x,y)
	
	def numer = x / g
	def denom = y / g
	
	def + (that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
			
	def unary_- : Rational = new Rational(-numer, denom)
	
	def - (that: Rational) = this + -that
	
	def < (that: Rational) = this.numer * that.denom < that.numer * this.denom
	
	def max(that: Rational) = if (this < that) that else this
	
	override def toString = numer + "/" + denom
}
