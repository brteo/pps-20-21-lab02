package exercise

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

import exercise.Optionals._
import exercise.Optionals.Option._

class OptionalsTest {
  val sNone: Option[Int] = None()
  val sTrue: Option[Boolean] = Some(true)
  val sFalse: Option[Boolean] = Some(false)

  val s1: Option[Int] = Some(1)
  val s2: Option[Int] = Some(2)
  val s3: Option[Int] = Some(3)
  val s5: Option[Int] = Some(5)

  val sTest: Option[String] = Some("test")

  @Test def defaultTest(){
    assertEquals(s1,s1)
    assertEquals(1, getOrElse(s1,0))
    assertEquals(0, getOrElse(sNone,0))
    assertEquals("Test", getOrElse(sNone,"Test"))

    assertEquals(s2, flatMap(s1)(i => Some(i+1)))
    assertEquals(s3, flatMap(s1)(i => flatMap(s2)(j => Some(i+j))))
    assertEquals(sNone, flatMap(s1)(i => flatMap(sNone)(j => Some(i+j))))
  }

  @Test def filterTest(){
    assertEquals(s5, filter(s5)(_ > 2))
    assertEquals(sNone,  filter(s5)(_ > 8))

    assertEquals(sTest, filter(sTest)(_ == "test"))
    assertEquals(sNone, filter(sTest)(_ == "foo"))
  }

  @Test def mapTest(){
    assertEquals(sTrue, map(s5)(_ > 2))
    assertEquals(sFalse, map(s5)(_ < 5))
    assertEquals(sNone, map(sNone)(_ > 2))

    assertEquals(sTrue, map(sTest)(_ == "test"))
    assertEquals(sFalse, map(sTest)(_ == "foo"))
  }

  @Test def map2Test(){
    assertEquals(Some(10), map2(s2,s5)(_ * _))
    assertEquals(Some("test test"), map2(sTest,sTest)(_ + " " + _))

    assertEquals(sNone,map2(s5,sNone)(_ * _))
    assertEquals(sNone,map2(sNone, s5)(_ * _))
    assertEquals(sNone,map2(sNone,sNone)(_ * _))
  }
}
