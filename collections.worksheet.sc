// List is immutable linked list
val a = List(1, 2, 3)
val b = (1 to 5).toList
val c = (1 to 10 by 2).toList
val e = (1 until 5).toList
val f = List.range(1, 5)
val g = List.range(1, 10, 3)

// some methoods on List
val h = List(10, 20, 30, 40, 10)
h.drop(2)
h.dropWhile(_ < 25)
h.filter(_ < 25)
h.slice(2, 4)
h.tail
h.take(3)
h.takeWhile(_ < 30)
h.map(_.toString)

// flatten
val i = List(List(1, 2), List(3, 4))
i.flatten

// Tuples
case class Person(name: String)
val t = (11, "eleven", Person("Eleven"))

t(0)
t(1)
t(2)

// extractor
val (num, str, person) = t
println(num)
println(str)
println(person)
