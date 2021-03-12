package exercise

object Shapes {

  sealed trait Shapes

  case class Rect(width:Double, height:Double) extends Shapes
  case class Circle(radius:Double) extends Shapes
  case class Square(width:Double) extends Shapes

  def perimeter(shape: Shapes):Double = shape match {
    case Rect(w,h) => 2*(w+h)
    case Circle(r) => 2*r*Math.PI
    case Square(w) => 4*w
  }

  def area(shape: Shapes):Double = shape match {
    case Rect(w,h) => w*h
    case Circle(r) => Math.PI*(r*r)
    case Square(w) => w*w
  }

  // Round utilities
  def roundAt(p: Int)(n: Double): Double = {
    val s = Math.pow(10, p)
    Math.round(n* s) / s
  }

  def roundAt2(n: Double):Double = roundAt(2)(n)
}
