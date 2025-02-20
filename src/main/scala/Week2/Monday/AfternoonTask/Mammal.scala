package Week2.Monday.AfternoonTask

class Mammal(name: String, age: Int, val furColour: String, val hasTail: Boolean)
  extends Animal(name, age) {
  //Mammal extends animal class and adds new properties


  override def describe(): String = {
    super.describe() + s" It has $furColour fur and ${if (hasTail) "a tail" else "no tail"}."

    //Subclass mammal overrides describe method but allows me to add details about fur and tail and keep the behaviour of the animal class.
    //Super allows subclass to call methods from its superclass so that it can be overridden
  }
}

object Mammal {
  def apply(name: String, age: Int, furColour: String, hasTail: Boolean): Mammal =
    new Mammal(name, age, furColour, hasTail)
}


Use classes,case classes, abstract classes, TDD, functions method, collections, if else, string interpolations