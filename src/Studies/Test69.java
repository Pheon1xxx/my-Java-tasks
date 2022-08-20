package Studies;

import java.util.Scanner;
//ввод двух чисел, и возведение первого числа в степень со значением второго числа, в случаее ошибок(отрицательное число или 0) вывести исключения
public class Test69 {
    public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            try {
                System.out.println(my_calculator.power(n, p));//применяем метод из  class Studies.MyCalculator1, если условие выполняется и верно то выводим результат, если ловим ошибку переходим к catch
            }
            catch (Exception e) {
                System.out.println(e);//если условие не верно вывести ошибку
            }
        }
    }
}

class MyCalculator1 {
//три условия, если одно из чисел отрицательное выводим ошибку, если 0 выводим другую ошибка, в третьем варианте возводим число в степень
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

