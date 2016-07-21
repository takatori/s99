package com.takatori.s99

/** (*) Find the last but one element of a list.
  *
  *  Example
  *   scala > penultimate(List(1,1,2,3,5,8))
  *   res0: Int = 5
  */
object P02 {
  def main(args: Array[String]): Unit = {
    println(penultimate(List(1,2,3)))
  }

  def penultimate[T](list: List[T]): T = list match {
    case x::xs => list.reverse(1)
    case _ => sys.error("error")
  }
}