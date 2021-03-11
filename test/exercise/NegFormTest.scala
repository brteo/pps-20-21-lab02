package exercise

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

import exercise.NegForm._

class NegFormTest {

  @Test def testEmpty(){
    assertFalse(valFunction.empty("test"))
    assertTrue(valFunction.empty(""))

    assertFalse(defFunction.empty("test"))
    assertTrue(defFunction.empty(""))
  }

  @Test def testNotEmpty(){
    assertTrue(valFunction.notEmpty("test"))
    assertFalse(valFunction.notEmpty(""))

    assertTrue(defFunction.notEmpty("test"))
    assertFalse(defFunction.notEmpty(""))
  }

}
