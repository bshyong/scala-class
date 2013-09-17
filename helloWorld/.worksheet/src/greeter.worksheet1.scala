package greeter

object worksheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(11); 
	val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(30); 
	def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(13); val res$0 = 
	increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(22); 
	val xs = List(1,2,3);System.out.println("""xs  : List[Int] = """ + $show(xs ));$skip(9); val res$1 = 
	xs.head;System.out.println("""res1: Int = """ + $show(res$1));$skip(9); val res$2 = 
	xs.tail;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(12); val res$3 = 
	xs.isEmpty;System.out.println("""res3: Boolean = """ + $show(res$3))}
}
