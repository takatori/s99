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
object P27a {
  def main(args: Array[String]): Unit = {
    println(group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))
  }

  def group3[T](list: List[T]): List[List[List[T]]] = {
    import com.takatori.s99.P26.combinations

    for {
      x <- combinations(4, list)
      y <- combinations(3, list.filterNot(x contains))
      z <- combinations(2, list.filterNot(x ::: y contains))
    } yield List(z, y, x)
  }
}