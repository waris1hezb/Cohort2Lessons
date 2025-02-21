package Week2Wednesday

import Week2.Wednesday.Username
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class usernameSpec extends AnyWordSpec with Matchers {

  val username1 = new Username


  "checkUsername" should {

    "Return true" when {

      "the username is 8 characters length and all lowercase" in {
        val input = username1.checkUsername("mercator")
        val expected = true
        input shouldBe expected

      }

      "the username is more than 8 characters length and all lowercase" in {
        val input = username1.checkUsername("mercatordigital")
        val expected = true
        input shouldBe expected

      }


    }

    "return false" when {
      "the username is not 8 characters length and are all lowercase" in {
        val input = username1.checkUsername("waris")
        val expected = false
        input shouldBe expected

      }

        "the username is not  8 characters length and are not all lowercase" in {
          val input = username1.checkUsername("Waris")
          val expected = false
          input shouldBe expected

        }

      //Edge cases
      "the username enters an empty string as username" in {
        val input = username1.checkUsername("")
        val expected = false
        input shouldBe expected

      }

      }


    }


  }
