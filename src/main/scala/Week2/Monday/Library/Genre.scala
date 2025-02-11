package Week2.Monday.Library

trait Genre {
  def enjoy:String = "Enjoy your book"
}

trait Fantasy extends Genre{
  override def enjoy: String = "Enjoy your fantasy book"
}

trait Thriller extends Genre