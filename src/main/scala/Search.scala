package main.scala

class Search {

  // use recursion
  def binarySearch(arr: Array[Int], toSearch: Int)(low: Int = 0, high: Int = arr.length - 1): Int = {
    if (low > high) return -1

    var middle = low + (high - low) / 2

    if (arr(middle) == toSearch) return middle

    else if (arr(middle) > toSearch) {
      return binarySearch(arr, toSearch)(low, middle - 1)
    }else {
      return binarySearch(arr, toSearch)(middle + 1, high)
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
}
