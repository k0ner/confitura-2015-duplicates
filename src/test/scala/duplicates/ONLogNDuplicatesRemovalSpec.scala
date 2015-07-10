package duplicates

import org.scalatest.{Matchers, WordSpec}

class ONLogNDuplicatesRemovalSpec extends WordSpec with Matchers {

  "N log n duplicates removal" should {
    import DuplicatesTestData._
    import ONLogNDuplicatesRemoval._

    "remove duplicated integers from sequence" in {

      remove(listOfIntegers.map(Integer.valueOf)) shouldBe listOfIntegers.distinct
    }

    "remove duplicated characters from sequence" in {

      remove(listOfCharacters.map(Character.valueOf)) shouldBe listOfCharacters.distinct
    }

    "remove duplicated strings from sequence" in {

      remove(listOfStrings) shouldBe listOfStrings.distinct
    }

    "leave unchanged list of uniques" in {

      remove(listOfUniques.map(Integer.valueOf)) shouldBe listOfUniques
    }

    "leave singleton list unchaged" in {

      remove(singleton.map(Integer.valueOf)) shouldBe singleton
    }

    "handle empty sequence" in new {

      remove(Nil) shouldBe Nil
    }
  }
}
