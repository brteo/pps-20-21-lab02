package exercise

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

import exercise.Currying._

class CurryingTest {

  def nonCurryingTests(f:(Int,Int,Int) => Boolean): Unit ={
    assertTrue(f(1,2,3))
    assertTrue(f(1,1,1))
    assertTrue(f(1,2,2))
    assertTrue(f(-1,0,1))

    assertFalse(f(1,3,2))
    assertFalse(f(1,2,-1))
    assertFalse(f(3,2,1))
  }

  @Test def nonCurryingValTest(){
    nonCurryingTests(nonCurryingVal)
  }

  @Test def nonCurryingDefTest(){
    nonCurryingTests(nonCurryingDef)
  }

  def curryingTests(f: Int =>Int => Int => Boolean): Unit ={
    assertTrue(f(1)(2)(3))
    assertTrue(f(1)(1)(1))
    assertTrue(f(1)(2)(2))
    assertTrue(f(-1)(0)(1))

    assertFalse(f(1)(3)(2))
    assertFalse(f(1)(2)(-1))
    assertFalse(f(3)(2)(1))
  }

  @Test def curryingValTest(){
    curryingTests(curryingVal)
  }

  @Test def curryingDefTest(){
    curryingTests(curryingDef)

    val betweenOntTen: Int => Boolean = curryingDef(1)(_)(10)
    assertTrue(betweenOntTen(5))
    assertFalse(betweenOntTen(20))
  }
}
