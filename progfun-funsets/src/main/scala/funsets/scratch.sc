package funsets

object scratch {
  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: Int => Boolean, elem: Int)Boolean

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = {
    //(x: Int) => x == elem
    Set(elem)
  }                                               //> singletonSet: (elem: Int)Int => Boolean

  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = {
    (x: Int) => s(x) || t(x)
  }                                               //> union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean
  
  Set(1,3)                                        //> res0: scala.collection.immutable.Set[Int] = Set(1, 3)
  singletonSet(3)                                 //> res1: Int => Boolean = Set(3)
  contains(Set(1,2), 2)                           //> res2: Boolean = true
  union(Set(1,2,3), Set(3,4))                     //> res3: Int => Boolean = <function1>

	contains(union(Set(1,2,3),Set(3,4)),2)    //> res4: Boolean = true

	union(Set(1,2,3),Set(3,4))(5)             //> res5: Boolean = false
	
}