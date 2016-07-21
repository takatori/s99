package com.takatori.s99

/** P07
  * (**) Flatten a nested list structure.
  *
  *  Example
  *   scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  *   res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */
object P07 {
  def main(args: Array[String]): Unit = {
    println(flatten(List(List(1,1), 2, List(3, List(5, 8)))))
  }

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ms:List[_] => flatten(ms)
    case e => List(e)
  }

}