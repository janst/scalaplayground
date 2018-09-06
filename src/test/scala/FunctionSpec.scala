import org.scalatest.FlatSpec

class FunctionSpec extends FlatSpec {

  "The salary" should "have an increase by two" in {
    val oldSalaries = Seq(20000, 70000, 40000)
    val newSalaries = oldSalaries.map(x => x * 2)

    assertResult(List(40000, 140000, 80000)) {
      newSalaries
    }
  }

  "The elements of array" should "have an increase by tree" in {
    val originalValues = Array(4.56, 2.2, 44.6)
    val newValues = originalValues.map((x: Double) => x * 3)

    assertResult(Array(13.68, 6.6000000000000005, 133.8)) {
      newValues
    }
  }

  "A sequence of values" should "be created" in {
    val newSequence = (1 to 4).map(x => 10 * x)

    assertResult(Seq(10, 20, 30, 40)) {
      newSequence
    }
  }

  "A quarter function" should "be created and used" in {
    def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

    assertResult(1.0) {
      import scala.math._
      valueAtOneQuarter(ceil _)
    }

    assertResult(0.5) {
      import scala.math._
      valueAtOneQuarter(sqrt _)
    }

  }

}