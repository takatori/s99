package P14

/** P14
  *  (*) Duplicate the elements of a list.
  *
  *  Example
  *   scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  *   res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  */
object P14 {
  def main(args: Array[String]):Unit = {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }

  def duplicate[T](list: List[T]): List[T] = list.foldRight(List[T]())((h, acc) => h :: h :: acc)
}