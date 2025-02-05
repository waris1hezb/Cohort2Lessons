// S

//task
val name1 = "Waris"
val name2 = "Fang"
val age1: Double = 25
val age2: Double = 23

println(s"Hello, my name is $name1 and I am $age1 years old.")
// Output: Hello, my name is Waris and I am 25 years old.

println(s" $name1 is older than $name2")

println(s" $name1 is ${age1-age2} years older than $name2")

println(f" $name1 is ${age1-age2}%.1f years older than $name2")

println(raw"\n\n\n\n\n\n\n\nsameline\n\n ")




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
// Common use --> Regex .  eg postcode etc



printf(" '%-20s' ", "Hello")
printf(" '%20s' ", "Hello")
printf(" '%20s%-20s' ", "Hello", "") // be careful that spacing before takes the text into account

