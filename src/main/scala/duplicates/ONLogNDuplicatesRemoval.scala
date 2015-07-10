package duplicates

import scala.annotation.tailrec

object ONLogNDuplicatesRemoval {

  def remove[A <: Comparable[A]](seq: Seq[A]): Seq[A] = {
    import QuickSort._

    val sorted = qsort(seq)

    @tailrec
    def remove(seq: Seq[A], acc: List[A]): List[A] = {
      seq match {
        case Nil => acc.reverse // have to reverse the list because each element was added at the beginning of the list
        case x :: Nil => (x :: acc).reverse
        case x :: y :: xs =>
          if (x != y)
            remove(y :: xs, x :: acc)
          else
            remove(y :: xs, acc)
      }
    }

    remove(sorted, List())
  }
}
