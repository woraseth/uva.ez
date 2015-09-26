// 120 - Stacks of Flapjacks
// AC even has diffent (shorter) result than uDebug

import java.util.Scanner;


public class Main {

  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      String[] token = line.split(" ");
      int[] a = new int[token.length];
      for (int i = 0; i < a.length; i++) {
        a[i] = Integer.parseInt(token[i]);
        if (i != 0) System.out.print(" ");
        System.out.print(a[i]);
      }
      System.out.println();
      int maxHome = a.length - 1;
      for (int i = 0; i < a.length; i++) {
        // find max
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < maxHome + 1; j++) {
          if (max < a[j]) {
            max = a[j];
            maxIndex = j;
          }
        }
        if (maxIndex != maxHome) {
          move(a, maxIndex);
          move(a,  maxHome);
        }
        maxHome--;
      }
      System.out.println("0");
//      System.out.println("a = " + java.util.Arrays.toString(a));
    }
  }

  static void move(int[] a, int n) {
//    System.out.println("move " + n);
    System.out.print(a.length - n);
    int m = n;
    for (int i = 0; i <= n/2; i++) {
      int t = a[i];
      a[i] = a[m];
      a[m] = t;
      m--;
    }
    System.out.print(" ");
//    System.out.println("a = " + java.util.Arrays.toString(a));
  }
}
