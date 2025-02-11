package Week2.Monday

object Objects extends App{

  object PrimaryColours { //grouping
    val blue: String = "blue"
    val yellow: String = "yellow"
    val red: String = "red"

  }
  //Calling the objects
  println(PrimaryColours.red)
  println(PrimaryColours.yellow.toUpperCase)
  println(PrimaryColours.red.capitalize)



  object Weekdays { //grouping
    val monday: Int = 1
    val tuesday: Int = 2
    val wednesday: Int = 3
    val thursday: Int = 4
    val friday: Int = 5
    val saturday: Int = 6
    val sunday: Int = 7

  }

  println(Weekdays.monday * Weekdays.sunday)
  println(Weekdays.thursday.toString)
  println(Weekdays.friday.*(Weekdays.tuesday))


  //Calling the objects
  println(PrimaryColours.red)
  println(PrimaryColours.yellow.toUpperCase)
  println(PrimaryColours.red.capitalize)
}


