package duplicates

import org.scalatest.{Matchers, WordSpec}

class LinearDuplicatesRemovalSpec extends WordSpec with Matchers {

  "Linear duplicates removal" should {
    import DuplicatesTestData._
    import LinearDuplicatesRemoval.remove

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

    "leave singleton list unchaged" in {

      remove(singleton) shouldBe singleton
    }

    "handle empty sequence" in {

      remove(Nil) shouldBe Nil
    }

    "should remove duplicated people" in {
      import PeopleTestData._

      remove(listOfPeople) shouldBe uniquePeople
    }
  }

}
