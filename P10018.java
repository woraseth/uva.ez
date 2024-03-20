// 10018 Reverse and Add
import java.util.*;

public class Main {
    static boolean palindrome(long n) {
        String s = String.valueOf(n);
        char[] a = s.toCharArray();
        //if (a.length % 2 != 0) return false;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length-1-i])
                return false;
        }    
        return true;
    }
    static long[] f(long n) {
        long[] a = {0,0};

        while (!palindrome(n)) {
            String s = String.valueOf(n);
            String t = "";
            for (char c : s.toCharArray()) {
                t = c + t;
            }
            n = Long.parseLong(t) + n;
            a[0]++;
            a[1] = n;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            long n = sc.nextLong();
            long[] a = f(n);
            System.out.printf("%d %d%n", a[0], a[1]);
        }
    }
}
