package duplicates

import org.scalatest.{Matchers, WordSpec}

class QuickSortSpec extends WordSpec with Matchers {

  "Quick sort" should {
    import QuickSort._
    import duplicates.DuplicatesTestData._

    "sort non empty list" in {

      qsort(listOfIntegers.map(Integer.valueOf)) shouldBe listOfIntegers.sorted
    }

    "sort already sorted list" in {

      val sortedList = listOfIntegers.sorted

      qsort(sortedList.map(Integer.valueOf)) shouldBe sortedList
    }

    "sort empty list" in {

      qsort(Nil) shouldBe Nil
    }

    "sort singleton list" in {

      qsort(singleton.map(Integer.valueOf)) shouldBe singleton
    }
  }

}
