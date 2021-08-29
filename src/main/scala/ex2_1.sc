import scala.annotation.tailrec

def fib(n: Int): Int = {
  @tailrec
  def go(a: Int, b: Int, n: Int): Int = {
    if (n - 1 == 1) {
      return a + b
    }
    go(b, a + b, n - 1)
  }
  go(0, 1, n)
}

fib(5)