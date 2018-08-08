import org.scalatest.FlatSpec

class ForComprehensionsSpec extends FlatSpec {

  "There" should "two persons in their twenties" in {
    val userBase = List(new User("Travis", 28),
      new User("Kelly", 33),
      new User("Jennifer", 44),
      new User("Dennis", 23))

    val twentySomethings = personsInTheirTwenties(userBase)
    twentySomethings.foreach(name => println(name))
  }

  case class User(val name: String, val age: Int)

  def personsInTheirTwenties(userBase: List[User]): List[String] = {

    val twentySomethings = for (user <- userBase if (user.age >= 20 && user.age < 30))
      yield user.name // i.e. add this to a list
    twentySomethings
  }
}