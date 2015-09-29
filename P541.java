// 541 - Error Correction
// decision is firm

import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      final int size = sc.nextInt();
      if (size == 0) {
        return;
      }
      int[][] a = new int[size][size];
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          a[i][j] = sc.nextInt();
        }
      }
      int numCol = 0;
      int col = -1;
      for (int c = 0; c < size; c++) {
        int sum = 0;
        for (int r = 0; r < size; r++) {
          sum += a[r][c];
        }
        if (sum % 2 != 0) {
          col = c;
          numCol++;
        }
      }

      int numRow = 0;
      int row = -1;
      for (int r = 0; r < size; r++) {
        int sum = 0;
        for (int c = 0; c < size; c++) {
          sum += a[r][c];
        }
        if (sum % 2 != 0) {
          row = r;
          numRow++;
        }
      }
      
      if (numRow == 0 && numCol == 0) {
        System.out.println("OK");
      } else if (numRow == 1 && numCol == 1) {
        System.out.printf("Change bit (%d,%d)%n", row+1, col+1);
      } else {
        System.out.println("Corrupt");
      }
    } 
  }
}
