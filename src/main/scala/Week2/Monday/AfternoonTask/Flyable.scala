package Week2.Monday.AfternoonTask

trait Flyable {
  def canFly: Boolean
  def wingSpan: Int
  def fly(): String = if (canFly) "I am flying!" else "I cannot fly."
}