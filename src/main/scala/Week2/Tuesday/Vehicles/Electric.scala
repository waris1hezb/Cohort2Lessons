package Week2.Tuesday.Vehicles

trait Electric {
  val timeToCharge: Int //abstract field. - must declare it at the sub class level

  def charge: String = s"Charge me for $timeToCharge hours"

}
