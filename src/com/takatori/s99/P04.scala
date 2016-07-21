package com.takatori.s99

/** P04
  * (*) Find the number of elements of a list.
  *
  *  Example
  *   scala > length(List(1,1,2,3,5,8))
  *   res0: Int = 6
  */
object P04 {
  def main(args: Array[String]): Unit = {
    println(length(List(1,1,2,3,5,8)))
    println(length(List(1)))
    println(length(List()))
  }

  def length[T](list: List[T]): Int = list.foldLeft(0)((x, y) => x + 1)
}
