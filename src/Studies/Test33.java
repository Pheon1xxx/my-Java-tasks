package Studies;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
//(A.add(B)) сумма двух чисел BigInteger, A.multiply(B) умножение двух чисел BigInteger
public class Test33 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}
