object Exercise_02_ControlStructures extends App {

  // Conditional expressions exercises


  // for-loop exercises


  // for comprehensions exercises

  var s = "Hello"
  var rot13 = "world"
  println(s + " => " + rot13)

  s = rot13
  rot13 = "dummy"
  println(s + " => " + rot13)

  val x = 20
  val y = 30

  if (x > y) println("true")
  else println("false")


  val str1 = "brishna"
  val str2 = "khargava"

  if (str1 >= str2) println("1")
  else println("-1")


  for (i <- 20 until 0 by -10) {
    println(i)
  }
  for (i <- 20 to(0, -5)) {
    println(i)
  }

  for (i <- 20 until 0 by -1; if (i % 5 == 0)) {
    println(i)
  }


  def rot13(s: String) = s map {
    case c if 'a' <= c.toLower && c.toLower <= 'm' => c + 13 toChar
    case c if 'n' <= c.toLower && c.toLower <= 'z' => c - 13 toChar
    case c => c
  }

  var test1 = rot13("hello world")
  println(test1)

}
