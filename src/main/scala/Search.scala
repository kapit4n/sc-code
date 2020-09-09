package main.scala

class Search {

  // use recursion
  def binarySearchR(arr: Array[Int], toSearch: Int)(low: Int = 0, high: Int = arr.length - 1): Int = {
    if (low > high) return -1

    var middle = low + (high - low) / 2

    if (arr(middle) == toSearch) return middle

    else if (arr(middle) > toSearch) {
      return binarySearchR(arr, toSearch)(low, middle - 1)
    }else {
      return binarySearchR(arr, toSearch)(middle + 1, high)
    }
  }

  // use a loop to search the item
  def binarySearchIt(arr: Array[Int], toSearch: Int): Int = {
    var low = 0
    var high = arr.length

    while(low <= high) {
      var middle = low + (high - low) / 2
      if (arr(middle) == toSearch) {
        return middle
      } else if (arr(middle) < toSearch) {
        high = middle - 1
      } else {
        low = middle + 1
      }
    }

    -1
  }

  def binarySearchPM(arr: Array[Int], toSearch: Int): Int = {
    def binarySearch(arr: Array[Int], toSearch: Int, low: Int, high: Int): Int = {
      if (low > high) return -1

      var middle = low + (high - low) / 2

      arr match {
        case(arr: Array[Int]) if (arr(middle) == toSearch) => middle
        case (arr: Array[Int]) if (arr(middle) < toSearch) => binarySearch(arr, toSearch, middle + 1, high)
        case (arr: Array[Int]) if (arr(middle) > toSearch) => binarySearch(arr, toSearch, low, middle - 1)
      }
    }
    binarySearch(arr, toSearch, 0, arr.length - 1)
  }
}
