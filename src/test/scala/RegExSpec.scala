import org.scalatest.FlatSpec

import scala.util.matching.Regex

class RegExSpec extends FlatSpec {

  "The password" should "not be ok" in {
    val password = "A invalid password without number"

    assert(!validatePassword(password))
  }

  "The password" should "be ok" in {
    val password = "A invalid password with 56 number"

    assert(validatePassword(password))
  }

  def validatePassword(password: String): Boolean = {
    val numberPattern: Regex = "[0-9]".r

    numberPattern.findFirstMatchIn(password) match {
      case Some(_) => true
      case None => false
    }
  }

}