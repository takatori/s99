package P09

/** P09
  * (**) Pack consecutive duplicates of list elements into sublists.
  * If a list contains repeated elements they should be placed in separate sublists.
  *
  *  Example:
  *    scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  *    res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
object P09 {
  def main(args: Array[String]): Unit = {
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def pack[T](list: List[T]): List[List[T]] = {
    list.foldRight(List[List[T]]()) { (h,r) =>
      if (r.isEmpty) List(List(h))
      else if (r.head.head != h) List(h) :: r
      else (h :: r.head) :: r.tail
    }
  }
}