// 494 - Kindergarten Counting Game
// Pattern & Matcher

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    Pattern pattern = Pattern.compile("[a-zA-Z]+");
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      Matcher matcher = pattern.matcher(line);
      int count = 0;
      while (matcher.find()) {
        count++;
      }
      System.out.println(count);
    }
  }
}
