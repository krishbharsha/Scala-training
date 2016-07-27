object Exercise_01_Arrays extends App {

  // Define the swapAdjacentElements function
  def swapAdjacentElements(a: Array[Int]) = {

    for(i <- 0 until (if(a.length %2 == 0) a.length else a.length -1,2)) {
      val t = a(i)
      a(i) = a(i+1)
      a(i+1) = t
    }
    a
  }

  println(swapAdjacentElements(Array(1, 2, 3, 4, 5)).toList)

  // Define the swapAdjacentElements2 function
  def swapAdjacentElements2(a: Array[Int]) = {


    val b = for(i <- 0 until a.length ) yield if (i == a.length -1 & i%2 == 0) a(i) else if (i%2 == 0) a(i+1) else a(i-1)
    b.toArray

  }

  println(swapAdjacentElements2(Array(1, 2, 3, 4, 5)).toList)

//  // Define the positiveFirst function
//  def positiveFirst(a: Array[Int]) = {
//    // Your code here
//  }
//  println(positiveFirst(Array(-1, 2, -3, 4, -5, 0)).toList)
//
//  // Practice with ArrayBuffer
//
}
