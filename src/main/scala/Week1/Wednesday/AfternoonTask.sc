//MVP

// 1. Create a value to store the number of watermelons
val noOfWatermelons: Int = 100

// 2. Determine John's carrying ability
val canCarry = if (noOfWatermelons <= 0)
  "Invalid amount of watermelons"
else if (noOfWatermelons <= 3)
  s"John doesn't need a bag because he is buying $noOfWatermelons watermelons."
else if (noOfWatermelons <= 5)
  s"John needs a bag because he is buying $noOfWatermelons watermelons."
else
  s"John can't carry the watermelons because he is buying $noOfWatermelons watermelons."

println(canCarry)

// 4. Create a boolean value for whether John has a bag
val hasBag: Boolean = true

// 5. Use an if-statement with `hasBag`
if (hasBag && noOfWatermelons <= 5) {
  println("John can carry the watermelons.")
} else if (!hasBag && noOfWatermelons <= 3) {
  println("John can carry the watermelons without a bag.")
} else {
  println("John cannot carry the watermelons.")
}

// 6. Calculate the total cost using string interpolation
val totalCost: Double = noOfWatermelons * 1.397
val costMessage = f"The total cost for the watermelons is £$totalCost%.2f"

println(costMessage)


// Extension:

//1.
/**
 <, !=, and == (Comparison operators) → Higher precedence

 && (Logical AND) → Lower than comparison operators

 || (Logical OR) → Lowest precedence
 */

//2,3,4.
val result1 = (true || false && false)   // true (&& has higher precedence than ||)
val result2 = ((true || false) && false) // false
val result3 = (1 < 4 && 8.7 != 10 || 9 + 10 == 21)


// Research:

val a: Int = 5
val b: Int = 10
val comparison: String = if (a > b) "yes" else "no"
println(comparison)
