package Studies;

import java.util.Scanner;

//������� ����� ���� switch-case, ����������� � ����� ������� case ������ ���� break
public class Test4 {
    public static void main(String[] args) {
        System.out.println("������, ����� ������� � �������?");
        System.out.print("������� ����� �� 1 �� 100:");
            Scanner myscan = new Scanner (System.in);
            int x = myscan.nextInt ();
            switch (x) {
                case 4:
                    System.out.println ("�� �������� ������� ����!");
                    System.out.println ("��� ������� ��������!");
                    break;
                case 10:
                    System.out.println ("�� �������� 100 ������!..");
                    break;
                case 40:
                    System.out.println ("�� �������� 10 ������!..");
                    break;
                case 89:
                    System.out.println ("�� �������� 1000 ������!..");
                    break;
                default:
                    System.out.println ("���������� ��� � ��������� ���!");
                    break;
            }
    }
}