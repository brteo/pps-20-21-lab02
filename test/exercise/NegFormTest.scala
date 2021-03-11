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

  @Test def testNegGeneric(){
    val empty: String => Boolean = _==""
    val notEmpty: String => Boolean = negGeneric(empty)
    assertTrue(notEmpty("test"))
    assertFalse(notEmpty(""))

    val zero: Int => Boolean = _==0
    val notZero: Int => Boolean = negGeneric(zero)
    assertTrue(notZero(1))
    assertFalse(notZero(0))

    val even: Int => Boolean = _%2==0
    val notEven: Int => Boolean = negGeneric(even)
    assertTrue(notEven(1))
    assertFalse(notEven(2))

    val reverse: Boolean => Boolean = !_
    val notReverse: Boolean => Boolean = negGeneric(reverse)
    assertTrue(notReverse(true))
    assertFalse(notReverse(false))
  }
}
