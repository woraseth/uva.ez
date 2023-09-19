// 12289 - One-Two-Three
import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int diff(String a, String b) {
    int count = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(i))
        count++;
    }
    return count;
  }
  public static void main(String[] args) throws Exception {
    //sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      if (s.length() == 5) {
        System.out.println(3);
      } else if (diff(s, "two") <= 1) {
        System.out.println(2);
      } else {
        System.out.println(1);
      }
    }
  }
}
