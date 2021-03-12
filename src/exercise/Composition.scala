package exercise

object Composition {

  def composeInt(f: Int=>Int, g: Int=>Int)(a:Int):Int = f(g(a))

  /* the constraint is:
  *  g accept type A and return type B
  *  f accept type B from g and return type C
  *  compose accept A for g and return type C from f
  *  A,B,C can be the same type
  */
  def compose[A,B,C](f: B=>C, g: A=>B)(a:A):C = f(g(a))
}
