package Week4.Tuesday

object HigherOrderFunctions extends App {

  //Higher Order Functions - HOF
  // Definition: They are a function that Either takes in a function as a parameter or return a function as a result.

  //Why use HOFs?
  //They allow code reusability, abstraction, and functional composition, making code more concise and declarative.

  //what do they do? Manipulate collections (e.g. map, filter, fold, reduce...)

  /** HOF - functions as parameters */

  //This method will take a function(that is also int => int), and it will apply whatever that is, to the given 'x'
  def firstHigherOrderFunction(x: Int, function: Int => Int): Int = function(x)

  //now need to write functions that can be passed into my HOF - must be Int =>Int

  def addTwo(number: Int): Int = number + 2

  def square(number: Int): Int = number * number

  def double(number: Int): Int = number * 2

  println(firstHigherOrderFunction(3, addTwo))
  println(firstHigherOrderFunction(3, square))
  println(firstHigherOrderFunction(3, double))


  //This method will process a List[String]

  def processTheList(listOfString: List[String], f: String => String): List[String] = listOfString.map(f) //must map through the list to access the single element

  def toUpper(word: String): String = word.toUpperCase

  def addS(word: String): String = word + "s"

  def toLower(word: String): String = word.toLowerCase

  val newList: List[String] = List("apple", "mango", "grapes", "banana")

  println(processTheList(newList, toLower))
  println(processTheList(newList, toUpper))
  println(processTheList(newList, addS))

  /**
   * Fold Left
   */
  //what does it do?
  //Combines/reduces a collection into a single value.
  //Process the collection from left to right
  //It will store the intermediate value as an 'acc'. At the end, once the full collection, is checked and reduced it will return the 'acc'


    // acc comes first, then element (acc,element) => acc + element
  val numbersList:List[Int] = List(1,2,3,4,5)
  println(numbersList.foldLeft(2)((acc,nextInt) => acc + nextInt))
//  numbersList.foldLeft(0)(_+_) - short hand

  //Pseudocode
  // start with 0 -> 0 + 1 (acc = 1)
  // (1,2) -> 1 + 2 (acc = 3)
  // (3,3) -> 3 + 3 (acc = 6)
  // (6,4) -> 6 + 4 (acc = 10)
  // (10,5) -> 10 + 5 (acc = 15)

//write a method that takes a list of "String" and returns them as a String

  val stringList = List("we", "love", "scala")
  println(stringList.foldLeft("")((acc,word) => acc + " " + word).trim)



  println(numbersList.foldLeft(1)((acc,nextInt) => acc * nextInt))

  println(numbersList.filter(x => x % 2 == 0))


  println(stringList.foldLeft(0)((acc,word) => acc + word.length))


  println(stringList.map(stringList => stringList.capitalize).foldLeft("")((acc,word) => acc + " " + word).trim)


  /** Fold Right *///Same as above except you move Right to Left.// Element comes first, then acc.// foldRight(acc)(function: (element, acc) => element, acc)


  /**
   * HOF - Function is the return statement
   * commonly seen in pattern matching/if else, where we want to choose the function based on given criteria.
   */


  // Write a function where, given the length of employment, the percentage pay rise is different.
  // return the final amount paid per year to a particular employee

  case class Employee(name:String, lengthOfEmployment: Int, salary: Double)

  val Waris = Employee("Waris", 1, 50000.0)

  def bigPayRise: Double => Double = salary => salary * 2        //salary could be named anything or just _. we wrote salary so that its easier to understand.

  def mediumPayRise: Double => Double = salary => salary * 1.3

  def smallPayRise: Double => Double = salary => salary * 1.1

  def getPayRiseCalc(employee: Employee): Double => Double = {

    employee.lengthOfEmployment match {
      case year if year <= 3 => smallPayRise
      case year if year <= 5 => mediumPayRise
      case _ => bigPayRise
    }
  }

    def getFinalSalary(employee: Employee): Double = {
      val applyThePayRise: Double => Double = getPayRiseCalc(employee) //stores the pay rise function
      applyThePayRise(employee.salary)

    }

//  print(getFinalSalary(Waris))


  case class Item(price:Double)

  val pictureFrame = Item(56.00)


  def discountSmall: Double => Double = price => price * 0.8
  def discountMedium: Double => Double = price => price * 0.6
  def discountBig: Double => Double = price => price * 0.5





  def getDiscount(item: Item): Double => Double = {

    item.price match {
      case price if price > 0 && price < 20 => discountSmall
      case price if price <= 50 => discountMedium
      case _ => discountBig
    }
  }

  def getFinalPrice(item: Item): Double = {
    val applyTheDiscount: Double => Double = getDiscount(item) //stores the pay rise function
    applyTheDiscount(item.price)
  }
  print(getFinalPrice(pictureFrame))


}
