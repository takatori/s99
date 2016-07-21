package com.takatori.s99

import scala.util.Random

/** P24
  *  Lotto: Draw N different random numbers from the set 1..M.
  *
  *   Example
  *     scala> lotto(6, 49)
  *     res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  */
object P24 {
  def main(args: Array[String]):Unit = {
    println(lotto(6, 49))
  }

  def lotto(n: Int, limit: Int): List[Int] = Random.shuffle((1 to limit).toList).take(n)
}