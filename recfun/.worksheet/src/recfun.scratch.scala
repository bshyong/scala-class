package recfun

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(433); 
 def countChange(money: Int, coins: List[Int]): Int = {
 	def counter(money:Int, coins:List[Int], count: Int): Int = {
 		if (money%coins.head == 0) looper(money, coins.tail, count+1)
 		else looper(money, coins.tail, count)
 	}
 	def looper(money:Int, coins: List[Int], count: Int): Int = {
 		if (coins.isEmpty) count
 		else counter(money%coins.head, coins, count)
 	}
 	looper(money, coins, 0)
 };System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(28); val res$0 = 
 
 countChange(4,List(1,2));System.out.println("""res0: Int = """ + $show(res$0));$skip(47); val res$1 = 
 countChange(300,List(5,10,20,50,100,200,500));System.out.println("""res1: Int = """ + $show(res$1))}
}
