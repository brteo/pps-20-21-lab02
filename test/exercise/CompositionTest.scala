package exercise

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import exercise.Composition._

class CompositionTest {

  @Test def compostionIntTest(){
    assertEquals(9,composeInt(_-1,_*2)(5))
    assertEquals(10,composeInt(_/10,_*10)(10))
    assertEquals(21,composeInt(_-(-1),_*2)(10))

    val addOne: Int => Int = _+1
    val square: Int => Int = a => a*a
    assertEquals(26,composeInt(addOne,square)(5))
  }

  @Test def compostionGenericInt(){
    val addOne: Int => Int = _+1
    val square: Int => Int = a => a*a
    assertEquals(26,compose(addOne,square)(5))
  }

  @Test def compostionGenericBoolean(){
    val reverse: Boolean => Boolean = !_
    assertTrue(compose(reverse,reverse)(true))

    val f: Boolean => String = {
      case true => "YES"
      case _ => "NO"
    }
    assertEquals("YES",compose(f,reverse)(false))
    assertEquals("NO",compose(f,reverse)(true))
  }

  @Test def compostionGenericMixed(){
    val round: Double => Int = Math.round(_).toInt
    val greaterThenTen: Int => Boolean = _>10

    assertTrue(compose(greaterThenTen,round)(10.7))
    assertFalse(compose(greaterThenTen,round)(10.2))
  }
}
