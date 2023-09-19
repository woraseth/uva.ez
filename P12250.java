// 12250 - Language Detection
import java.util.*;
import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    //sc = new Scanner(new FileInputStream("c:\\temp\\in.txt"));
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<String, String> map = new HashMap<>();
    map.put("HELLO", "ENGLISH");
    map.put("HOLA", "SPANISH");
    map.put("HALLO", "GERMAN");
    map.put("BONJOUR", "FRENCH");
    map.put("CIAO", "ITALIAN");
    map.put("ZDRAVSTVUJTE", "RUSSIAN");
    String line = sc.next();
    int i = 1;
    while(!line.equals("#")) {
      if (map.containsKey(line)) {
        System.out.printf("Case %d: %s%n", i++, map.get(line));
      } else {
        System.out.printf("Case %d: UNKNOWN%n", i++);
      }
      line = sc.next();
    }
  }
}
