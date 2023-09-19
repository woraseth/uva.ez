// 12279 - Emoogle Balance
import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    //sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int c = 1;
    while (true) {
      int n = sc.nextInt();
      if (n == 0) break;
      int count = 0;
      for (int i = 0; i < n; i++) {
        if (sc.nextInt() == 0)
          count--;
        else
          count++;
      }
      System.out.printf("Case %d: %d%n", c++, count);
    }
  }
}
