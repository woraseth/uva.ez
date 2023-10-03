// 12554 A Special “Happy Birthday” Song!!!

import java.util.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    String lyric = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
    String[] a = lyric.split(" ");

    // sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    int n = sc.nextInt();
    String[] people = new String[n];
    boolean[] sing = new boolean[n];
    for (int i = 0; i < n; i++) {
      people[i] = sc.next();
    }

    int pos = 0;
    while (true) {
      for (int i = 0; i < a.length; i++) {
        System.out.printf("%s: %s%n", people[pos], a[i]);
        sing[pos] = true;
        pos++;
        if (pos == people.length) pos = 0;
      }
      boolean allSing = true;
      for (boolean b : sing) if (b == false) allSing = false;
      if (allSing) break;
    }
  }
}
