import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    //sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      if (s.equals("1") || s.equals("4") || s.equals("78"))        
        System.out.println("+");
      else if (s.endsWith("35"))        
        System.out.println("-");
      else if (s.charAt(0) == '9' && s.charAt(s.length() - 1) == '4')
        System.out.println("*");
      else 
        System.out.println("?");
    }
  }
}
