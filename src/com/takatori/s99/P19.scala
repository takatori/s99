package com.takatori.s99

/** P19
  * (**) Rotate a list N places to the left.
  *
  *  Example
  *   scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  *   res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  *
  *   scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  *   res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  */
object P19 {
  def main(args: Array[String]):Unit = {
    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def rotate[T](n: Int, list: List[T]): List[T] = {
    val i = if(n < 0) list.length + n else n
    val l = list.splitAt(i)
    l._2 ::: l._1
  }

  def rotateA[T](n: Int, ls: List[T]): List[T] = {
    val nBounded = if(ls.isEmpty) 0 else n % ls.length
    if (nBounded > 0) rotateA(nBounded + ls.length, ls)
    else (ls drop nBounded) ::: (ls take nBounded)
  }
}