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

myFruits ++ myFruitsVec // When concatenating a List and a Vector, the return type is alway List

// Concatenating two Vectors
myFruitsVec ++ myVegatables

myVegatables.filter(_ == "corn")