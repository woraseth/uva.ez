// 759 - The Return of the Roman Empire
// level 4?

import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (sc.hasNextLine()) {
      String roman = sc.nextLine();
      if (roman.length() == 0) {
        System.out.println(0);
        continue;
      }
      int arab = Roman.toArabic(roman);
      if (arab >= 4000 || !roman.equals(Arabic.toRoman(arab))) {
        System.out.println("This is not a valid number");
      } else {
        System.out.println(arab);
      }
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
class Roman {

  static String[][] romanDigit = {
    {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
    {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
    {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}
  };

  static char[] ch0 = {'C', 'X', 'I'};
  static char[] ch1 = {'D', 'L', 'V'};
  static char[] ch2 = {'M', 'C', 'X'};

  static int toArabic(String roman) {
    int sum = 0;
    int start = 0;
    for (; start < roman.length(); start++) {
      if (roman.charAt(start) != 'M') {
        break;
      }
    }
    sum += 1000 * start;

    int digit = 100;
    for (int index = 0; index < romanDigit.length; index++) {
      int end = start;
      for (; end < roman.length(); end++) {
        char c = roman.charAt(end);
        if (c != ch0[index] && c != ch1[index] && c != ch2[index]) {
          break;
        }
      }
      String s = roman.substring(start, end);
      for (int i = 0; i < romanDigit[index].length; i++) {
        if (s.equals(romanDigit[index][i])) {
          sum += i * digit;
          break;
        }
      }
      start = end;
      digit /= 10;
    }
    return sum;
  }
}
