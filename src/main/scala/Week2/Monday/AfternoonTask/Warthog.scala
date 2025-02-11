package Week2.Monday.AfternoonTask

class Warthog(name: String, age: Int, furColour: String, hasTail: Boolean, val hasTusks: Boolean)
  extends Mammal(name, age, furColour, hasTail) {

  override def describe(): String =
    super.describe() + (if (hasTusks) " It has large tusks." else " It has no tusks.")
}
// remember to put the val in brackets whenusing if statements

object Warthog {
  def apply(name: String, age: Int, furColour: String, hasTail: Boolean, hasTusks: Boolean): Warthog =
    new Warthog(name, age, furColour, hasTail, hasTusks)
}
