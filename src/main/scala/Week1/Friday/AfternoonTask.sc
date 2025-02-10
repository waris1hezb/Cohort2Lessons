//MVP
//1.

def numsSquared(num:Int):Int = num*num

numsSquared(10)

 //def checkOdd(num:Int):Boolean = if (num % 2== 0) true else false
def checkOdd(num:Int):Boolean = num % 2!= 0
checkOdd(50)

//3.

def sumOfOddNumbers(numbers: List[Int]): Int = {
  val oddSquaredNumbers = for {
    n <- numbers  // Iterate over numbers
    squared = numsSquared(n)  // Square each number
    if checkOdd(squared)  // Filter only odd squared values
  } yield squared  // Collect the filtered squared numbers

  oddSquaredNumbers.sum  // Sum them up
}

sumOfOddNumbers(List(5,6,7,3))

//4.

def gradingSystem(math: Int, science: Int, english: Int): String = {

  val averageScore = (math + science + english) / 3.0

  if (averageScore < 0 || averageScore > 300) "Invalid score"
  else if (averageScore >= 90) "A"
  else if (averageScore >= 80) "B"
  else if (averageScore >= 70) "C"
  else if (averageScore >= 60) "D"
  else if (averageScore >= 50) "E"
  else "F"

}

gradingSystem(70,75,85)


