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

	union(Set(1,2,3),Set(3,4))(5);System.out.println("""res5: Boolean = """ + $show(res$5))}
	
}
