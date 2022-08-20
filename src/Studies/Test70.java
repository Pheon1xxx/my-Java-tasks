package Studies;

import java.io.*;
import java.security.*;
//на сайте был уже создан этот код я его только подправил, на сайте работает
//считать введенное число и проверить его является ли оно числом которое возводится в степень 2
public class Test70 {
    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();//запретить вход в класс
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());//trim() подрезать - удалить лишние пробелы
            Object o;// Должен использоваться для хранения ссылки на экземпляр класса Solution.Inner.Private.
            Inner inner = new Inner();//создаем новую переменную класса Inner
            o = inner.new Private();//присвиваем объекту о значение inner из класса Private
            Inner.Private innerPrivate = (Inner.Private) o;//создаем новую переменную из класса Inner.Private и присваиваем значение о
            String response = innerPrivate.powerof2(num);//выполняем проверку возводится ли число в степень с помощью метода powerof2 к int num
            System.out.println(num + " is " + response);
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        }

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
    //присваивает значение переменной которая отвечает за фразу "power of 2"или"not a power of 2"
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";//если выполняется присвоить powerof2 значение power of 2, если нет то присвоить "not a power of 2"
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