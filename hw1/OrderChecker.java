public class OrderChecker {
  public OrderChecker() {}

  boolean isAscending(int[] arr) {
    for(int i = 0; arr.length > 1 && i < arr.length - 1; i++) {
      if(arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  boolean isDescending(int[] arr) {
    for(int i = 0; arr.length > 1 && i < arr.length - 1; i++) {
      if(arr[i] < arr[i + 1]) {
        return false;
      }
    }
    return true;
  }
}