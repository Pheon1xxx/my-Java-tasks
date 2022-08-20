package Studies;

import java.io.IOException;
import java.util.Scanner;
//умножение двух положительных цифр
public class Test12 {
    public static void main(String[] args) throws IOException {
        Scanner myscan = new Scanner(System.in);
        int B = myscan.nextInt();
        int H = myscan.nextInt();

        if (B<=0 || H<=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            int S = H*B;
            System.out.println(S);
        }
    }
}

