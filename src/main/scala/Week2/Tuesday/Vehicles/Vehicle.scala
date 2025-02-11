package Week2.Tuesday.Vehicles

abstract class Vehicle(val brand:String) {

  def drive: String //abstract method

  val description: String = s"This vehicle is a $brand."



}
// Abstract class
// Prevent me instantiating a vehicle -  have to extend it
// Cant be a trait because they cant have constructor parameters