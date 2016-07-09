package P15

/** P15
  * (**) Duplicate the elements of a list a given number of times.
  *
  *  Example
  *     scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  *     res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  */
object P15 {
  def main(args: Array[String]):Unit = {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }

  def duplicateN[T](n: Int, list: List[T]): List[T] = list.flatMap(x => List.fill(n)(x))
}