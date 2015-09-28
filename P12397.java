// 12397 - Roman Numerals
// Lv 5?
// reuse code from 11616 - Roman Numerals

import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);
  static char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
  static int[] match = {1, 2, 2, 2, 2, 3, 4};

  static int count(String s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      for (int j = 0; j < roman.length; j++) {
        if (c == roman[j]) {
          sum += match[j];
          break;
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    while (sc.hasNext()) {
      String next = sc.next();
      String roman = Arabic.toRoman(Integer.parseInt(next));
      System.out.println(count(roman));
    }
  }
}

class Arabic {

  static String[][] romanDigit = {
    {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
    {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
    {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}
  };

  static String toRoman(int arabic) {
    String roman = "";
    for (int i = 0; i < 3; i++) {
      roman = romanDigit[i][arabic % 10] + roman;
      arabic /= 10;
    }
    for (int i = 0; i < arabic; i++) {
      roman = "M" + roman;
    }
    return roman;
  }
}
