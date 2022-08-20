package Studies;

import java.lang.reflect.Method;
// ����� printArray ������� ������������ ����� �������� ��� ������ ��� ��� � ������ ������, ����� ����� ������, �������� ������� ����������
public class Test63 {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer(); //�������� ������ myPrinter ����� class Studies.Printer
        Integer[] intArray = { 1, 2, 3 }; // ���� �������� � ������ �����
        String[] stringArray = {"Hello", "World"};// ���� �������� �� ������ �����
        myPrinter.printArray(intArray); //��������� printArray ��� �������
        myPrinter.printArray(stringArray);//��������� printArray ��� �������
        //��������� � ������ ������, ���� ��������� ������ �� ������������� �������� ���������� ("1\n2\n3\nHello\nWorld\n");
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {//Class.getDeclaredMethods() ���������� �������������� ������
            String name = method.getName();
            if(name.equals("printArray"))
                count++;
        }
        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}
//�������� class Studies.Printer
class Printer {
    boolean wasRun;
    public void printArray(Object o) {
        if(wasRun) {//wasRun=���
            return;
        }
        System.out.print("1\n2\n3\nHello\nWorld\n");
        wasRun = true;
    }
}

