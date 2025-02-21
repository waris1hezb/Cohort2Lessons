package Week3.Friday

import java.time.LocalDate

object Either extends App {

  //Takes 2 different parameters  -Left(Error) and Right(Success)
  // right bias
  // main use -error handling



  // Error handle using extends exception, don't forget to use val
  class NewError(val errorCode:Int, val errorMessage:String) extends Exception

  //custom error

  case object IsOddError extends NewError(400,"Input is not odd, it is even")


  def isOdd(x:Int): Either[NewError, String] = if (x % 2 != 0 ) Right(s"$x is odd") else Left(IsOddError)

  println(isOdd(4))
  println(isOdd(7))

//2 error handling using Try/Catch

  def plusOne(x:String):Either[String,Int] = {

    try {
      Right(x.toInt +1)
    } catch {
      case exception: Exception => Left(s"Failed due to: $exception") //wildcard
    }
  }
  println(plusOne("7"))
  println(plusOne("seven"))

  //eithers with for comprehensions
  //Good because they fail fast - this means as soon as one condition hits a left, we exit to for comp

  // Validate user

  case class User(userName:String, password:String, dateOfBirth: LocalDate)
  // Conditions
  // 1. Username must be atleast 12 char long
  // 2. Password must be a mixture of upper and lower case
  // 3. Date of birth - must be 18

  case class ValidateUser(userName:String, password:String, dateOfBirth: LocalDate)

  case object UsernameError extends NewError(400, "Username is less than 12 characters long")
  case object PasswordError extends NewError(400, "Password is not a mixture of uppercase and lowercase")
  case object DOBError extends NewError(300, "Age is not over 18")

  val usernameBad = User("user", "password", LocalDate.of(2020,6,5))
  val usernameGood = User("validusername", "pasSSword", LocalDate.of(1960,6,5))



  //1. Username
  def validateUserName(username: String): Either[NewError,String] = {
    if (username.length < 12) Left(UsernameError)
    else Right(username)

  }
  println(validateUserName(usernameBad.userName))
  println(validateUserName(usernameGood.userName))

  //2. Password
  def validateUserPassword(password: String): Either[NewError,String] = {
    if (password == password.toLowerCase && password == password.toUpperCase) Left(PasswordError)
    else Right(password)

  }
  println(validateUserPassword(usernameBad.userName))
  println(validateUserPassword(usernameGood.userName))

  //3. Date of birth
  def validateAge(dateOfBirth:LocalDate): Either[NewError,LocalDate] = {
    if (dateOfBirth.plusYears(18).isAfter(LocalDate.now)) Left(DOBError)
    else Right(dateOfBirth)
  }

  println(validateAge(usernameBad.dateOfBirth))
  println(validateAge(usernameGood.dateOfBirth))

  //4. Put all methods together
  def validateUser(user: User): Either[NewError,ValidateUser] = {

    for {
      username <- validateUserName(user.userName) //calling method. if Right stores in val else shows error
      password <- validateUserPassword(user.password)
      dateOfBirth <- validateAge(user.dateOfBirth)

      validatedUser = ValidateUser(username, password, dateOfBirth)
    } yield validatedUser


  }



}

