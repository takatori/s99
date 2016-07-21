package com.takatori.s99

import scala.util.Random

/** P23
  * (**) Extract a given number of randomly selected elements from a list.
  *
  *  Example
  *   scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  *   res0: List[Symbol] = List('e, 'd, 'a)
  */
object P23 {
  def main(args:Array[String]): Unit = {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }

  def randomSelect[T](n: Int, list: List[T]): List[T] = Random.shuffle(list).take(3)
}