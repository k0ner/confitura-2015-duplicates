package duplicates

import org.scalatest.{Matchers, WordSpec}

class QuadraticDuplicatesRemovalSpec extends WordSpec with Matchers {

  "Quadratic duplicates removal" should {
    import DuplicatesTestData._
    import QuadraticDuplicatesRemoval.{removeRec => remove}

    "remove duplicated integers from sequence" in {

      remove(listOfIntegers) shouldBe listOfIntegers.distinct
    }

    "remove duplicated characters from sequence" in {

      remove(listOfCharacters) shouldBe listOfCharacters.distinct
    }

    "remove duplicated strings from sequence" in {

      remove(listOfStrings) shouldBe listOfStrings.distinct
    }

    "leave unchanged list of uniques" in {

      remove(listOfUniques) shouldBe listOfUniques
    }

    "leave singleton list unchanged" in {

      remove(singleton) shouldBe singleton
    }

    "handle empty sequence" in new {

      remove(Nil) shouldBe Nil
    }
  }
}
