package Studies;

import java.util.Scanner;
//���� ���� �����, � ���������� ������� ����� � ������� �� ��������� ������� �����, � ������� ������(������������� ����� ��� 0) ������� ����������
public class Test69 {
    public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            try {
                System.out.println(my_calculator.power(n, p));//��������� ����� ��  class Studies.MyCalculator1, ���� ������� ����������� � ����� �� ������� ���������, ���� ����� ������ ��������� � catch
            }
            catch (Exception e) {
                System.out.println(e);//���� ������� �� ����� ������� ������
            }
        }
    }
}

class MyCalculator1 {
//��� �������, ���� ���� �� ����� ������������� ������� ������, ���� 0 ������� ������ ������, � ������� �������� �������� ����� � �������
    public static int power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception ("n or p should not be negative.");
        }
        else if(n==0 && p ==0){
            throw new Exception("n and p should not be zero.");
        }
        else {
            return ((int)Math.pow(n,p));
        }
    }
}

