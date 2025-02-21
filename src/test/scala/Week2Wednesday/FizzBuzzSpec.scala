package Week2Wednesday

import Week2.Wednesday.FizzBuzz
import org.scalatest.flatspec.AnyFlatSpec

class FizzBuzzSpec extends AnyFlatSpec{

  val fizzbuzz1 = new FizzBuzz

  "FizzBuzz" should "return Fizz if input is divisible by 3 " in {
    assert(fizzbuzz1.fizzBuzz(3) == "Fizz")
  }
  "FizzBuzz" should "return Buzz if input is divisible by 5 " in {
    assert(fizzbuzz1.fizzBuzz(5) == "Buzz")
  }
  "FizzBuzz" should "return FizzBuzz if input is divisible by 3 and 5 " in {
    assert(fizzbuzz1.fizzBuzz(15) == "FizzBuzz")
  }
  "FizzBuzz" should "return string of number if input is not divisible by 3 and 5 " in {
    assert(fizzbuzz1.fizzBuzz(4) == "4")
  }
  "FizzBuzz" should "return string 0 if input is 0 " in {
    assert(fizzbuzz1.fizzBuzz(0) == "0")
  }

}
