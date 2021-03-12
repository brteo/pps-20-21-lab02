package exercise

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

import exercise.Parity._

class ParityTest {

  def tests( f:Int => String ): Unit ={
    assertEquals("even", f(0))
    assertEquals("odd",  f(1))
    assertEquals("even", f(2))
    assertEquals("odd",  f(-1))
    assertEquals("even",  f(-2))
  }

  @Test def parityValTest(){
    tests(parityVal)
  }

  @Test def parityDefTest(){
    tests(parityDef)
  }
}
