package Week3.Thursday

object AfternoonTask extends App {


  def countryCapital(country:String):String = {

    country.toLowerCase match {
      case "England" => "London"
      case "France" => "Paris"
      case "Albania" => "Tirana"
      case _ => "Not valid country"
    }

  }
  val country = "England"
  println(countryCapital(country))


//Task 2

  sealed trait Animal {

    def fact:String
  }

  case object Tiger extends Animal{
    def fact:String = "has stripes"
  }
  case object Lion extends Animal{
    def fact:String = "has stripes"
  }
  case object Wolf extends Animal{
    def fact:String = "has stripes"
  }
  case object Turtle extends Animal{
    def fact:String = "has stripes"
  }
  case object Fish extends Animal{
    def fact:String = "has stripes"
  }

def getAnimalFact(animal: Animal): String =
  animal match {
    case Tiger => Tiger.fact
    case Lion => Lion.fact
    case Wolf => Wolf.fact
    case Turtle => Turtle.fact
    case Fish => Fish.fact
  }
println(getAnimalFact(Tiger))

//Task 3


}
