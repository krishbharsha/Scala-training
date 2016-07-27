import scala.annotation.tailrec

class LinkedList[A] {

  // Private class for the nodes of the list
  // they are not visible to the users of the list
  private class Node[A](elem: A) {

    // The default value is null
    var next: Node[A] = _
    override def toString = elem.toString
  }

  // Reference to the first element of the list
  // aka "head"
  // The default value is null
  private var head: Node[A] = _

  // Add element to the front of the list
  def add(elem: A) = {
    val n = new Node(elem)
    n.next = head
    head = n
    head
  }

  // List is a recursive data structure, so recursive
  // function is a natural solution
  def printAll() {

    // The function is tail recursive - it runs like a loop,
    // without growing the stack
    @tailrec
    def printNodes(n: Node[A]) {
      if (n != null) {
        println(n)
        printNodes(n.next)
      }
    }

    printNodes(head)
  }
}
