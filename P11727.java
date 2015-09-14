// 11727 - Cost Cutting

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);
  BigInteger bi;

  public static void main(String[] args) {
    int tt = sc.nextInt();

    for (int t = 0; t < tt; t++) {
      int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
      Arrays.sort(a);
      System.out.printf("Case %d: %d%n", t + 1, a[1]);
    }
  }
}
