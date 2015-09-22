// 10300 - Ecological Premium
// easy but has to use long

import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int tt = sc.nextInt();
    for (int t = 0; t < tt; t++) {
      int ff = sc.nextInt();
      long sum = 0;
      for (int f = 0; f < ff; f++) {
        long area = sc.nextInt();
        long ani = sc.nextInt();
        long env = sc.nextInt();
        sum += area * env;
      }
      System.out.println(sum);
    }
  }
}
