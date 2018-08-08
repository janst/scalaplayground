import org.scalatest.FlatSpec

class FunctionSpec extends FlatSpec {

  "The salary" should "have an increase by two" in {
    val oldSalaries = Seq(20000, 70000, 40000)
    val newSalaries = oldSalaries.map(x => x * 2)

    assertResult(List(40000, 140000, 80000)){
      newSalaries
    }
  }
}