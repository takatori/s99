package P20

/** P20
  * (*) Remove the Kth element from a list.
  *  Return the list and the removed element in a Tuple.
  *  Elements are numbered from 0.
  *
  *  Example
  *    scala> removeAt(1, List('a, 'b, 'c, 'd))
  *    res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */
object P20 {
  def main(args: Array[String]):Unit = {
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }

  def removeAt[T](n: Int, list: List[T]): (List[T], T) = {
      if(n > 0) {
        val x = removeAt(n-1, list.tail)
        (list.head :: x._1, x._2)
      }
      else (list.tail, list.head)
  }

}