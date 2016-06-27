package P03

/** P03
  * (*) Find the last but one element of a list.
  *
  *  Example
  *    scala> nth(2, List(1, 1, 2, 3, 5, 8))
  *    res0: Int = 6
  */
object P03 {
  def main(args: Array[String]): Unit = {
    println(nth(2, List(1, 1, 2, 3, 5, 8)))
  }

  def nth[T](n: Int, list: List[T]): T = list match {
    case x::Nil => list(0)
    case x::xs => list(n)
    case _ => sys.error("error")
  }

  def nthA[T](index: Int, list: List[T]): T = list match {
    case x::_ if index == 0 => x
    case _::xs if index > 0 => nth(index - 1, xs)
    case _ => sys.error("")
  }
}