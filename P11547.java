// 11547 - Automatic Answer
import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    //sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      // Multiply n by 567, then divide the result by 9, 
      // then add 7492, then multiply by 235, 
      // then divide by 47, then subtract 498. 
      x *= 567;
      x /= 9;
      x += 7492;
      x *= 235;
      x /= 47;
      x -= 498;
      // What is the digit in the tens column?
      x /= 10;
      if (x < 0) x *= -1;
      System.out.println(x % 10);
      
    }
  }
}
