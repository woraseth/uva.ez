import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    //sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((int) Math.ceil((a-2)/3.0) * (int) Math.ceil((b-2)/3.0));
        
    }
  }
}
