object PowerDigitSum {
  def solve(): Int = {
    val value = fastPower(BigInt(2), 1000)

    val s = value.toString()
      .toCharArray
      .map(_.toString.toInt)

    s.sum
  }

  private def fastPower(x: BigInt, y: Int): BigInt = {


    if y == 0
    then return 1

    if y % 2 == 0 then {
      val t = fastPower(x, y / 2)
      t * t
    } else {
      x * fastPower(x, y - 1)
    }
  }
}
