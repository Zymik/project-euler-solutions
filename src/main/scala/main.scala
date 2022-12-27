@main
def main(): Unit = {

  println(s"Answer for Multiples of 3 or 5: ${MultipleThreeOrFive.solve(999)}")

  println(s"Answer for Even Fibonacci numbers: ${FibonacciEvenSum.solve(4_000_000)}")

  println(s"Answer for Largest prime factor: ${LargestPrimeFactor.solve(600851475143L)}")

  println(s"Answer for Sum square difference: ${SumSquareDifference.solve(100)}")

  println(s"Answer for Smallest multiply: ${SmallestMultiply.solve(20)}")

  println(s"Answer for Largest Palindrome product: ${LargestPalindromeProduct.solve()}")

  println(s"Answer for 10001st Prime: ${LargePrime.solve(10001)}")

  println(s"Answer for Pythagorean triplet: ${PythagoreanTriplet.solve()}")

  println(s"Answer for Summation of primes: ${PrimesSum.solve(2_000_000)}")

  println(s"Answer for Power digit sum: ${PowerDigitSum.solve()}")

}