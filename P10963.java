// 10963 The Swallowing Ground

import java.util.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    // sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    int testcase = sc.nextInt();
    for (int t = 0; t < testcase; t++) {
      int width = sc.nextInt();
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < width; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        max = Math.max(max, a-b);
        min = Math.min(min, a-b);
      }
      if (t > 0) System.out.println("");
      
      if (max == min) 
        System.out.println("yes");
      else
        System.out.println("no");
    }
  }
}
