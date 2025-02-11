package Week2.Monday.Family


class NoOfLegs(val legs:Int)
class HasTail(val tail:Boolean)
class Name(val name: String)



class Dog(val name: Name, val legs: NoOfLegs, val hasTail: HasTail) {

  def speak: String = s"$name wants a treat"

//  def hasATail = if (hasTail) "Has 4 legs" else " Doesn't have 4 legs"
}

object Dog {
  def apply(name: Name, noOfLegs: NoOfLegs, hasTail: HasTail): Dog = new Dog(name, noOfLegs,hasTail)

}