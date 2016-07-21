package com.takatori.s99

/** P13
  * (**) Run-length encoding of a list (direct solution).
  * Implement the so-called run-length encoding data compression method
  * directly. I.e. don't use other methods you've written (like P09's pack);
  * do all the work directly.
  *
  *  Example:
  *   scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  *   res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */
object P13 {
  def main(args: Array[String]):Unit = {
      println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
      println(encodeDirectA(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    list.foldRight(List[(Int, T)]()) { (h, acc) =>
      if (acc.isEmpty) List((1, h))
      else if (acc.head._2 != h) (1, h) :: acc
      else (acc.head._1 + 1, h) :: acc.tail
    }
  }

  def encodeDirectA[T](ls: List[T]): List[(Int, T)] = {
    if (ls.isEmpty) Nil
    else {
      val (packed, next) = ls span { _ == ls.head }
      (packed.length, packed.head) :: encodeDirectA(next)
    }
  }
}