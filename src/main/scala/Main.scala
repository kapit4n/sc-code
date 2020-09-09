package main.scala

object Main {
  def main(args: Array[String]): Unit = {

    var s = new Search();
    var index = s.binarySearch(Array(1, 2, 5, 6, 8, 10), 6)(0, 6)

    if (index == -1){
      println("Not found")
    } else {
      println("Element is on the index " + index)
    }
    println("Hello world")
  }
}
