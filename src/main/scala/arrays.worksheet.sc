val numbers: Array[Int] = Array(0, 1, 2, 3, 4, 5, 6)

// Fetch value by index
numbers(2)  // O(1)

// Map function
numbers.map(_ * 2)
numbers.map(x => x * 2)

// Array functions
numbers.reverse

val numSet1: Array[Int] = Array(10, 30, 50)
val numSet2: Array[Int] = Array(20, 40, 60)

numSet1 ++ numSet2
(numSet1 ++ numSet2).sorted

val fruits: Array[String] = Array("Apple", "Orange", "Banana", "Mango")

fruits.exists(x => x == "Orange")
fruits.exists(x => x == "Pineapple")
fruits.exists(_ == "Orange")

