import org.scalatest.FlatSpec

class InheritanceSpec extends FlatSpec {

  "The dog" should "be a pet" in {
    new PetContainer[Dog](new Dog)
//    new PetContainer[Lion](new Lion) // Will not compile
  }


  abstract class Animal {
    def name: String
  }

  abstract class Pet extends Animal {}

  class Cat extends Pet {
    override def name: String = "Cat"
  }

  class Dog extends Pet {
    override def name: String = "Dog"
  }

  class Lion extends Animal {
    override def name: String = "Lion"
  }

  class PetContainer[P <: Pet](p: P) {
    def pet: P = p
  }
}