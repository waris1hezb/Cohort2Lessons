package Week2.Monday.Family

class Child (val forename:String) {//() -> In the brackets we put the class parameters. {} -> In the body we put all the logic. methods or vals related to that child

  val under18: Boolean = true

  private def idPlease: String = "Can i see your id? "


}

//companion object

object Child {

  def apply(forename:String): Child = new Child(forename) // shorthand to make new instance of your class.
  // We can access the companion classes private methods


  val bob = Child.apply("bob")

  println(bob.idPlease)


}

