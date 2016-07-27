
object Exercise_01_Generics extends App {

  val strings = new LinkedList[String]

  strings.add("Hello")
  strings.add("World")
  strings.printAll()


  val ints = new LinkedList[Int]

  ints.add(1)
  ints.add(2)
  ints.printAll()

}
