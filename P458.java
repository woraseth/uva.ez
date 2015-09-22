// 458 - The Decoder
// WA

import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (sc.hasNextLine()) {
      String s = sc.nextLine();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        c -= 7;
        sb.append(c);
      }
      System.out.println(sb);
    }

  }
}
