
object Exercise_01_Classes extends App {

  class SalesItem(var name:String, var price: Double) {
    println("Constructor start")

    def this(name: String) {
      this(name, 0)
      println("end this(name: String)")
    }

    def this(price: Double) {
      this("unknown", price)
    }

    def this() {
      this("unknown", 0)
    }

    override def toString() = f"Item: $name, price: $$$price%.2f"

    println("Constructor end")
  }


  //  val s1 = new SalesItem("Camera", 100)
  //  println(s1)

  val s2 = new SalesItem("Camera")
  println(s2)

  //  val s3 = new SalesItem(50)
  //  println(s3)
}
