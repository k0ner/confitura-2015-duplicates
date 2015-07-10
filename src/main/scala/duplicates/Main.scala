package duplicates

import scala.annotation.tailrec
import scala.collection.mutable

object Main extends App {

  val charList = io.StdIn.readLine().toCharArray.toList

  def remove[A](seq: Seq[A]): Seq[A] = {
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

  println(remove(charList).toList.mkString)
}
