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
	
	

/**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
  def intersect(s: Set, t: Set): Set = {
    (x: Int) => s(x) && t(x)
  }                                               //> intersect: (s: Int => Boolean, t: Int => Boolean)Int => Boolean

  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set = {
    (x: Int) => s(x) && !t(x)
  }                                               //> diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean

  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set = {
    intersect(s, p)
  }                                               //> filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000                                //> bound  : Int = 1000

  /**
   * Returns whether all bounded integers within `s` satisfy `p`.
   */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (contains(s,a) && a<=bound) p(a) && iter(a+1)
      else if (a>bound) true
      else iter(a+1)
    }
    iter(bound * -1)
  }                                               //> forall: (s: Int => Boolean, p: Int => Boolean)Boolean
  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (contains(s,a) && a<=bound) p(a) || iter(a+1)
      else if (a>bound) false
      else iter(a+1)
    }
    iter(bound * -1)
  }                                               //> exists: (s: Int => Boolean, p: Int => Boolean)Boolean

  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = {
    (x: Int) => s(f(x))
  }                                               //> map: (s: Int => Boolean, f: Int => Int)Int => Boolean


forall(Set(1,2,3,4), (x: Int) => x<4)             //> res6: Boolean = false

exists(Set(1,2,6), (x: Int) => x>6)               //> res7: Boolean = false









	
}