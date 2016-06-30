package P06

/** P06
  * (*) Find out whether a list is a palindrome.
  *
  *  Example
  *     scala > > isPalindrome(List(1, 2, 3, 2, 1))
  *     res0: Boolean = true
  */
object P06 {
  def main(args: Array[String]): Unit = {
    println(isPalindrome(List(1,1,2,3,5,8)))
    println(isPalindrome(List(1,1,2,1,1)))
  }

  def isPalindrome[T](list: List[T]): Boolean = list == list.reverse
}