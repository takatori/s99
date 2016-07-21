package com.takatori.s99

/** P10
  * (*) Run-length encoding of a list.
  *  Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  *
  *  Example
  *   scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  *   res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */
object P10 {
  def main(args: Array[String]):Unit = {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encode[T](list: List[T]):List[(Int, T)] = {

    list.foldRight(List[(Int, T)]()) { (h,r) =>
          if (r.isEmpty) List((1,h))
          else if (r.head._2 != h) (1,h) :: r
          else (r.head._1 + 1, h) :: r.tail
    }

  }
}