package main.scala

object Main {
  def main(args: Array[String]): Unit = {

    var s = new Search();
    var index = s.binarySearchR(Array(1, 2, 5, 6, 8, 10), 6)(0, 6)
    var indexIt = s.binarySearchIt(Array(1, 2, 5, 6, 8, 10), 6)
    var indexPM = s.binarySearchPM(Array(1, 2, 5, 6, 8, 10), 6)

    if (index == -1){
      println("Not found")
    } else {
      println("Element is on the index " + index)
    }

    if (index == indexIt && index == indexPM) {
      println("Passed")
    } else {
      println("error to make search the item")
    }

  }
}
