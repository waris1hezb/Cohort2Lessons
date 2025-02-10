package Week2.Monday.AfternoonTask


class Animal(val name: String, val age: Int) {

  def describe(): String = s"$name is $age years old."
  //Simple description of animal
}

object Animal {
  def apply(name: String, age: Int): Animal = new Animal(name, age)
}
//Allows you to create animals object without using new.