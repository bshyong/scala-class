package funsets

object scratch {
  type Set = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(182); 

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(145); 

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = {
    //(x: Int) => x == elem
    Set(elem)
  };System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(190); 

  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = {
    (x: Int) => s(x) || t(x)
  };System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(14); val res$0 = 
  
  Set(1,3);System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0));$skip(18); val res$1 = 
  singletonSet(3);System.out.println("""res1: Int => Boolean = """ + $show(res$1));$skip(24); val res$2 = 
  contains(Set(1,2), 2);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(30); val res$3 = 
  union(Set(1,2,3), Set(3,4));System.out.println("""res3: Int => Boolean = """ + $show(res$3));$skip(41); val res$4 = 

	contains(union(Set(1,2,3),Set(3,4)),2);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(32); val res$5 = 

	union(Set(1,2,3),Set(3,4))(5);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(201); 
	
	

/**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
  def intersect(s: Set, t: Set): Set = {
    (x: Int) => s(x) && t(x)
  };System.out.println("""intersect: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(191); 

  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set = {
    (x: Int) => s(x) && !t(x)
  };System.out.println("""diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(138); 

  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set = {
    intersect(s, p)
  };System.out.println("""filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean""");$skip(88); 

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000;System.out.println("""bound  : Int = """ + $show(bound ));$skip(302); 

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
  };System.out.println("""forall: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(324); 
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
  };System.out.println("""exists: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(154); 

  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = {
    (x: Int) => s(f(x))
  };System.out.println("""map: (s: Int => Boolean, f: Int => Int)Int => Boolean""");$skip(40); val res$6 = 


forall(Set(1,2,3,4), (x: Int) => x<4);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(37); val res$7 = 

exists(Set(1,2,6), (x: Int) => x>6);System.out.println("""res7: Boolean = """ + $show(res$7))}









	
}
