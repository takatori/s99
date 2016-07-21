package com.takatori.s99

/** P05
  * (*) Reverse a list.
  *
  *  Example
  *    scala> reverse(List(1,1,2,3,5,8))
  *    res0: List[Int] = List(8,5,3,2,1,1)
  */
object P05 {
  def main(args: Array[String]): Unit = {
    println(reverse(List(1,1,2,3,5,8)))
  }

  def reverse[T](list: List[T]): List[T] = list match {
    case x::Nil => List(x)
    case x::xs => reverse(xs):::List(x)
    case _ => sys.error("")
  }
}