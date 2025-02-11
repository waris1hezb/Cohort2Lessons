package Week2.Monday.AfternoonTask


object AnimalLogic extends App {

  // Function to print animal details
  def printAnimalInfo(animal: Animal): Unit = {
    println(animal.describe())
  }

  // Creating instances of animals
  val owl = Owl("Hedwig", 3, 5, "White", 10)
  val warthog = Warthog("Pumbaa", 5, "Brown", true, true)
  val dragonfly = Dragonfly("Tiny", 1, 6, 2)
  val lion = Mammal("Simba", 5, "Golden", hasTail = true)
  val parrot = Bird("Parrot", 2, 4, "Green")
  val ant = Insect("Ant", 1, 6)

  // Printing animal descriptions
//  printAnimalInfo(owl)
//  printAnimalInfo(warthog)
//  printAnimalInfo(dragonfly)

  // List to store all animals in the sanctuary
  val sanctuary: List[Animal] = List(owl, warthog, dragonfly, lion, parrot, ant)


  // Printing all animals in the sanctuary
  println("=== Animals in the Sanctuary ===")
  sanctuary.foreach(printAnimalInfo)

  // Testing flyable trait
  println(owl.fly())
  println(dragonfly.fly())

  //Testing animal properties

  println(owl.name)
  println(warthog.name)
  println(owl.canFly)
//  println(warthog.canFly)  //Error because warthof doesnt have that trait
  println(warthog.furColour)
  println(owl.hootsPerNight)
  println(dragonfly.wingPairs)
  println(lion.name)


}

