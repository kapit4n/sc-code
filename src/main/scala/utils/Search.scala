package utils

class Search {
  def binarySearch(arr: Array[Int], toSearch: Int)(low: Int = 0, high: Int = arr.length - 1): Int = {
    if (low > high) {
      return -1
    }
    var middle = low + (high - low) /  2
    if (arr(middle) == toSearch ) {
      return middle
    } else if(arr(middle) > toSearch){
      return binarySearch(arr, toSearch)(low, middle - 1)
    }else {
      binarySearch(arr, toSearch)(middle + 1, high)
    }
  }
}
