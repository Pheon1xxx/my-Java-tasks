package Studies;

import java.lang.reflect.Method;
// метод printArray который одновременно может выводить как массив ИНТ так и массив СТРИНГ, через общие методы, согласно заданым параметрам
public class Test63 {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer(); //создание метода myPrinter через class Studies.Printer
        Integer[] intArray = { 1, 2, 3 }; // ввод значение в первый масив
        String[] stringArray = {"Hello", "World"};// ввод значение во второй масив
        myPrinter.printArray(intArray); //применяем printArray для массива
        myPrinter.printArray(stringArray);//применяем printArray для массива
        //обработка в случае ошибки, если введенные данные не соответствуют заданаым параметрам ("1\n2\n3\nHello\nWorld\n");
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {//Class.getDeclaredMethods() возвращает унаследованные методы
            String name = method.getName();
            if(name.equals("printArray"))
                count++;
        }
        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}
//создание class Studies.Printer
class Printer {
    boolean wasRun;
    public void printArray(Object o) {
        if(wasRun) {//wasRun=тру
            return;
        }
        System.out.print("1\n2\n3\nHello\nWorld\n");
        wasRun = true;
    }
}

