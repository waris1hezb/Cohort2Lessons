package Week2.Wednesday

class FizzBuzz {


  def fizzBuzz(x: Int): String = {
    if (x % 3 == 0 && x % 5 == 0 && x != 0) {
      "FizzBuzz"  }
    else if (x % 3 == 0 && x != 0) {
      "Fizz"  }
    else if (x % 5 == 0 && x != 0) {
      "Buzz"  }
    else {
      x.toString  }}


}
