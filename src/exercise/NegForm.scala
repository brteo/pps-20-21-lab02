package exercise

object NegForm {

  object valFunction{
    val empty: String => Boolean = _==""

    val neg: (String => Boolean) => String => Boolean = f => arg => !f(arg)

    val notEmpty: String => Boolean = neg(empty)
  }

  object defFunction{
    def empty(s:String):Boolean = s==""

    def neg(f:String => Boolean):String => Boolean = arg => !f(arg)

    def notEmpty:String => Boolean = neg(empty)
  }

  def negGeneric[A](f:A => Boolean):A => Boolean = !f(_)
}
