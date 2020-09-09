package main.scala

class Sort {

  // time execution
  def bubbleSortIt(arr: Array[Int]): Array[Int] = {
    for ( i <- 1 to arr.length - 1) {
      for( j <- (i - 1) to 0 by -1) {
        if (arr(j) > arr(j + 1)) {
          val temp = arr(j + 1)
          arr(j + 1) = arr(j)
          arr(j) = temp
        }
      }
    }
    arr
  }

  def bubbleSortF(source: List[Int]): List[Int] = {
    @tailrec
    def sort(iteration: List[Int], source: List[Int], result: List[Int]): List[Int] = source match {
      case h1 :: h2 :: rest => if (h1 > h2) sort(iteration, h1 :: rest, result :+ h2) else sort(iteration, h2 :: rest, result :+ h1)
      case l :: Nil => sort(iteration, Nil, result :+ l)
      case Nil => if (iteration.isEmpty) return result else sort(iteration.dropRight(1), result, Nil)
    }
    sort(source, source, Nil)
  }
}
