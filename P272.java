// 272 - TEX Quotes
// more difficult than I thought. " can be nested

import java.util.Scanner;

public class Main {

  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int count = 0;
    String s = "";
    boolean end = false;
    
    while (sc.hasNextLine()) {
      s = sc.nextLine();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        switch (c) {
          case '"': count++;
            if (count % 2 == 1)
              sb.append("``");
            else {
              sb.append("''");
              if (end) {
                count = 0;
                end = false;
              }
            }
            break;
          case '.': end = true; 
          default:
            sb.append(c);
        }
      }
        
      System.out.println(sb.toString());
    }
  }
}
