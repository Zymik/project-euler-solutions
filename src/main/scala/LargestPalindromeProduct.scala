object LargestPalindromeProduct {
  def solve(): Long = {
    val range = 999L to 100L by -1
    range
      .flatMap(x => range.zip(LazyList.iterate(x)(y => y)))
      .map(_ * _)
      .sortWith(summon[Ordering[Long]].reverse.lt)
      .find(isPalindrome)
      .get

  }

  private def isPalindrome(value: Long): Boolean = {
    value.toString == value.toString.reverse
  }
}
