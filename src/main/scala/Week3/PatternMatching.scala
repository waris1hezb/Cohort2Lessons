package Week3

object PatternMatching extends App {

  val weather: String = "Cold"

  if (weather.toLowerCase() == "cold") {
    println(s"It is $weather! Take a coat.")
  } else if (weather == "raining") {
    println(s"It is $weather! Take an umbrella.")
  } else {
    println(s"$weather is not valid")
  }

  weather.toLowerCase match {
    case "cold" => println(s"It is $weather! Take a coat")
    case "raining" => println(s"It is $weather! Take an umbrella.")
    case _ => s"$weather is not valid" //wildcard -  this will catch anything else

  }

  val numOfWatermelons: Int = 2
  numOfWatermelons match {
    case 1 | 2 | 3 => println("He can carry them without a bag")
    case 4 | 5 => println("He needs a bag")
    case x => println(s"$x is invalid") // _ cannot be string interpolated so use x


  }

  abstract class Notification // have to extend this - abstract

  case class Email(sender:String, title:String, body:String) extends Notification
  case class Text(sender:String, body:String) extends Notification
  case class VoiceNote(sender:String, lengthOfBody:Int) extends Notification

//  val notification: Notification = Text("Mum", "Where are you?")
  val notification: Notification = VoiceNote("Mum", 10)

  notification match {
    case Email(sender, title, body) => println("Email from " + sender)
    case Text(sender, body) if sender == "Mum" => println("Text from"  + sender + ".Message" + body)
    case VoiceNote(sender, lengthOfBody) => println("Voice note from " + sender + lengthOfBody + " seconds")
  }

  //Task 1

  val flavour: String = "Spicy"

  flavour.toLowerCase match {
    case "spicy" => println("Spicy Pizza")
    case "american hot" => println("American Hot pizza")
    case x => println(s"We don't have $x flavour")

  }

//Task 2

  case class Pizza(size:Int, crust:String)

  val pizzaOrder: Pizza = Pizza(14, "stuffed")
  val getPricePizzaOrder = pizzaOrder match {
    case Pizza(7, "classic") => 5.99
    case Pizza(9, "classic") => 10.99
    case Pizza(11, "stuffed") => 5.99
    case Pizza(7, "classic") => 15.99
    case _ => "Enter a valid pizza"

  }

  println(getPricePizzaOrder)

}
