package Week2.Monday.Family

//Type safe because we use classes as types. also showing companion objects using apply

class Forename(val name: String)
class Surname(surname: String) //Cannot be accessed because we haven't assigned the val

class Adult( val forename: Forename, val surname: Surname) {
  val under18:Boolean = true
}

object Adult {
  def apply(forename: Forename, surname: Surname): Adult =  new Adult(forename,surname)

}
