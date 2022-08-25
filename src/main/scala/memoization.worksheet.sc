// Memoization
// Memoization is a specific form of caching.

// Factorial calculation - without memoization
def calcFactorial(x: Int): Int = {
  if(x == 0 || x == 1) 1
  else {
    println("Computing factorial")
    x * calcFactorial(x - 1)
  }
}

calcFactorial(5)