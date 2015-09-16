// 673 - Parentheses Balance
// boolean isMatch(c0, c1)

import java.util.Scanner;
import java.util.Stack;

public class Main {

  static Scanner sc = new Scanner(System.in);

  static boolean isMatch(char c0, char c1) {
    if (c0 == '(' && c1 == ')') {
      return true;
    }
    if (c0 == '[' && c1 == ']') {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int tt = sc.nextInt();
    sc.nextLine();
    for (int t = 0; t < tt; t++) {
      String s = sc.nextLine();
//      System.out.println(s);
      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (!stack.isEmpty() && isMatch(stack.peek(), c)) {
          stack.pop();
        } else {
          stack.push(c);
        }
      }
      if (stack.isEmpty()) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
