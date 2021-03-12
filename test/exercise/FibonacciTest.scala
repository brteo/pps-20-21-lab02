package exercise

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

import exercise.Fibonacci._

class FibonacciTest {

  def tests( f:Int => Int){
    assertEquals(0,f(0))
    assertEquals(1,f(1))
    assertEquals(1,f(2))
    assertEquals(2,f(3))
    assertEquals(3,f(4))
    assertEquals(5,f(5))
    assertEquals(8,f(6))
    assertEquals(13,f(7))
    assertEquals(21,f(8))
    assertEquals(34,f(9))
  }

  @Test def fibTest(){
    tests(fib)
  }

  @Test def fibTailTest(){
    tests(fibTail)
  }
}
