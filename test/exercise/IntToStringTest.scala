package exercise

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

import exercise.IntToString._

class IntToStringTest {

  def intToStringTest( f:Int => String ): Unit ={
    assertEquals("even", f(0))
    assertEquals("odd",  f(1))
    assertEquals("even", f(2))
    assertEquals("odd",  f(-1))
    assertEquals("even",  f(-2))
  }

  @Test def intToStringValTest(){
    intToStringTest(intToStringVal)
  }

  @Test def intToStringDefTest(){
    intToStringTest(intToStringDef)
  }

}
