// 299 - Train Swapping
// count the number of swap in bubble sort

import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int tt = sc.nextInt();
    for (int t = 0; t < tt; t++) {
      int cc = sc.nextInt();
      int a[] = new int[cc];
      for (int c = 0; c < cc; c++) {
        a[c] = sc.nextInt();
      }

      System.out.printf("Optimal train swapping takes %d swaps.%n", process(a));
    }
  }

  static int process(int[] a) {
    int count = 0;
    for (int i = a.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (a[j] > a[j + 1]) {
          count++;
          int t = a[j];
          a[j] = a[j + 1];
          a[j + 1] = t;
        }
      }
    }
    return count;
  }
}
