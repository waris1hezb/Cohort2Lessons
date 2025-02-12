package Week2.Tuesday

object AfternoonTask extends App {

  //AfternoonTask

  /**
   * Regular Class
   *
   * Boilerplate code -requires manual implementation for toString, equals, hashCode, etc.
   * Object Instantiation	-Must use new keyword.
   * Immutable by Default	Not immutable unless explicitly made so with val.
   *
   * Case Class
   * Automatically generates toString, equals, hashCode methods.
   * Can be instantiated without new.
   * Immutable by default (parameters are val by default).
   */


  //2
  case class Person(name: String, age: Int, nationality: String, isStudent: Boolean)

  val firstPerson = new Person("Carlos", 23, "Spanish", true) //(Error: case classes don’t require `new`)
  val secondPerson = Person("Carlos", 23, "Spanish", true) //Valid)
  val thirdPerson = Person("Chloe", 25, "British", false) //(Valid)

  class Animal(name: String, colour: String, pet: Boolean)

  val cat = Animal("cat", "black", true) //(Error: Missing `new`)
  val dog = new Animal("dog", "white", true) //(Valid)


  //3
  case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)

  val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
  val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
  val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
  val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
  val oneMoreChocolateMuffin = Muffin("Chocolate", 3.50, "Mercator Bakery") // Different capitalization
  val finalChocolateMuffin = Muffin("chocolate", 2.50, "Mercator Bakery") // Different price

  // Equality checks:
  println(chocolateMuffin == anotherChocolateMuffin) // True (Same values)
  println(chocolateMuffin == oneMoreChocolateMuffin) //  False (Capitalization difference)
  println(chocolateMuffin == finalChocolateMuffin) //  False (Different price)
  println(blueberryMuffin == vanillaMuffin) //  False (Different flavours)


}
