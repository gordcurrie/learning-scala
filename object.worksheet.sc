// object/singleton
// object keyword creates singleton which can be used like static methods
object StringUtils:
  def isNullOrEmpty(s: String): Boolean = s == null | s.trim.isEmpty
  def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
  def rightTrim(s: String): String = s.replaceAll("\\s+$", "")

val x = StringUtils.isNullOrEmpty("")

// Companion object
// companion objects can access private properites of its companions.
import scala.math.*
class Circle(radius: Double):
  import Circle.*
  def area: Double = calculateArea(radius)

object Circle:
  private def calculateArea(radius: Double): Double =
    Pi * pow(radius, 2.0)

val circle1 = Circle(5.0)
circle1.area

// objects can also implment traits
trait AddService:
  def add(a: Int, b: Int) = a + b

trait MultipleService:
  def multiply(a: Int, b: Int) = a * b

object MathService extends AddService, MultipleService

import MathService.*

println(add(2, 3))
println(multiply(2, 3))
