package P16

/** P16
  * (**) Drop every Nth element from a list.
  *
  *  Example
  *   scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  *   res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */
object P16 {
  def main(args: Array[String]):Unit = {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  // 問題読み間違い
  // nの倍数ごとに要素を削除しなければならない
  def drop[T](n: Int, list: List[T]): List[T] = {
    if(n == 1) list.tail
    else list.head :: drop(n-1, list.tail)
  }

  // 正解
  def dropA[T](n: Int, list:List[T]):List[T] = {
    list.zipWithIndex filter { v => (v._2 + 1) % n != 0 } map {_._1}
  }

}