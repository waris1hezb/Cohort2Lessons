package Week2.Tuesday

object CaseClasses extends App {

  //Standard Class
  //  class SuperHero(val realName: String, val heroName:String, val weakness: String)
  //
  //  new SuperHero("Clark Kent", "superman", "kryptonite") //instantiated new superhero object from the superhero class.

  //Case class
  case class SuperHero(realName: String, heroName: String, weakness: String)

  // each property is a val by default
  val superman = SuperHero.apply("Clark Kent", "superman", "Kryptonite") // .apply method is built in.
  val superman2 = SuperHero.apply("Clark Kent", "superman", "Kryptonite")

  println(superman == superman2)
  // compares field values not the object

  // . copy method

  val copiedSuperman = superman.copy(weakness = "Gravity")
  println(superman)
  println(copiedSuperman)



  // option command L to put everything on line and formatted.


  //Task1
  println("\nTask\n")

  case class Dog(name:String, breed:String, age:Int)
  case class Cat(name:String, furColour:String, age:Int)
  case class Bird(name:String, featherColour:String, hasbeak:Boolean)

  val dog1 = Dog("Sussy", "Golden Retriever", 5)
  val dog2 = Dog("Jack", "Pitbull", 2)
  val dog3 = Dog("dog3", "XL Bully", 7)
  val dog4 = Dog("dog4", "Golden Retriever", 10)

  val dogs:List[Dog] =  List(dog1,dog2,dog3,dog4)

  val cat1 = Cat("Sussy", "white", 5)
  val cat2 = Cat("Jack", "black", 2)
  val bird1 = Bird("dog3", "rainbow", hasbeak = true)
  val bird2 = Bird("dog4", "red", hasbeak = true)


  case class Kennel(name:String, dogs:List[Dog], listCats: List[Cat], listBirds:List[Bird])
















}
