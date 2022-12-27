object SumSquareDifference {
  def solve(value: Int): Int = {
    val squares = (1 to value).map(x => x * x).sum
    val sum = ((1 + value) * value) / 2
    sum * sum - squares
  }
}
