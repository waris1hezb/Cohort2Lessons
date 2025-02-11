package Week2.Monday.AfternoonTask

class Insect(name: String, age: Int, val numOfLimbs: Int) extends Animal(name, age) {

  override def describe(): String =
    super.describe() + s" It has $numOfLimbs limbs."
}

object Insect {
  def apply(name: String, age: Int, numOfLimbs: Int): Insect =
    new Insect(name, age, numOfLimbs)
}
