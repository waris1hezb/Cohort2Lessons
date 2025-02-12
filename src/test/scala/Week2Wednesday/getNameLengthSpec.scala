package Week2Wednesday

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import Week2.Wednesday.getNameLength
class getNameLengthSpec extends AnyWordSpec with Matchers{

  val getnamelength = new getNameLength()
  val name1: Int = getnamelength.getNameLength("Waris", "Hezb")
  val name2: Int = getnamelength.getNameLength("War", "Hezb")
  val name3:Int = getnamelength.getNameLength("War", "Hez")
  val name4:Int = getnamelength.getNameLength("", "")

  "getNameLength" should {

    "Length of firstname" when {

      "firstname length is > surname length" in {
        name1 shouldBe 5

      }
    }
      "Length of surname" when {

        "firstname length is < surname length" in {
          name2 shouldBe 4

        }
    }
    "output 0 when length is the same" when {

      "firstname length is = surname length" in {
        name3 shouldBe 0

      }
    }


    "return 0" when {
      "firstname and surname are empty" in {
        name4 shouldBe 0
      }









    }


  }



}
