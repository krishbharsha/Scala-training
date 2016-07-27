object Exercise_03_Functions extends App {

  def rot13(s: String) = s map {
    case c if 'a' <= c.toLower && c.toLower <= 'm' => c + 13 toChar
    case c if 'n' <= c.toLower && c.toLower <= 'z' => c - 13 toChar
    case c => c
  }

  var s = "Hello"
  var t = rot13(s)
  println(s + " => " + t)
  println(t + " => " + rot13(t))

  // Define the Fibonacci number function fib

  def fib(num: Integer) = {

    var temp1 = 0
    var temp2 = 1

    println(temp1)
    if(num >= 1) println(temp2)
    if(num >1) {
      for (temp3 <- 2 to num-1) {
        val temp4 = temp2
        temp2 = temp1 + temp2
        println(temp2)
        temp1 = temp4
      }
    }
  }

  fib(10)

  // Define the printFibAnony procedure


  def printFibAnony(n: Int) = for (i <- 1 to n) println(i + ": " +
    ((n: Int) => if (n == 1) 0
    else if (n == 2) 1
    else {
      var f1 = 0
      var f2 = 1
      var f = f1 + f2
      for (i <- 3 to n) {
        f = f1 + f2; f1 = f2; f2 = f
      }
      f
    })(i))

  printFibAnony(10)

  // Define the fibRec recursive function

  def fibRec(num: Integer): Integer = {

    if (num == 1) 0 else if (num == 2) 1 else fibRec(num - 1) + fibRec(num - 2)

  }

  println(fibRec(10))

  // Define the printFib procedure

  def printFib(num: Integer) ={

    for(temp <- 1 to num){
      println(fibRec(temp))
    }
  }

  printFib(10)

}
