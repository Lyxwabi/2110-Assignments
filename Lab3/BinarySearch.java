public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {1,9,9,9,9,9,9};
    System.out.println(binarySearch(arr, 9));
  }

  private static int binarySearch(int arr[], int target) {
    int lo = 0;
    int hi = arr.length - 1;
    int res = -1;

    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (arr[mid] > target) {
        hi = mid - 1;
      } else if (arr[mid] < target) {
        lo = mid + 1;
      } else {
        res = mid;
        hi = mid - 1;
      }
    }

    return res;
  }
}
