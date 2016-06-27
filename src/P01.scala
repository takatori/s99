package P01

/**  P01
  * (*) Find the latest element of a list.
  *
  * Example
  *  scala > last(List(1,1,2,3,5,8))
  *  res0: Int = 8
  */
object P01 {
  def main(args: Array[String]): Unit = {
    println(last(List(1, 2, 3)))
  }

  def last[T](list: List[T]): T = {
    list match {
      case x::Nil => return x
      case _ => last(list.tail)
    }
  }
}

