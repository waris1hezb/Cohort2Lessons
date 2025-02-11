package Week2.Monday.AfternoonTask

class Bird(name: String, age: Int, val beakLength: Int, val featherColour: String)
  extends Animal(name, age) with Flyable {

  // Extends animal class and adds beaklength and feathercolour properties, aswell as using trait flyable

  override val canFly: Boolean = true
  override val wingSpan: Int = beakLength * 3 // Example calculation
  //
  override def describe(): String =
    super.describe() + s" It has a $beakLength cm beak and $featherColour feathers."
}
  // adds details, same as other classes



object Bird {
  def apply(name: String, age: Int, beakLength: Int, featherColour: String): Bird =
    new Bird(name, age, beakLength, featherColour)
}
