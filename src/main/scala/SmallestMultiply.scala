import scala.annotation.tailrec

object SmallestMultiply {
  def solve(value: Long): Long = {
    solve(2, value, factorial(value))
  }

  private def factorial(value: Long): Long =
    (1L to value).product

  @tailrec
  private def solve(current: Long, border: Long, acc: Long) : Long = {
    if current > border
      then return acc
    if check(border, acc / current)
      then solve(current, border, acc / current)
    else solve(current + 1, border, acc)
  }

  private def check(border: Long, value: Long): Boolean = {
    val division = for(i <- 2L to border)
      yield value % i == 0

    division.forall(x => x)
  }
}
