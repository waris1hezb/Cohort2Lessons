package Week2.Monday.AfternoonTask

class Owl(name: String, age: Int, beakLength: Int, featherColour: String, val hootsPerNight: Int)
  extends Bird(name, age, beakLength, featherColour) with Species {

  override val speciesName: String = "Barn Owl"
  override val conservationStatus: String = "Least Concern"
  override val avgLifespanRange: Int = 15
  override val numOfYoungRange: Int = 3

  //Be careful with the names
  //Don't use name shortcuts because you change them everywhere. dummy



  override def describe(): String =
    super.describe() + s" It hoots $hootsPerNight times per night."
}

object Owl {
  def apply(name: String, age: Int, beakLength: Int, featherColour: String, hootsPerNight: Int): Owl =
    new Owl(name, age, beakLength, featherColour, hootsPerNight)
}
