package com.takatori.s99

/** P27
  * (**) Group the elements of a set into disjoint subsets.
  *  a) In how many ways can a group of 9 people work in 3 disjoint subgroups
  *     of 2, 3 and 4 persons? Write a function that generates all the possibilities.
  *
  *  Example
  *   scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
  *   res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
  *
  *  b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.
  *
  *  Example
  *    scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
  *    res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ...
  *
  *
  *   Note that we do not want permutations of the group members; i.e. ((Aldo, Beat), ...) is the same solution
  *   as ((Beat, Aldo), ...). However, we make a difference between ((Aldo, Beat), (Carla, David), ...) and ((Carla, David), (Aldo, Beat), ...).
  */
object P27b {
  def main(args: Array[String]): Unit = {
    println( group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))
    println( groupA(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))
  }

  def group[T](numbers: List[Int], list: List[T]): List[List[List[T]]] = {
    import com.takatori.s99.P26.combinations
      for {
        a <- combinations(numbers(0), list)
        noA = list.filterNot(a contains)
        b <- combinations(numbers(1), noA)
      } yield List(a, b, noA.filterNot(b contains))
  }

  def groupA[A](ns: List[Int], ls: List[A]): List[List[List[A]]] = {
    import com.takatori.s99.P26.combinations
    ns match {
      case Nil => List(Nil)
      case n :: ns => combinations(n, ls) flatMap { c =>
        group(ns, ls.filterNot(c contains)) map {c :: _}
      }
    }
  }
}