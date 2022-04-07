// everything inherrits from Any
val list: List[Any] = List(
  "string",
  732,
  2.732,
  'c',
  true,
  () => "anonymouse function which retruns a string"
)

list.foreach(e => println(e))

// numeric type sextend AnyVal
val b: Byte = 1
val i: Int = 1
val l: Long = 1
val s: Short = 1
val d: Double = 1
val f: Float = 1

// default types for numberic
val g = 123
val h = 1.23

// cooercie using hints
val x = 1_000L
val y = 2.2d
val z = 3.3f

// String double quotes " Char single quote '
val st = "Dexter"
val ch = 'a'

// Big stuff
val bigInt = BigInt(1_234_567_890_987_654_321L)
val bigDec = BigDecimal(123_456.789)
val bigger = bigInt * bigInt

// Strings
// Interpolation
val firstName = "Gord"
val mi = 'R'
val lastName = "Currie"
println(s"Name: $firstName $mi $lastName: Number: ${2 + 2}")

// multiline strings can use | for maintianing whitespace

val ml = """This is a
            | multiline
            | string """.stripMargin
println(ml)

// type casting
{ // block to reset valraibles, there is shadowing going on here
  val x: Long = 987654321
  val y: Float = x.toFloat

  val face: Char = '☺'
  val number: Int = face
  print(s"$x : $y : $face : $number")
}
