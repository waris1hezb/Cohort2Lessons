//Examples

(number: Int) => number +1  //  Anonymous function - cannot reuse anywhere else

val addition = (number: Int) => number +1  //Named function - only when we want to reuse. We cannot override.iMUTABLE

def addition (number: Int): Int = number +1 //Method. Named so can be reused. Must be named

def add(a: Int, b: Int): Int = {
  a + b  // Last expression is the return value
}

println(add(3, 5))  // Output: 8


def makeACoffee: String = {
  "Add coffee to boiling water"
  "Add sugar or/and milk if required"
  "Stir"
  "Enjoy!"

}
makeACoffee

def makeATea(sugar:Int):String = {
  s"Add $sugar spoons of sugar"
}
makeATea(sugar = 10

)

val vat: Double = 1.2
def priceIncludingVar(priceOfItem:Double):Double = {
  priceOfItem * vat
}

priceIncludingVar(priceOfItem = 3.99)


//Task1
def getBigVal(input1:Int, input2:Int): String = {
  if (input1 > input2) "first"
  else if (input1 < input2) "second"
  else "same"

}

getBigVal(5,7)



//TASK2
def nameLength(firstName:String, surname:String):Int = {

  if (firstName.length > surname.length) firstName.length
  else if (firstName.length < surname.length) surname.length
  else 0

}

nameLength("Tom", "Hiddleston")
nameLength("Elizabeth", "Olsten")
nameLength("Chris", "Pratt")


//referential transparency
// We say something has referential transparency when a functions value is based solely on the inputs


//For comprehensions
// These work on monadic types -- seq, list, option, either, future
//Will not work on int, string, boolean

// <- simple way of writing a function (flatmap, filter, map, foreach

// yield -- call the map

def retrieveNumbers: Seq[Int] = for (n <- 1 to 10) yield n

retrieveNumbers



val nums = List(1, 2, 3, 4)

def squaredNums: Seq[Int] = for (n <- nums) yield n * n  // Generates a new list

squaredNums


// if guards

def useIfGuard: Seq[Int] = for (n <- 1 to 10 if n % 2 == 0) yield n


useIfGuard


//Task 1
//1.
val names:List[String] = List("wArIS", "WAR","lowercase")

def namesLower(name:List[String]):List[String] = for (n <- name) yield n.toLowerCase

//namesLower(List("wArIS", "WAR","lowercase"))
namesLower(names)


//2.

def namesLower(name:List[String]):List[String] = for (n <- name) yield n.capitalize
namesLower(names)

//Task 2

def capitaliseList(name:List[String]):List[String] = for (n <- name) yield n.toLowerCase.capitalize
capitaliseList(names)