// 11679  Subprime

import java.util.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    // sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    while (true) {
      final int BANK = sc.nextInt();
      final int RECS = sc.nextInt();
      if (BANK == 0 && RECS == 0) 
        break;
      int[] balance = new int[BANK];
      for (int i = 0; i < BANK; i++) {
          balance[i] = sc.nextInt();
      }
      for (int i = 0; i < RECS; i++) {
        int from = sc.nextInt();
        int to = sc.nextInt();
        int amt = sc.nextInt();
        balance[from - 1] -= amt;
        balance[to - 1] += amt;
      }
      boolean bailout = false;
      for (int i = 0; i < BANK; i++) {
        if (balance[i] < 0) 
          bailout = true;
      }
      String result = bailout ? "N" : "S";
      System.out.println(result);
      
    }
  }
}
