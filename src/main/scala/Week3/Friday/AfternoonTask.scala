package Week3.Friday

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.util.{Failure, Success}

// Main object containing the program logic
object AfternoonTask extends App {

  // Case class representing a Name
  case class Name(value: String)

  // Companion object for Name containing validation logic
  object Name {
    def nameOrError(maybeName: String): Either[InvalidNameError, Name] =
      if (maybeName.exists(_.isDigit)) // Checks if the name contains a digit
        Left(InvalidNameError("Not a valid name"))
      else
        Right(Name(maybeName))
  }

  // Case class representing a Postcode
  case class Postcode(value: String)

  // Companion object for Postcode containing validation logic
  object Postcode {
    def postcodeOrError(maybePostCode: String): Either[InvalidPostcodeError, Postcode] =
      maybePostCode match {
        case postcode if postcode.split(" ").length == 2 => Right(Postcode(maybePostCode)) // Checks if it contains a space
        case _ => Left(InvalidPostcodeError("Not a valid postcode"))
      }
  }

  // Case class representing a Letter containing a Name and Postcode
  case class Letter(name: Name, postCode: Postcode)

  // Companion object for Letter containing validation logic
  object Letter {
    def letterOrError(maybeName: String, maybePostcode: String): Either[GenericPostageError, Letter] =
      for {
        name <- Name.nameOrError(maybeName) // Validate name
        postCode <- Postcode.postcodeOrError(maybePostcode) // Validate postcode
      } yield {
        Letter(name, postCode) // Create Letter if both validations pass
      }
  }

  // Trait for generic postage errors
  trait GenericPostageError {
    def message: String
  }

  // Case class for invalid name errors
  case class InvalidNameError(message: String) extends GenericPostageError

  // Case class for invalid postcode errors
  case class InvalidPostcodeError(message: String) extends GenericPostageError

  // Function to fetch a Letter asynchronously
  def fetchLetter(): Future[Letter] = Future {
    Thread.sleep(2000) // Simulating a delay of 2 seconds
    Letter(Name("Alice"), Postcode("AB12 CD3")) // Returning a valid letter
  }

  // Call the fetchLetter method and store the Future
  val eventualLetter: Future[Letter] = fetchLetter()

  // Wait for the Future to complete (max 2 seconds)
  Await.ready(eventualLetter, 2.seconds)

  // Matching on the completed Future's value
  eventualLetter.value match {
    case Some(Success(foundLetter)) => println(s"Success! Letter received: $foundLetter")
    case Some(Failure(exception)) => println(s"Failure: ${exception.getMessage}")
    case None => println("The Future has not completed yet!")
  }

  // Creating valid and invalid letter instances
  val letter: Right[Nothing, Letter] = Right(Letter(Name("Simon Singh"), Postcode("AB12 CD3")))
  val invalidLetter: Left[InvalidNameError, Nothing] = Left(InvalidNameError("Not a name!!!"))

  println("Right of a valid letter: " + letter)
  println("Left of an invalid letter: " + invalidLetter)

  // Testing different validation scenarios
  val letterWithANumberInName: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Simon Singh123", maybePostcode = "AB12 CD3")

  val letterWithAnInvalidPostcode: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Simon Singh", maybePostcode = "AB12CD3")

  val letterAllInvalid: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Simon Singh123", maybePostcode = "AB12CD3")

  val letterAllValid: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Simon Singh", maybePostcode = "AB12 CD3")

  // Printing the results of validation
  println("\nMade using the .letterOrError method:")
  println("Left of a letter due to having numbers in the name: " + letterWithANumberInName)
  println("Left of a letter due to having no space in the postcode: " + letterWithAnInvalidPostcode)
  println("Left of a letter due to having invalid name and postcode: " + letterAllInvalid)
  println("Right of a valid letter: " + letterAllValid)
}


