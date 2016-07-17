package P22

/** P22
  * (*) Create a list containing all integers within a given range.
  *
  *  Example
  *   scala> range(4, 9)
  *   res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */
object P22 {

  def main(args: Array[String]):Unit = {
    print(range(4,9))
  }

  def range(s: Int, e: Int): List[Int] = s to e toList

}


