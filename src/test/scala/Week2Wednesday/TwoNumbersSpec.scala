package Week2Wednesday

import Week2.Wednesday.TwoNumbers
import org.scalatest.flatspec.AnyFlatSpec

class TwoNumbersSpec extends AnyFlatSpec {

  "add" should "add two numbers correctly" in {

    val numbers = new TwoNumbers(2,3)  //Making a new instance of my class so i can access the methods
      assert(numbers.add == 5) //This will return a boolean.  Method == Expected

  }

  "subtract" should " subtract should y from x" in {

    val numbers1 = new TwoNumbers(3,2)
      assert(numbers1.subtract == 1)

  }

  "multiply" should "multiply two numbers correctly" in {

    val numbers2 = new TwoNumbers(2,3)
      assert(numbers2.multiply == 6)
  }

  //We want to test edge cases. Test needs to fail but should compile

//    "multiply" should "error when the input is a double" in {
//      val numbers3 = new TwoNumbers(2,3.5)
//      assert(numbers3.multiply != 6)
//
//    }
}
