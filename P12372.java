// 12372 - Packing for Holiday

import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    //sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = sc.nextInt();
    int c = 1;
    for (int i = 0; i < n; i++) {
      boolean good = true;
      for (int j = 0; j < 3; j++) {
        if (sc.nextInt() > 20) {
          good = false;
        }
      }
      System.out.printf("Case %d: ", c++);
      if (good) 
        System.out.println("good");
      else 
        System.out.println("bad");
    }
  }
}
