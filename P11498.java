// 11498 - Division of Nlogonia

import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      int tt = sc.nextInt();
      if (tt == 0) {
        break;
      }
      int dx = sc.nextInt();
      int dy = sc.nextInt();

      for (int i = 0; i < tt; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        x -= dx;
        y -= dy;
        if (x == 0 || y == 0) {
          System.out.println("divisa");
        } else if (y > 0) {
          if (x < 0) {
            System.out.println("NO");
          } else {
            System.out.println("NE");
          }
        } else {
          if (x < 0) {
            System.out.println("SO");
          } else {
            System.out.println("SE");
          }
        }
      }
    }
  }
}
