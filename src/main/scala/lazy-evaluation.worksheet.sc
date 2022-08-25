// Lazy evaluation
// Evaluates programming constructs when they are actually used, thereby eliminating the need for additional storage.
// Put it simply, it's a kind of delayed evaluation.
// In this method, the evaluation of an expression is done when the value of that expression is actually used.

val myNumEagerEval = 10
lazy val myNumLazyEval = 10

// What we gain using lazy evaluation?
// We have smaller values to hold in the memory.
// But imagine thousands of records being evaluated. If we are not using those records then holding them in the computer’s memory is wasteful.

// Delayed parameter evaluation can be achieved by using functions as parameters.
def myFunction(myArg: () => Int) = println(myArg()) // Takes the Unit type of argument and returns Int.

myFunction(() => 5) // The integer argument is evaluated at the time of printing.








