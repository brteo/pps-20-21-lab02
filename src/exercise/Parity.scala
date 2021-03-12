package exercise

object Parity {

  val parityVal: Int => String = {
    case n if n%2==0 => "even"
    case _ => "odd"
  }

  def parityDef(n:Int): String = n match {
    case n if n%2==0 => "even"
    case _ => "odd"
  }
}