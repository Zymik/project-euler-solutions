import scala.annotation.tailrec

object LargePrime {

  def solve(number: Int): Long = {
    findPrimeByNumber(2, Nil, number)
  }

  @tailrec
  private def findPrimeByNumber(current: Long, primes: List[Long], number: Int): Long = primes match {
    case h :: _ if primes.size == number => h
    case _ if isPrime(current, primes) => findPrimeByNumber(current + 1, current :: primes, number)
    case _ => findPrimeByNumber(current + 1, primes, number)
  }

  private def isPrime(value: Long, primes: List[Long]): Boolean =
    primes.forall(x => value % x != 0)

}
