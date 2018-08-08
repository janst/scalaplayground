import org.scalatest.FlatSpec

class BasicsSpec extends FlatSpec {

  "String concatination" should "work like this" in {
    val stringCat = "The first " + "and the second"
    assert(stringCat == "The first and the second")
  }

  "A variable" must "be possible to re-assign" in {
    var theSum = 1 + 1
    var anotherSum = theSum + 1
    assert(anotherSum == 3)
  }

  "A block" should "return last line as value" in {
    val sumOfBlock = {
      val value1:Int = 4 + 1
      value1 - 3
    }

    assert(sumOfBlock == 2)
  }

  "A function" should "be defined like this" in {
    val add = (x: Int, y: Int) => x + y
    assertResult(3) {
      add(1, 2)
    }
  }


  "The list" should "have five objects" in {
    val list: List[Any] = List(
      "a string",
      732,  // an integer
      'c',  // a character
      true, // a boolean value
      () => "an anonymous function returning a string"
    )

    list.foreach(element => println(element))

    assert(list.size == 5)
  }

  case class Vec(val x: Double, val y: Double) {
    def +(that: Vec) = new Vec(this.x + that.x, this.y + that.y)
  }

  "A vector" should "be able to add elements" in {
    val vector1 = Vec(1.0, 1.0)
    val vector2 = Vec(2.0, 2.0)

    val vector3 = vector1 + vector2
    assertResult(3.0) {
      vector3.x
    }
  }
}