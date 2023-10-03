// 12503 - Robot Instructions

import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    // sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    int test = sc.nextInt();
    for (int t = 0; t < test; t++) {
        int n = sc.nextInt();
        String[] a = new String[n];
        int pos = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
          String s = sc.nextLine();
          if (s.charAt(0) == 'S') {
            String[] v = s.split(" ");
            int index = Integer.parseInt(v[v.length - 1]);
            a[i] = a[index-1];
          } else {
            a[i] = s;
          }
          pos += a[i].charAt(0) == 'L' ? -1 : 1;
        }
        System.out.println(pos);
        
    }
  }
}
