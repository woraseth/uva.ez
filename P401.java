// 401 - Palindromes
// 3AE is a mirror palindrome

import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);
  static char[] mirror = {'A', ' ', ' ', ' ', '3', ' ', ' ', 'H', 'I', 'L', ' ', 'J',
    'M', ' ', 'O', ' ', ' ', ' ', '2', 'T', 'U', 'V', 'W', 'X', 'Y', '5'};
  static char[] mirnum = {'1', 'S', 'E', ' ', 'Z', ' ', ' ', '8', ' '};

  static boolean isPalin(String s) {
    int len = s.length();
    int hlen = len / 2;
    for (int i = 0; i < hlen; i++) {
      if (s.charAt(i) != s.charAt(len - i - 1)) {
        return false;
      }
    }
    return true;
  }

  static boolean isMirror(String s) {
    int len = s.length();
    int hlen = len / 2;
    for (int i = 0; i < hlen; i++) {
      char c = s.charAt(i);
      if ('A' <= c && c <= 'Z') {
        if (mirror[c - 'A'] != s.charAt(len - i - 1)) {
          return false;
        }
      } else {
        if (mirnum[c - '1'] != s.charAt(len - i - 1)) {
          return false;
        }
      }
    }
    if (len % 2 != 0) {
      char c = s.charAt(hlen);
      if (c == 'A' || c == 'H' || c == 'I' || c == 'M' || c == 'O' || c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X' || c == 'Y' || c == '1' || c == '8') {
        return true;
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    while (sc.hasNext()) {
      String s = sc.next();
      boolean isPalin = isPalin(s);
      boolean isMirror = isMirror(s);
      if (isMirror && isPalin) {
        System.out.printf("%s -- is a mirrored palindrome.%n", s);
      } else if (isPalin) {
        System.out.printf("%s -- is a regular palindrome.%n", s);
      } else if (isMirror) {
        System.out.printf("%s -- is a mirrored string.%n", s);
      } else {
        System.out.printf("%s -- is not a palindrome.%n", s);
      }
      System.out.println();
    }
  }
}
