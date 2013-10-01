package week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,2);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(2,2);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(18); val res$2 = 
  x.sub(y).sub(z);System.out.println("""res2: week3.Rational = """ + $show(res$2))}
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
