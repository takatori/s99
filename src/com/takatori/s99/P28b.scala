package com.takatori.s99

/** P28b
  * (**) Sorting a list of lists according to length of sublists.
  *  b) Again, we suppose that a list contains elements that are lists
  *     themselves. But this time the objective is to sort the elements
  *     according to their length frequency; i.e. in the default, sorting
  *     is done ascendingly, lists with rare lengths are placed, others
  *     with a more frequent length come later.
  *
  *  Example
  *   scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
  *   res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
  *
  *   Note that in the above example, the first two lists in the result
  *   have length 4 and 1 and both lengths appear just once.
  *   The third and fourth lists have length 3 and there are two list
  *   of this length. Finally, the last three lists have length 2.
  *   This is the most frequent length.
  */
object P28b {
  def main(args: Array[String]): Unit = {
    println(lsortFreqA(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))))
  }

  def lsortFreqA[T](ls: List[List[T]]): Any = {
    import com.takatori.s99.P10.encode
    val freqs = Map(encode(ls map { _.length } sortWith { _ < _ }) map { _.swap }: _*)
    ls sortWith { (e1, e2) => freqs(e1.length) < freqs(e2.length) }
  }
}