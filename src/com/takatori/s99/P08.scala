package com.takatori.s99

/** P08
  * (**) Eliminate consecutive duplicates of list elements.
  * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  *
  *  Example
  *   scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  *   res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
object P08 {
  def main(args: Array[String]):Unit = {
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e,'e)))
  }


  def compress[T](list: List[T]): List[T] =
    list.foldRight(List[T]()) { (h,r) =>
    if (r.isEmpty || r.head != h) h :: r
    else r
  }
}