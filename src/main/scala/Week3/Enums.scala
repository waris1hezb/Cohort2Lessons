package Week3

object Enums extends App {

  //Finite set of data. When working with predefined categories such as days of the week, colours, states or roles

  object Weekday extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  println(Weekday.values)
  println(Weekday.Monday)

  object BetterWeekday extends Enumeration {
    val Monday = Value("Mon")
    val Tuesday = Value("Tue")
    val Wednesday = Value("wed")
    val Thursday = Value("thurs")
    val Friday = Value("fri")

  }

  println(BetterWeekday.values)
  println(BetterWeekday.Monday)

  //Pattern matching example
  def matchwithEnum(weekdays: BetterWeekday.Value) = {

    weekdays match {
      case BetterWeekday.Monday => println("Oh, it's Monday")
      case BetterWeekday.Tuesday => println(s" ${BetterWeekday.Tuesday} ")
      case BetterWeekday.Wednesday => println("Wed")
      case BetterWeekday.Thursday => println("Wed")
      case BetterWeekday.Friday => println("Wed")
    }
  }
  // we want an exhaustive match. all enums are assigned a match case


  matchwithEnum(BetterWeekday.Monday)
  matchwithEnum(BetterWeekday.Tuesday)

  object ReorderedWeekday extends Enumeration {
    val Monday = Value(1)
    val Tuesday = Value(2)
    val Wednesday = Value(3)
    val Thursday = Value(4)
    val Friday = Value(0)

  }

  println(ReorderedWeekday.values)


  //Sealed case objects --> preferred way

  sealed trait Weekday

  case object Monday extends Weekday

  case object Tuesday extends Weekday

  case object Wednesday extends Weekday

  case object Thursday extends Weekday

  case object Friday extends Weekday

  case object Saturday extends Weekday

  case object Sunday extends Weekday


  //Custom errors

  abstract class Error(name: String, errorCode: Int)

  case object NotFound extends Error("Not found", 404)

  case object HairColour extends Error("Hair colour is invalid", 404)


}
