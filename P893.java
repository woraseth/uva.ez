// 893 - Y3K Problem

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      int days = sc.nextInt();
      int d = sc.nextInt();
      int m = sc.nextInt();
      int y = sc.nextInt();
      if (days == 0 && d == 0 && m == 0 && y == 0) {
        return;
      }
      GregorianCalendar cal = new GregorianCalendar(y, m-1, d);
      cal.add(GregorianCalendar.DAY_OF_YEAR, days);
      d = cal.get(GregorianCalendar.DAY_OF_MONTH);
      m = cal.get(GregorianCalendar.MONTH);
      y = cal.get(GregorianCalendar.YEAR);
      System.out.printf("%d %d %d%n", d, m+1, y);
    }
  }
}
