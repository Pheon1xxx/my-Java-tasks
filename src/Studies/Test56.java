package Studies;

import java.util.*;
//ќбработка исключений Ч это процесс реагировани€ на возникновение во врем€ вычислений исключений Ч аномальных или исключительных условий, требующих специальной обработки Ч часто измен€ющих нормальный ход выполнени€ программы
//мы должны ввести 2 строки с числами, через try-catch обработать введенные результаты с двумы веро€тными ошибками: введено слово и введен 0, если введены числа поделить первое число на второе

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