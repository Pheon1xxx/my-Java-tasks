package Studies;

import java.io.IOException;
import java.util.Scanner;
//����� ������� �������� �������� � ����� ������� ����� �������, char[] dst=new char[End - Start]; - ����� ��������, Word.getChars(Start, End, dst, 0) - ������� �������� �������� Start+1 �� End
public class Test19 {
    public static void main(String[] args) throws IOException {
        Scanner my = new Scanner(System.in);
        int n;
        String Word = my.next();
        n=Word.length();
        int Start = my.nextInt();
        int End = my.nextInt();
        char[] dst=new char[End - Start];
        Word.getChars(Start, End, dst, 0);
        System.out.println(dst);
    }
}

