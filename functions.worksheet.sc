// lambdas
val a = List(1, 2, 3).map(x => x * x)
val b = List(1, 2, 3).map(_ * 2)

// calling named functions
def sqr(i: Int): Int = i * i
val c = List(1, 2, 3).map(sqr)
val d = List(1, 2, 3).map(x => sqr(x))

// Immutable collections List, Vecrot, Map, Set
val nums = (1 to 10).toList

// chaing methods
val x = nums
  .filter(i => i > 3)
  .filter(_ < 7)
  .map(_ * 10)

print(x)
print(nums)
