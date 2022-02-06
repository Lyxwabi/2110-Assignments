import java.util.Scanner;

public class MergeSort {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    mergeSort(arr, 0, n - 1);
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");
    }
  }

  private static void mergeSort(int[] arr, int lo, int hi) {
    // Recursion base case
    if (lo >= hi) {
      return;
    }

    int mid = lo + (hi - lo) / 2;
    // mid = (lo + hi) / 2

    mergeSort(arr, lo, mid);
    mergeSort(arr, mid + 1, hi);
    merge(arr, lo, mid, hi);
  }

  private static void merge(int[] arr, int lo, int mid, int hi) {
    int[] temp = new int[hi - lo + 1];
    int p = lo;
    int q = mid + 1;

    int index = 0;
    while (p <= mid && q <= hi) {
      if (arr[p] > arr[q]) {
        temp[index] = arr[q];
        index++;
        q++;
      } else {
        temp[index] = arr[p];
        index++;
        p++;
      }
    }

    while (p <= mid) {
      temp[index++] = arr[p++];
      //index++;
      //p++;
    }

    while (q <= hi) {
      temp[index++] = arr[q++];
      //index++;
      //q++;
    }

    System.arraycopy(temp, 0, arr, lo, hi - lo + 1);
  }
}
