import org.scalatest.FunSuite

class GcdTest extends FunSuite {

  test("Test Euclid's GCD algorithm") {
    val gcd = GCD.gcd(156, 42)
    assert(gcd === 6)
  }

}
