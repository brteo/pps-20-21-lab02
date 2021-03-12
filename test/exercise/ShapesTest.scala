package exercise

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._

import exercise.Shapes._

class ShapesTest {

  @Test def rectPerimeterTest(){
    assertEquals(30, perimeter(Rect(10,5)))
    assertEquals(20.60, roundAt2(perimeter(Rect(2.5,7.8))))
  }

  @Test def rectAreaTest(){
    assertEquals(50, area(Rect(10,5)))
    assertEquals(19.50, roundAt2(area(Rect(2.5,7.8))))
  }

  @Test def circlePerimeterTest(){
    assertEquals(62.83, roundAt2(perimeter(Circle(10))))
    assertEquals(15.71, roundAt2(perimeter(Circle(2.5))))
  }

  @Test def circleAreaTest(){
    assertEquals(314.16, roundAt2(area(Circle(10))))
    assertEquals(19.63, roundAt2(area(Circle(2.5))))
  }

  @Test def squarePerimeterTest(){
    assertEquals(40, perimeter(Square(10)))
    assertEquals(10, roundAt2(perimeter(Square(2.5))))
  }

  @Test def squareAreaTest(){
    assertEquals(100, area(Square(10)))
    assertEquals(6.25, roundAt2(area(Square(2.5))))
  }
}
