package Week2.Tuesday.Vehicles

case class ElectricCar(override val brand:String ) extends Car(brand, "Electric") with Electric {

  // you have to override the val because the case class auto generates the val field. the val field being passed down with inheritance needs to be overridden.

  override val timeToCharge: Int = 5

  val noisyToDrive:Boolean = false   //Specific to ElectricCar

}

