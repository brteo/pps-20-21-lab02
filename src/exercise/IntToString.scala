package exercise

object IntToString {
  val intToStringVal: Int => String = {
    case n if n%2==0 => "even"
    case _ => "odd"
  }

  def intToStringDef(n:Int): String = n match {
    case n if n%2==0 => "even"
    case _ => "odd"
  }
}