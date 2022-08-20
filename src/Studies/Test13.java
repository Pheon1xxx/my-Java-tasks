package Studies;

import java.io.IOException;
import java.util.Scanner;
//String NAME = Integer.toString(INT) конвертация числа в строку
public class Test13 {

    public static void main(String[] args) throws IOException {
        Scanner myscan = new Scanner(System.in);
        int n = myscan.nextInt();
        String str = Integer.toString(n);
        if (n<=100 && n>=-100) {
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }
    }
}

