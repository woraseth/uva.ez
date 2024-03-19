// 10082 - WERTYU  
// cool problem title
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] normal = {"1234567890-=",
                           "QWERTYUIOP[]\\",
                           "ASDFGHJKL;'",
                           "ZXCVBNM,./"};
        Map<Character, Character> map = new HashMap();
        for (String s : normal) {
            for (int i = 1; i < s.length(); i++) {
                map.put(s.charAt(i), s.charAt(i-1));
            }
        }
        map.put(' ', ' ');
        map.put('1', '`');
        
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (char c : line.toCharArray()) {
                System.out.print(map.get(c));
            }
            System.out.println();
        }
    }
}
