import scala.annotation.tailrec

object PrimesSum {
  def solve(number: Int): Long = {
    val range = 2 to number
    runSum(0, range.toList)
  }

  @tailrec
  private def runSum(acc: Long, range: List[Int]): Long = range match
    case Nil => acc
    case h :: t => runSum(acc + h, t.filterNot(_ % h == 0))
}
