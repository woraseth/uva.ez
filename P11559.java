// 11559 - Event Planning
// skip some input if overbudget
// can run in 0.116 sec

import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (sc.hasNextInt()) {
      int person = sc.nextInt();
      int budget = sc.nextInt();
      int hotel = sc.nextInt();
      int week = sc.nextInt();
      int pay = Integer.MAX_VALUE;
      outer:
      for (int i = 0; i < hotel; i++) {
        int price = sc.nextInt();
        if (price * person > budget || price * person > pay) {
          sc.nextLine();
          sc.nextLine();
          continue;
        }
        for (int w = 0; w < week; w++) {
          int vacant = sc.nextInt();
          if (vacant >= person) {
            pay = price * person;
            sc.nextLine();
            continue outer;
          }
        }
      }
      if (pay == Integer.MAX_VALUE) {
        System.out.println("stay home");
      } else {
        System.out.println(pay);
      }
    }
  }
}
