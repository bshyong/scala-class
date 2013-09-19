package recfun

object scratch {
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
 }                                                //> countChange: (money: Int, coins: List[Int])Int
 
 countChange(4,List(1,2))                         //> res0: Int = 2
 countChange(300,List(5,10,20,50,100,200,500))    //> res1: Int = 7
}