
object Exercise_01_Traits extends App {


  class Check {
    def check(): String = "[Checked application]"
  }

  trait EmploymentCheck extends Check {
    override def check(): String = "[Checked employment] " + super.check()
  }

  trait CreditCheck extends Check {
    override def check(): String = "[Checked credit] " + super.check()
  }

  trait CriminalCheck extends Check {
    override def check(): String = "[Checked criminal record] " + super.check()
  }


  val newEmployeeCheck = new Check with EmploymentCheck with CriminalCheck
  val newRenterCheck = new Check with EmploymentCheck with CriminalCheck with CreditCheck


  println(s"New employee: ${newEmployeeCheck.check}")
  println(s"New renter: ${newRenterCheck.check}")


}
