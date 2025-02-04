//MVP:
//Question 1.
3+4*57 < 300

144/12 >= 12

"Cat" < "Dog"

"Rabbit" < "Hamster"

val result = if (17 % 2 == 0) "even" else "odd"

75/9 < 30 && 89/6 < 20

/**
 * Question 2
 *  The difference between a string and a print line is that the string is a data type that represents a sequence of characters and is a value that you can manipulate and store. Whereas the print line is a function that outputs text to the console. It takes tge text as an argument and displays it on the screen, and it is not stored.
 */

//Question 3
val one: Int = 2
val word: String = "Hello"
val hungry: Boolean = true

//val one: int = "hello"
//hungry = "yes"
//word = 2

val number:Int = 2147483647

val melon = 5 * 30

val flour = 2 * 90
val ciders = 6 * (100*2.50)

val total = melon + flour + ciders

println(total)

(156/8 <20) && (54 < 20) && (54/4 < 14)



//Extension:

//1. False because in scala strings are case-sensitive so the words are not equal

//2. No you cant.unless you try map it using a dictionary to convert words into numbers.

//3. Yes you can convert an int to a string using the .toString method.

val num = 1
val str = num.toString

println(s"Converted number: $str")

//5.
val lower = "hello"
val upper = lower.toUpperCase()

//6.
val wordcap = "hello"
val capitalword = wordcap.capitalize

//Research
//val new = "Random Word"
//new is a reserved keyword. used for instantiating objects. you cant use reserved keywords as valuable names

//2. To make it work we have to use a different name for the variable/value

//3. There are many words that are reserved keywords such as class, def , if else, try, object etc