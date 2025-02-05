// S

val name = "Waris"
val age = 25
println(s"Hello, my name is $name and I am $age years old.")
// Output: Hello, my name is Alice and I am 25 years old.


val x = 5
val y = 3
println(s"The sum of $x and $y is ${x + y}.")
// Output: The sum of 5 and 3 is 8.

//f


val pi: Double = 3.14159
val pi = math.Pi
println(f"Pi is approximately $pi%.2f")  // %.2f rounds to 2 decimal places
// Output: Pi is approximately 3.14

println(f"pi to 2 d.p is ${math.Pi}%20.2f")

val num:Int = 42
println(f"Number: $num%5d")  // Right-align within 5 spaces
// Output: "Number:    42"

// raw

println(raw"This is a newline: \nNo actual newline!")
// Output: This is a newline: \nNo actual newline!


printf(" '%-20s' ", "Hello")
printf(" '%20s' ", "Hello")
printf(" '%20s%-20s' ", "Hello", "") // be careful that spacing before takes the text into account