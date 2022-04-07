// method with return type
def sum(a: Int, b: Int): Int = a + b
print(sum(1, 2))

// return types are optional
def sum2(a: Int, b: Int) = a + b
print(sum2(1, 2))

// default values
def sum3(a: Int = 1, b: Int = 2) = a + b
print(sum3(b = 3)) // can use name params
print(sum3(1, 5)) // can use param location
print(sum3(5)) // can skip

// Extension methods
extension (s: String)
  def hello: String = s"Hello, ${s.capitalize}!"
  def goodbye: String = s"Goodbye, ${s.capitalize}!"

print("World".hello)
print("World".goodbye)
