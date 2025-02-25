package Week4.Monday

object AfternoonTask extends App {


  //1.
  object Euro2024 extends Enumeration {
    val Germany = Value("Germany")
    val Scotland = Value("Scotland")
    val Hungary = Value("Hungary")
    val Switzerland = Value("Switzerland")
    val Spain = Value("Spain")
    val Italy = Value("Italy")
    val Croatia = Value("Croatia")
    val Albania = Value("Albania")
    val England = Value("England")
    val Denmark = Value("Denmark")
    val Serbia = Value("Serbia")
    val Slovenia = Value("Slovenia")
    val Belgium = Value("Belgium")
    val Slovakia = Value("Slovakia")
    val Romania = Value("Romania")
    val Ukraine = Value("Ukraine")
    val France = Value("France")
    val Netherlands = Value("Netherlands")
    val Portugal = Value("Portugal")
    val CzechRepublic = Value("Czech Republic")
    val Turkey = Value("Turkey")
    val Georgia = Value("Georgia")
    val Poland = Value("Poland")
    val Austria = Value("Austria")
  }

  def printTeams(teams: List[Euro2024.Value], acc: String = ""): String = {
    teams match {
      case Nil => acc
      case head :: tail =>
        val newAcc = if (acc.isEmpty) head.toString else acc + ", " + head
        printTeams(tail, newAcc)
    }
  }

  // Convert the Enumeration values to a List
  val teamList = Euro2024.values.toList

  // Call the tail-recursive function and print the result
  println(printTeams(teamList))


//2.







  //3.
  def sumOfInt(n:Int): Int = {

    if (n<= 0) 0

    else{
      n + sumOfInt(n-1)
    }
  }
  print(sumOfInt(5))


  //4
  def isEven(list: List[Int], index: Int): Either[String, Boolean] = {
    def helper(lst: List[Int], currentIndex: Int): Either[String, Boolean] = lst match {
      case Nil => Left("Invalid index")  // If list is empty, return error
      case head :: tail =>
        if (currentIndex == index) Right(head % 2 == 0) // Check if number is even
        else helper(tail, currentIndex + 1) // Recursively move to next element
    }

    if (index < 0) Left("Invalid index") else helper(list, 0) // Handle negative index
  }

  val numbers = (1 to 20).toList  // List of integers from 1 to 20

  println(isEven(numbers, 0))  // Right(false)  -> 1 is odd
  println(isEven(numbers, 1))  // Right(true)   -> 2 is even
  println(isEven(numbers, 10)) // Right(false)  -> 11 is odd
  println(isEven(numbers, 19)) // Right(true)   -> 20 is even
  println(isEven(numbers, 20)) // Left("Invalid index") -> Out of bounds
  println(isEven(numbers, -1)) // Left("Invalid index") -> Negative index









}
