object MultipleThreeOrFive extends App {

  private def sumDivided(n: Int, bound: Int): Int = {
    if bound < n then
      return 0
    val count = bound / n
    ((n + count * n) * count) / 2
  }

  def solve(bound : Int): Int = {
    sumDivided(3, bound) + sumDivided(5, bound) - sumDivided(15, bound)
  }

}
