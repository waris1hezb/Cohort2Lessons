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

  // Printing animal descriptions
  printAnimalInfo(owl)
  printAnimalInfo(warthog)
  printAnimalInfo(dragonfly)

  // Testing flyable trait
  println(owl.fly())          // "I am flying!"
  println(dragonfly.fly())    // "I am flying!"
}
