// 12577 - Hajj-e-Akbar
import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    //sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int c = 1;
    while (true) {
      String s = sc.next();
      if (s.equals("*")) 
        break;
      else if (s.equals("Hajj")) 
        System.out.printf("Case %d: Hajj-e-Akbar%n", c++);
      else   
        System.out.printf("Case %d: Hajj-e-Asghar%n", c++);     
    }
  }
}
