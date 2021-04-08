package exercise

object Currying{

  val nonCurryingVal : (Int, Int, Int) => Boolean = (x, y, z) => x<=y && y<=z

  val curryingVal : Int => Int => Int => Boolean = x => y => z => x<=y && y<=z

  def nonCurryingDef(x:Int, y:Int, z:Int):Boolean = x<=y && y<=z

  def curryingDef(x:Int)(y:Int)(z:Int):Boolean = x<=y && y<=z
}
