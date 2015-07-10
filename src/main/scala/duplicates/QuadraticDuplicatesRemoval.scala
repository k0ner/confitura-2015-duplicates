package duplicates

import scala.annotation.tailrec
import scala.collection.mutable

object QuadraticDuplicatesRemoval {

  def remove[A >: Equalable](seq: Seq[A]): Seq[A] = {

    val buffer = mutable.Buffer(seq: _*)

    var i = 0
    while (i < buffer.length) {
      var j = i + 1
      while (j < buffer.length) {
        if (buffer(i) == buffer(j)) {
          buffer.remove(j)
        } else {
          j = j + 1
        }
      }
      i = i + 1
    }

    buffer.toSeq
  }


  def removeRec[A >: Equalable](seq: Seq[A]): Seq[A] = {

    @tailrec
    def removeRec(seq: Seq[A], acc: List[A]): List[A] = seq match {
      case Nil => acc.reverse
      case head :: tail => removeRec(tail, if (acc.contains(head)) acc else head :: acc)
    }

    removeRec(seq, List())
  }
}
