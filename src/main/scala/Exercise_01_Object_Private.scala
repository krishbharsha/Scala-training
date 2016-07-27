
object Exercise_01_Object_Private extends App {


  abstract class Party {
    def info: String
  }

  object Party {

    private class Customer extends Party {
      def info = "Customer"
    }

    private class Merchant extends Party {
      def info = "Merchant"
    }


    // Factory method
    def apply(partyKind: String) = partyKind match {
      case "Customer" => new Customer()
      case "Merchant" => new Merchant()
      case unrecognized =>
          println(s"wrong party kind: $unrecognized")
          null
    }
  }


  val customer = Party("Customer")
  println(customer.info)

  val merchant = Party("Merchant")
  println(merchant.info)

  val thief = Party("Thief") // null

  // val customer2 = new Customer() // Customer is not visible here

}
