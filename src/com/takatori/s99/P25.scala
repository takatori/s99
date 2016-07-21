package com.takatori.s99

/** P25
  * (*) Generate a random permutation of the elements of a list.
  * Hint: Use the solution of problem P23.
  *
  *  Example
  *   scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
  *   res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  */
object P25 {
  def main(args: Array[String]):Unit = {
    println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
  }

  def randomPermute[T](list: List[T]): List[T] = {
    import scala.util.Random
    Random.shuffle(list)
  }
}