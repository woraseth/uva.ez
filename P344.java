// 344 - Roman Digititis

import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);

  static int[] i = {0, 1, 2, 3, 1, 0, 1, 2, 3, 1};
  static int[] v = {0, 0, 0, 0, 1, 1, 1, 1, 1, 0};
  static int[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

  static int[] count(int n) {
    int m = n/10;
    return new int[] {i[n%10], v[n%10], x[n%10] + i[m%10], v[m%10], x[m%10] + i[m/10]};
  }

  public static void main(String[] args) {
//    for (int j = 10; j <= 100; j++) {
//      System.out.printf("count[%d] = %s%n", j, java.util.Arrays.toString(count(j)));
//    }
   while (sc.hasNextInt()) {
     int n = sc.nextInt();
     if (n == 0) return;
     int[] a = new int[5];
     for (int j = 1; j <= n; j++) {
       int[] res = count(j);
       for (int k = 0; k < a.length; k++) {
         a[k] += res[k];
       }
     }
     System.out.printf("%d: %d i, %d v, %d x, %d l, %d c%n", n, a[0], a[1], a[2], a[3], a[4]);
   }
  }
}
