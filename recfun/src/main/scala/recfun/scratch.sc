package recfun

object scratch {
 def countChange(money: Int, coins: List[Int]): Int = {
	if (money==0) 1
  else if (coins.isEmpty || money < 0) 0
  else countChange(money, coins.tail) + countChange(money-coins.head, coins)
 }                                                //> countChange: (money: Int, coins: List[Int])Int
 
 countChange(4,List(1,2))                         //> res0: Int = 3
 countChange(300,List(5,10,20,50,100,200,500))    //> res1: Int = 1022
}