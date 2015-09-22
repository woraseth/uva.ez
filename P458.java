// 458 - The Decoder
// has to use DataInputStream

import java.io.DataInputStream;

public class Main {

  public static void main(String[] args) throws Exception {
    DataInputStream dis = new DataInputStream(System.in);
    int i;
    while ((i = dis.read()) != -1) {
      if (i != '\n') {
        System.out.print((char) (i - 7));
      } else {
        System.out.println();
      }
    }

  }
}
