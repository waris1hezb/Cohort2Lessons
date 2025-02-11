package Week2.Tuesday.Vehicles

object VehicleLogic extends App {

  println("\nCar\n")

  //car is a class
  val ford = new Car("Ford", "Petrol")  //Object of car
  println(ford.fuelType)
  println(ford.drive)
  println(ford.brand)
  println(ford.description)

  val electricFord = ElectricCar("Ford")
  println(electricFord.noisyToDrive)
  println(electricFord.timeToCharge)
}
