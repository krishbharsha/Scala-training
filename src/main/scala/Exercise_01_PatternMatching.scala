object Exercise_01_PatternMatching extends App {
  // swapFirstTwoElements assignment
  def swapFirstTwoElements(a: Array[Int]) = a match {
    case Array(x, y, rest@_*) => Array(y, x) ++ rest
    case _ => a
  }

  val x = Array(1, 2, 3, 4)
  val y = swapFirstTwoElements(x)

  println(x.mkString(", "))
  println(y.mkString(", "))

  // Print out System properties that start with Java
  import scala.collection.JavaConverters._

  val p = """java.+"""
  for ((k, v) <- System.getProperties().asScala if k.matches(p)) {
    println(k + " = " + v)
  }


  // Get sum of leaves
  def sumLeaf(list: List[Any]): Int = {
    (for (elem <- list) yield (
      elem match {
        case x: List[Any] => sumLeaf(x)
        case x: Int => x
        case _ => 0
      }
      )).sum
  }
  val t = List(List(3, 8), 2, List(5))

  println(t)
  println(sumLeaf(t))

}
