//=============
// Lists
//=============

// Lists are widely used in functional programming

val myFruits: List[String] = List("grape", "banana", "apple", "mango")
myFruits(2)
myFruits.sorted // Sort operation
myFruits.filter(x => x == "banana")
myFruits.filter(_ == "banana")

// If we are dealing with the first element of a linked list for insert or delete or update operations, this requires O(1) time.
// If we need to locate an item in a list then we need to traverse all the elements. The complexity becomes O(n).
// Any insertion at the end of the list, the complexity becomes O(n).
// Deletion = O(n)

val myPets: List[String] = List("cat", "dog", "goat", "horse")

myPets groupBy {x => x.length} // Produces a Map[Int, List[String]]

var hetroList = List("one", 1)
hetroList(0)
hetroList(1)
hetroList = hetroList.updated(0, "two")
hetroList
hetroList.head
hetroList.tail
//=============
// Vectors
//=============
// For vectors, it doesn’t matter whether we are performing operations in the beginning, middle, or end.
// Vector provides similar structure to that of an array, but it immutable.

// Vector is implemented using Trie structures, which give us better performance.

val myFruitsVec: Vector[String] = Vector("grape", "banana", "apple", "mango")
myFruitsVec(1)
myFruitsVec.sorted // Sort operation

val myVegatables: Vector[String] = Vector("beetroot", "corn", "avocado")

myFruits ++ myFruitsVec // When concatenating a list and a vector, the return type is always a list

// Concatenating two Vectors
myFruitsVec ++ myVegatables

myVegatables.filter(_ == "corn")

// Vector - Advantages
// When we filter for a particular element, it doesn’t have to traverse all the elements of the vector.

// Trie structure
// Trie is a tree data structure used for storing collections of strings.
// It's also called digital tree or prefix tree.
// We can do prefix-based search.
// Compare to hash table: Hash table takes more space than the trie.

myFruitsVec groupBy {x => x.length} // Produces a Map[Int, Vector[String]]

// Range
val y = (1 to 5).toList
val g = List.range(1, 10, 3)

// List's functional methods, meaning that they don’t mutate the collection they’re called on, but instead return a new collection with the updated elements.
val a = List(10, 20, 30, 40, 10)      // List(10, 20, 30, 40, 10)
a.foreach(println)

a.drop(2)                             // List(30, 40, 10); Drop left
a.dropWhile(_ < 25)                   // List(30, 40, 10)
a.filter(_ < 25)                      // List(10, 20, 10)
a.slice(2,4)                          // List(30, 40); (from, until)
a.tail                                // List(20, 30, 40, 10)
a.take(3)                             // List(10, 20, 30)
a.takeWhile(_ < 30)                  // List(10, 20)
a.dropRight(2)
a.drop(Int.MaxValue)

// map, flatmap
// The map method steps through each element in the existing list, applying
// the function we supply to each element, one at a time; it then returns a new list with all of the modified elements.
myVegatables.map(_.length)
myVegatables.map(_.toUpperCase)

val nums = (1 to 10).toList

nums.reduceLeft(_ + _)
nums.foldLeft(10)(_ + _)

// Higher-order functions
a.filter((i: Int) => i < 30)
a.filter((i) => i < 25)
a.filter(i => i < 25)
a.filter(_ < 25)

a.filter(_ < 25).map(_ * 2)

// Tail - It’s used to print every element in a list after the head element.
"Senthil".head
"Senthil".tail

val emptyList = List[Int]()   // emptyList: List[Int] = List()
emptyList.headOption