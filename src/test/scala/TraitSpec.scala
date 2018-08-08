import org.scalatest.FlatSpec

class TraitSpec extends FlatSpec {

  "The iterator" should "have a foreach method" in {

    class RichStringIter extends StringIterator("Scala") with RichIterator
    val richStringIter = new RichStringIter
    richStringIter foreach println // alternative: richStringIter.foreach(println)
  }


  abstract class AbsIterator {
    type T
    def hasNext: Boolean
    def next(): T
  }

  class StringIterator(s: String) extends AbsIterator {
    type T = Char
    private var i = 0
    def hasNext = i < s.length
    def next() = {
      val ch = s charAt i
      i += 1
      ch
    }
  }

  trait RichIterator extends AbsIterator {
    def foreach(f: T => Unit): Unit = while (hasNext) f(next())
  }
}