// 489 - Hangman Judge

import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      int round = sc.nextInt();
      if (round == -1) {
        return;
      }
      String word = sc.next();
      String guess = sc.next();
      int wrong = 0;
      for (int i = 0; i < guess.length(); i++) {
        String ch = guess.charAt(i) + "";
        if (word.contains(ch)) {
          word = word.replaceAll(ch, "");
          if (word.length() == 0) {
            break;
          }
        } else {
          wrong++;
          if (wrong == 7) {
            break;
          }
        }
      }

      System.out.println("Round " + round);
      if (wrong == 7) {
        System.out.println("You lose.");
      } else {
        if (word.length() == 0) {
          System.out.println("You win.");
        } else {
          System.out.println("You chickened out.");
        }
      }
    }
  }
}
