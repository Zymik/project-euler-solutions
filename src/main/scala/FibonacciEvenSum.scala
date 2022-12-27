import scala.annotation.tailrec

object FibonacciEvenSum {
  def solve(border: Long): Long = {
    fibonacciEvenSum(1, 1, 0, border)
  }

  @tailrec
  private def fibonacciEvenSum(beforeLast: Long, last: Long, acc: Long, border: Long): Long = {
    val current = beforeLast + last
    if current > border then
      return acc

    val newAcc = if current % 2 == 0 then acc + current else acc

    fibonacciEvenSum(last, current, newAcc, border)
  }
}
