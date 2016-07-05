package  P11

/** P11
  * (*) Modified run-length encoding.
  *  Modify the result of problem P10 in such a way that
  *  if an element has no duplicates it is simply copied
  *  into the result list. Only elements with duplicates
  *  are transferred as (N, E) terms.
  *
  *  Example:
  *   scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  *   res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  *
  */
object P11 {
  def main(args: Array[String]):Unit = {
      println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encodeModified[T](list: List[T]):List[_] = {

    def encode[T](list: List[T]): List[(Int, T)] = {
      list.foldRight(List[(Int, T)]()) { (h, r) =>
        if (r.isEmpty) List((1, h))
        else if (r.head._2 != h) (1, h) :: r
        else (r.head._1 + 1, h) :: r.tail
      }
    }

    encode(list).map(x => if(x._1 == 1) x._2 else x)
  }
}