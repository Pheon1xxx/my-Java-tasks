package Studies;

import java.io.*;
import java.security.*;
//�� ����� ��� ��� ������ ���� ��� � ��� ������ ���������, �� ����� ��������
//������� ��������� ����� � ��������� ��� �������� �� ��� ������ ������� ���������� � ������� 2
public class Test70 {
    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();//��������� ���� � �����
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());//trim() ��������� - ������� ������ �������
            Object o;// ������ �������������� ��� �������� ������ �� ��������� ������ Solution.Inner.Private.
            Inner inner = new Inner();//������� ����� ���������� ������ Inner
            o = inner.new Private();//���������� ������� � �������� inner �� ������ Private
            Inner.Private innerPrivate = (Inner.Private) o;//������� ����� ���������� �� ������ Inner.Private � ����������� �������� �
            String response = innerPrivate.powerof2(num);//��������� �������� ���������� �� ����� � ������� � ������� ������ powerof2 � int num
            System.out.println(num + " is " + response);
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        }

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
    //����������� �������� ���������� ������� �������� �� ����� "power of 2"���"not a power of 2"
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";//���� ����������� ��������� powerof2 �������� power of 2, ���� ��� �� ��������� "not a power of 2"
            }
        }
    }

}

class DoNotTerminate {
    public static class ExitTrappedException extends SecurityException {
        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}