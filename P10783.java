// 10783 - Odd Sum

import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int tt = sc.nextInt();
    for (int t = 0; t < tt; t++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = 0;
      for (int i = a; i <= b; i++) {
        if (i % 2 != 0) {
          sum += i;
        }
      }
      System.out.printf("Case %d: %d%n", t + 1, sum);
    }
  }
}
