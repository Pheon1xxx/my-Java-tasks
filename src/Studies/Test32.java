package Studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
//���������� �� �������� �������� �����, ����� ���������� BigInteger (������ � ����� �������� �������), boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(bigInteger.doubleValue())) - ��������� ��������� ����� �� ������� ��� ��� ���
// ����������� ������ � ����� BigInteger bigInteger = new BigInteger(n);
public class Test32 {
    public static void main(String[] args) throws IOException {
        // ����������� � ���������� ����� Scanner, ���� �������
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        String a = "1";
        BigInteger bigInteger = new BigInteger(n);
        BigInteger one = new BigInteger(a);

        if (bigInteger.equals(one)) {
            System.out.println("not prime");
        }
        else {
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(bigInteger.doubleValue()));
            if (probablePrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
            bufferedReader.close();
        }
    }
}

