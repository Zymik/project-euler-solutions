object PythagoreanTriplet {
  def solve(): Int = {
    val a = 1 to 1000
    val b = a.map(x => 1 until 1000 - x)
    a.zip(b)
      .flatMap {
        case (x, l) => l.map(b => (x, b, 1000 - (x + b)))
      }
      .find {
        case (a, b, c) => a * a + b * b == c * c
      }
      .map(t => t._1 * t._2 * t._3)
      .get
  }
}
