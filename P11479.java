// 11479 - Is this the easiest problem?
// sort helps
// has to use 'long'
/*
6
5 4 -1
5 4 0
5 4 3
5 4 8
5 4 9
2000000000 2000000000 2000000001
*/


import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int tt = sc.nextInt();
    for (int t = 0; t < tt; t++) {
      long[] p = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
      Arrays.sort(p);
      if (p[0] <= 0) {
        System.out.printf("Case %d: Invalid%n", t+1);
      } else if (p[0] == p[1] && p[1] == p[2]) {
        System.out.printf("Case %d: Equilateral%n", t+1);
      } else if (p[0] == p[1] && p[0] + p[1] > p[2]){
        System.out.printf("Case %d: Isosceles%n", t+1);
      } else if (p[1] == p[2] && p[1] + p[2] > p[0]){
        System.out.printf("Case %d: Isosceles%n", t+1);
      } else if (p[0] + p[1] > p[2] ) {
        System.out.printf("Case %d: Scalene%n", t+1);
      } else {
        System.out.printf("Case %d: Invalid%n", t+1);
      }
    }
  }
}
