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

fruits groupBy {x => x.length} // Produces a Map[Int, Array[String]]

// Range
val x = (1 to 5).toArray

// Appending elements
numbers :+ 2
fruits :+ "Papaya"

//-------------
// ArrayBuffer
//-------------
// Like Array, ArrayBuffer is mutable. Also, it's resizable unlike Array.
import scala.collection.mutable.ArrayBuffer
// Define empty ArrayBuffer
var strings = ArrayBuffer[String]()
var ints = ArrayBuffer[Int]()

// To create a new ArrayBuffer with initial elements
val buf = ArrayBuffer(1, 2, 3, 5)

// Sum operation
numbers.foldLeft(0)(_+_)
numbers.reduceLeft(_+_)
numbers.reduce(_+_)
numbers.reduceRight(_+_)

// Sum consecutive numbers
numbers.length
numbers.length * (numbers.length + 1) /2

// Find the index of an element
numbers.indexOf(2)
numbers.lastIndexOf(2)

// Find a max element
numbers.max