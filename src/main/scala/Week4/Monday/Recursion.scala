package Week4.Monday

import scala.annotation.tailrec

object Recursion extends App {

  //Standard recursion
  // calls itself to solve a problem by breaking it down to into smaller subproblems.
  //each new call adds to the call stack
  // method will remember all of these calls before completing.
  // will continue to recursively call until the base case is reached
  //once base case is reached, it will resolve in reverse order


  def factorial(n:Int):Int = {

    if (n ==0) {1       //base case

  }
    else
    {
      println(s"Incoming n is $n")
      n * factorial(n-1)  //recursive case
    }
  }
println(factorial(5))
println(factorial(4))

//pseudocode = factorial(4)
  // factorial(4) --> 4 factor(4-1) --> factorial(3) 4 x 3 x 2 x 1 x 1 = 24
  // factorial(3) --> 3 factor(3-1) --> factorial(2) 3 x 2 x 1 x 1
  // factorial(2) --> 2 factor(2-1) --> factorial(1) 2 x 1 x 1
  // factorial(1) --> 1 factor(1-1) --> factorial(0)  == 1 x 1
  // factorial(0) --> Hitting base case --> return 1



  // Stack overflow error - there is only so much memory in the call stack. If this is exceeded we get this error

  //println(factorial(10000))

// Tail Recursion

  // Smarter way to write recursion because it stops stack overflow errors.
  // Key differences:
  // 1. recursive call must be the last operation a function performs. @tailrec
  //2. Prevents stack overflow error:
  //a) Doesn't need to remember all previous values, all needed information is passed through as an accumulator(acc)
  //b) Scala replaces recursive calls with a simple loop under the hood, called Tail call optimisation. (TCO)
  //replaces and updates the acc with every recursive call.

  //helper method

  def smarterFactorial(n:Int):Int = {
    @tailrec
    def factorialHelper(x:Int, acc:Int):Int = {  // helper -  we don't have to change the original method signature
      if (x == 0) acc   //acc - stores the intermediate value, dont need to have a large memory as call stack is being updated each time.
      else {
        println(s"\ncurrent x = $x")
        println(s"current acc =  $acc")
        factorialHelper(x-1, x * acc)
        // x-1 --> moving down our numbers list
        // acc * x --> running total
      }
    }
    factorialHelper(n,1)  // call the helper, pass in the original n so we start the recursion at the top level, acc will start at the base case(if statement)

  }
smarterFactorial(4)
smarterFactorial(5)


// tail recursion without helper

  def smarterFactorialWithoutHelper(n: Int, acc: Int = 1): Int = {
    if (n == 0) acc // Base case
    else smarterFactorialWithoutHelper(n - 1, acc * n) // Tail recursion (accumulator holds the result)
  }

  println(smarterFactorialWithoutHelper(5)) // Output: 120







}
