val x = 10

for (i <- 0 to 10) println(i)

val c1 = for (i <- 0.to(10, 2)) yield {
  println(i)
  i + 1
}

for (x <- c1) yield x + 100

def rot13(s: String) = s map {
  case c if 'a' <= c.toLower && c.toLower <= 'm' => c + 13 toChar
  case c if 'n' <= c.toLower && c.toLower <= 'z' => c - 13 toChar
  case c => c
}

var s = "Hello"
var t = rot13(s)
println(s + " => " + t)
println(t + " => " + rot13(t))


def fib(num: Integer) = {

  var temp1 = 0
  var temp2 = 1

  println(temp1)
  if (num >= 1) println(temp2)
  if (num > 1) {
    for (temp3 <- 2 to num - 1) {
      val temp4 = temp2
      temp2 = temp1 + temp2
      println(temp2)
      temp1 = temp4
    }
  }
}

println(fib(10))

def fibRec(num: Integer): Integer = {

  if (num == 1) 0 else if (num == 2) 1 else fibRec(num - 1) + fibRec(num - 2)

}

println(fibRec(10))

def printFib(num: Integer) ={

  for(temp <- 1 to num){
    println(fibRec(temp))
  }
}

printFib(10)


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


def swapAdjacentElements(a: Array[Int]) = {

  for(i <- 0 until (if(a.length %2 == 0) a.length else a.length -1,2)) {
    val t = a(i)
    a(i) = a(i+1)
    a(i+1) = t
  }
  a
}

println(swapAdjacentElements(Array(1, 2, 3, 4, 5)).toList)


def swapFirstTwoElements(a: Array[Int]) = a match {
  case Array(x, y, rest@_*) => Array(y, x) ++ rest
  case _ => a
}

val m = Array(1, 2, 3, 4)
val n = swapFirstTwoElements(m)

println(m.mkString(", "))
println(n.mkString(", "))

import scala.collection.JavaConverters._

val p = """java.+"""
for ((k, v) <- System.getProperties().asScala if k.matches(p)) {
  println(k + " = " + v)
}

def sumLeaf(list: List[Any]): Int = {
  (for (elem <- list) yield (
    elem match {
      case x: List[Any] => sumLeaf(x)
      case x: Int => x
      case _ => 0
    }
    )).sum
}
val t1 = List(List(3, 8), 2, List(5))

println(t1)
println(sumLeaf(t1))




//case class Pair[T, S](val first: T, val second: S)

//val pa = new Pair(1, "Washington")
//
//def getOddIndexElements[T](a2: Array[T]) =
//{for (i <- 0 until a2.length if (i % 2 == 1)) yield a2(i)}
//
//
//
//val a1 = getOddIndexElements(Array("1", "b", "c"))
//
//val a3 = getOddIndexElements(Array(1,2,3))
//
//def foo(x:Int) : String
//def bar(y:String) :Float
//
//val workflow = foo _ andThen bar _
//
//val tempp = workflow(20)

//
class Pair[+T](val first: T, val second: T)
class Person
class Student extends Person
val john = new Student
val mary = new Student
val s2 = new Pair[Student](john, mary)
def makeFriends(p: Pair[Person]) {println("Made friends")}
makeFriends(s2)








