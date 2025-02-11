package Week2.Monday.AfternoonTask

class Dragonfly(name: String, age: Int, numOfLimbs: Int, val wingPairs: Int)
  extends Insect(name, age, numOfLimbs) with Flyable {

  override val canFly: Boolean = true
  override val wingSpan: Int = wingPairs * 10 // Example calculation

  override def describe(): String =
    super.describe() + s" It has $wingPairs pairs of wings and can fly."
}

object Dragonfly {
  def apply(name: String, age: Int, numOfLimbs: Int, wingPairs: Int): Dragonfly =
    new Dragonfly(name, age, numOfLimbs, wingPairs)
}
