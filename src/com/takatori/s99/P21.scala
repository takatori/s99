package com.takatori.s99

/** P21
  * (*) Insert an element at a given position into a list.
  *
  *  Example
  *    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  *    res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */
object P21 {
  def main(args: Array[String]):Unit = {
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
  }

  def insertAt[T](e: T, n: Int, list: List[T]):List[T] = {
    if(n > 0) list.head :: insertAt(e, n-1, list.tail)
    else e :: list
  }

  def insertAtA[T](e: T, n: Int, list: List[T]):List[T] = {
    list.splitAt(n) match { case (pre, post) => pre ::: e :: post}
  }
}
