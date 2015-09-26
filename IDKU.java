// Identity of Kasetsart University
// (Integrity)	(Determination)	(Knowledge Creation)	(Unity)

public class IDKU {

  public static void main(String[] args) {
    final int n = 5;
    String[] a = {
      "XXX  XXX   X  X  X  X",
      " X   X  X  X X   X  X",
      " X   X  X  XX    X  X",
      " X   X  X  X X   X  X",
      "XXX  XXX   X  X   XX ",};
    for (int i = 0; i < a.length; i++) {
      String s = a[i];
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < s.length(); k++) {
          char c = s.charAt(k);
          for (int l = 0; l < n; l++) {
            System.out.print(c);
          }
        }
        System.out.println();
      }
    }
  }
}
