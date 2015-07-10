package duplicates

import scala.annotation.tailrec
import scala.collection.mutable

object LinearDuplicatesRemoval {

  def remove[A >: Hashable](seq: Seq[A]): Seq[A] = {
    val seen = mutable.LinkedHashSet[A]()

    @tailrec
    def build(seq: Seq[A], acc: List[A]): List[A] = seq match {
      case Nil => acc.reverse
      case head :: tail =>
        build(tail, if (!seen(head)) {
          seen += head
          head :: acc
        } else acc)
    }

    build(seq, List())
  }
}
