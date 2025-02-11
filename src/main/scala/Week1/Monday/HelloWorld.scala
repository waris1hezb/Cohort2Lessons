package Week1.Monday
import scala.io.StdIn.readLine
object HelloWorld extends App {

  println("Hello World")

  def greetUser(): Unit = {
    println("Enter a greeting: ")
    val input = readLine()

    if (input == "Hello") {
      println("What is your name?")
      val name = readLine()
      println(s"Hello $name")
    } else {
      println("Unknown command")
    }
  }


  greetUser()

  def chatBot(): Unit = {
    println("Say something:")
    val input = readLine().toLowerCase

    input match {
      case "hello"  => println("Hello! How can I help you?")
      case "how are you?" => println("I'm a bot, so I don't have feelings, but thanks for asking!")
      case "what's the weather like?" => println("I don't know, but you can check online!")
      case "bye" => println("Goodbye! Have a great day!")
      case _ => println("I didn't understand that. Try saying 'Hello'.")
    }
  }


  chatBot()




}
