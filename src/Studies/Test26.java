package Studies;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
//���������� ������� ��������� ������, � ��������� �� ����� ������� split �� ����������� ������������("[\\n\\f\\r\\d\\s\\t.,'?!@_]+"), ����� ���������� ���� � ����� ������ ����� � ������ �����
public class Test26 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Str = scanner.nextLine();
        String str = Str.trim();
        if (str.length() == 0){
            System.out.println("0");
        }
            else {
                String tokens[];
                tokens = str.split("[\\n\\f\\r\\d\\s\\t.,'?!@_]+");
                System.out.println(tokens.length);
                for (String token : tokens) {
                System.out.println(token);
                }
        }
    }
}
