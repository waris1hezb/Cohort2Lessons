package Week2.Monday.Family

object Familylogic extends App {
// Everytime we make a new instance of a class using the keyword "new", we are making an object
  new Child("Alice") // 1 use
  val child1 = new Child("Alice") // can reuse this because I can call it with the val.
  val child2 = new Child("Alice")

  println(child1 == child2) // false, they are separate instances.Each is a new object in memory

  println(child1.forename)
 //println(child1.idPlease) // it is private val, so cannot be accessed
  println(child1.under18)


  //Adult
  val adult1: Adult = Adult.apply(new Forename("Waris"), new Surname("Hezb")) //apply method

  val adult2: Adult = new Adult(new Forename("Waris"), new Surname("Hezb")) // new object method

  println(adult1.forename.name)


    //Dog

  val dog1: Dog = Dog.apply(new Name("Sussy"), new NoOfLegs(4), new HasTail(true))

println(dog1.hasTail.tail)

//println(dog1.name.speak)



}
