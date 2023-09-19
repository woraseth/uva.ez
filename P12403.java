// 12403 - Save Setu
import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    //sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = sc.nextInt();
    int x = 0;
    for (int i = 0; i < n; i++) {
      boolean good = true;
      if (sc.next().charAt(0) == 'd') 
        x += sc.nextInt();
      else 
        System.out.println(x);
    }
  }
}
