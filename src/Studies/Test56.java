package Studies;

import java.util.*;
//��������� ���������� � ��� ������� ������������ �� ������������� �� ����� ���������� ���������� � ���������� ��� �������������� �������, ��������� ����������� ��������� � ����� ���������� ���������� ��� ���������� ���������
//�� ������ ������ 2 ������ � �������, ����� try-catch ���������� ��������� ���������� � ����� ���������� ��������: ������� ����� � ������ 0, ���� ������� ����� �������� ������ ����� �� ������

public class Test56 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        }
        catch(InputMismatchException e) {
            System.out.println(e.getClass().toString().replaceFirst("class ", ""));
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        scan.close();
    }
}