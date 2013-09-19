  /**
   * Benjamin Shyong
   * Authored September 18, 2013
   * hello@benshyong.com
   */

package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c==0 || r==0 || c==r) 1
    else pascal(c-1,r-1)+pascal(c,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def makeNegativesZero(i: Int): Int = {
      if(i<0) 0
      else i
    }
	def inter(t: List[Char], count: Int): Boolean = {
	  if(t.head=='(') checkCount(t.tail, makeNegativesZero(count)+1)
	  else {
	    if (t.head==')') checkCount(t.tail, count-1)
	    else checkCount(t.tail, count)
	  }
	}
	def checkCount(string: List[Char], parenC: Int): Boolean = {
	  if (string.isEmpty) parenC == 0
	  else inter(string, parenC)
	}
	checkCount(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def counter(money:Int, coins:List[Int], count: Int): Int = {
      if (money%coins.head == 0) numWays(money, coins.tail, count+1)
      else numWays(money, coins.tail, count)
    }
    def numWays(money: Int, coins: List[Int], count: Int): Int = {
      if (coins.isEmpty) count
      else counter(money, coins, count)
    }
    if (coins.isEmpty) 0
    else numWays(money, coins, 0)
  }
}
