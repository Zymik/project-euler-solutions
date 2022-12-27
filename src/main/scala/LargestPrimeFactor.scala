import scala.annotation.tailrec

object LargestPrimeFactor {
  def solve(value: Long): Long =
    solve(-1, 2, sqrt(value) , value)

  @tailrec
  private def solve(acc: Long, current: Long, border: Long, value: Long): Long = {

    if value == 1 || value == 0
      then return acc

    if value % current == 0
      then return solve(current, current, math.min(border, value / current), value / current)

    if current < border
      then return solve(acc, current + 1, border, value)

    acc
  }

  private def sqrt(value: Long) : Long = math.sqrt(value.asInstanceOf[Double]).asInstanceOf[Long]
}
