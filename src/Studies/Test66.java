package Studies;

import java.util.*;
//�������� ���������� Studies.AdvancedArithmetic � int divisor_sum(int n),
class Test66{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: "); //������ ������ ��� ������ � � ��� �������� void ImplementedInterfaceNames(������������ ����� ����������)
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");//������ ��������� �������� ������ class Studies.MyCalculator
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

//��������� ������� ������� ���� ���������� � ����
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//class Studies.MyCalculator ���������� � ���� ���������� n � �������� � ��� ��������, ���� ����� 1, �� ����� ��������� ����� 1, ������ ��������� ��������� ����� ������ ������ �������� ������ ����� � ���������� �� � ���, ������ ��� �������� ����� ����� ������� ��������
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        if (n <= 1) { return n;
        }
        int res = n + 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res += i;
            }
        }
        return res;
    }
}

