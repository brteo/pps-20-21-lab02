package exercise

object Fibonacci {

  def fib(n:Int):Int = n match {
    case 0 | 1 => n
    case _ => fib(n-1) + fib(n-2)
  }

  // thanks to https://medium.com/@frank.tan/fibonacci-tail-recursive-explained-876edf5e86fc
  def fibTail(n: Int): Int = {
    @annotation.tailrec
    def _fibTail(index: Int, prev: Int, current: Int): Int = index match {
      case index if index<=0 => current
      case _ => _fibTail(index - 1, prev + current, prev)
    }

    _fibTail(n,1, 0)
  }
}
