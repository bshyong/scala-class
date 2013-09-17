package greeter

object worksheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	val x = 1                                 //> x  : Int = 1
	def increase(i: Int) = i + 1              //> increase: (i: Int)Int
	increase(x)                               //> res0: Int = 2
	val xs = List(1,2,3)                      //> xs  : List[Int] = List(1, 2, 3)
	xs.head                                   //> res1: Int = 1
	xs.tail                                   //> res2: List[Int] = List(2, 3)
	xs.isEmpty                                //> res3: Boolean = false
}