// 11172 - Relational Operator

import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int tt = sc.nextInt();
    for (int i = 0; i < tt; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      if (a == b) {
        System.out.println("=");
      } else if (a < b) {
        System.out.println("<");
      } else {
        System.out.println(">");
      }
    }
  }
}
