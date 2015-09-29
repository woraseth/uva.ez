// 11854 - Egypt
// better way to find max, mid, min?

import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if (a == 0 && b == 0 && c == 0) {
        return;
      }
      int max = Math.max(a, Math.max(b, c));
      int min = Math.min(a, Math.min(b, c));
      int mid = a + b + c - max - min;
      if (max * max == min * min + mid * mid) {
        System.out.println("right");
      } else {
        System.out.println("wrong");
      }
    }
  }
}
