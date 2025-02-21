package Week3

object Options extends App {

  trait Pizza {
    val size: Int
    val crust: Option[String]

  }

  object Personal extends Pizza{
    override val size: Int = 7
    override val crust: Option[String] = Some("classic")
  }

  object Small extends Pizza{
    override val size: Int = 9
    override val crust: Option[String] = None
  }

  object Medium extends Pizza{
    override val size: Int = 11
    override val crust: Option[String] = Some("classic")
  }

  val newPizza:Pizza = new Pizza {
    override val size: Int = 11
    override val crust: Option[String] = Some("stuffed")
  }



  def whatCrust(pizza: Pizza): String = {
    pizza.crust match {
      case Some("classic") => "Classic crust"
      case Some("italian") => "Italian crust"
      case Some("stuffed") => "Stuffed crust"
      case None => "Just the default classic"
    }
  }

   println(whatCrust(newPizza))


  //getOrElse
  println(newPizza.crust.get) // gets whatever is in Some method. but cant do on None so use getOrElse
  println(newPizza.crust.getOrElse("classic")) //either gets the contents or returns the default


//  case class ChocloteBar(filling:Option[String])
//
//  def getFilling(chocloteBar: ChocloteBar): String = chocloteBar.filling.getOrElse("just choclote")
//
//
//  val chocloteBar = Choclote(Some("caramel"))
//  val chocloteBarNew = Choclote(None)
//
//  println(chocloteBar.filling.getOrElse("classic"))
//  println(chocloteBarNew.filling.getOrElse("classic"))
//
//
//
}
