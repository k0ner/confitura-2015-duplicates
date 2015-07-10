package duplicates

object QuickSort {

  def qsort[A <: Comparable[A]](seq: Seq[A]): Seq[A] = seq match {
    case Nil => Nil
    case x :: xs =>
      val smaller = xs.filter(_.compareTo(x) < 0)
      val bigger = xs.filter(_.compareTo(x) >= 0)
      qsort(smaller) ++ List(x) ++ qsort(bigger)
  }
}
