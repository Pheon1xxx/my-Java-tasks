package Studies;

import java.io.IOException;
import java.util.Scanner;
//����� ������� ������� ����� � �������� �������
public class Test20{
        public static String reverseString(String str) {
            return new StringBuilder(str).reverse().toString();
        }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String Word = scan.nextLine();
        System.out.println(reverseString(Word));
    }
}
