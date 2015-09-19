// 11799 - Horror Dash
// find min, no need to use array

import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int tt = sc.nextInt();
    for (int t = 0; t < tt; t++) {
      int nn = sc.nextInt();
      int max = 0; // Integer.MIN_VALUE;
      for (int n = 0; n < nn; n++) {
        int s = sc.nextInt();
        if (max < s) {
          max = s;
        }
      }
      System.out.printf("Case %d: %d%n", t+1, max);
    }
  }
}
