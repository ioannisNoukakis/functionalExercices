import scala.annotation.tailrec

def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  @tailrec
  def loop(as: Array[A], n: Int): Boolean = if (n + 1 >= as.length) {
    true
  } else if (!ordered(as(n), as(n + 1))) {
    false
  } else {
    loop(as, n + 1)
  }
  loop(as, 0)
}

isSorted(Array(1, 2, 3, 4), (a, b) => a < b)
isSorted(Array(1, 2, 4, 3), (a, b) => a < b)