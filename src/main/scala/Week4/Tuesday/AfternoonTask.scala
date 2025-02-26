package Week4.Tuesday

object AfternoonTask extends App {

  //1
  def intDoubler(number:Int):Int = number * 2

  def applyTwice(input:Int, f:Int => Int): Int =  f(f(input))


  println(applyTwice(4,intDoubler))

//2

  def addition(x: Double, y: Double): Double = x + y
  def subtraction(x: Double, y: Double): Double = x - y
  def multiplication(x: Double, y: Double): Double = x * y
  def division(x: Double, y: Double): Double = x / y

 def IntManipulator(x:Double,y:Double, f:(Double,Double) => Double): Double = f(x,y)

  println(IntManipulator(3,4,addition))



  //3

  def processTheList(listOfString: List[String], f: String => String): List[String] = listOfString.map(f) //must map through the list to access the single element

  def toUpper(word: String): String = word.toUpperCase

  def addS(word: String): String = word + "s"

  def toLower(word: String): String = word.toLowerCase


}
