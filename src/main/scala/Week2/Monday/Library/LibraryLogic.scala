package Week2.Monday.Library

import Week2.Monday.Family.{Adult,Forename,Surname}

object LibraryLogic extends App {

  val shadowSlave: Book = new Book("Shadow Slave", Adult(new Forename("J.K"), new Surname("Rowling"))) with Fantasy with AudioBook with PhysicalBook with DigitalBook

  println(shadowSlave.author.forename.name)
  println(shadowSlave.title)
  println(shadowSlave.read)
  println(shadowSlave.enjoy)


  val goneGirl: Book = new Book("Gone Girl", Adult(new Forename("Julian"), new Surname("Flynn") )) with Thriller

  println(goneGirl.enjoy)




}


