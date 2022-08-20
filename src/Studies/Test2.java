package Studies;

import java.io.IOException;
import java.util.Scanner;
//миникалькулятор
public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Привет! Давай я помогу тебе посчитать!");
        System.out.print("Введите первое число:");
        int x = myscan.nextInt();
        System.out.print("Введите математический знак (+,-,*,/):");
        char z = (char) System.in.read();
        System.out.print("Введите второе число:");
        int y = myscan.nextInt();
        int res = 0;
        double ress = 0;
        int res1 = 0;
        double ress1 = 0;


        if (z == '+') {
            res = x + y;
            System.out.println("Вот ваш результат:"+res);
        }
        else if (z == '-') {
            res = x - y;
            System.out.println("Вот ваш результат:"+res);
        }
        else if (z == '*') {
            res = x * y;
            System.out.println("Вот ваш результат:"+res);
        }
        else if (z == '/') {
            double xy = x;
            double yx = y;
            ress = xy / yx;
            System.out.println("Вот ваш результат:"+ress);
        }
        else if (z != '-' || z != '+' || z != '*' || z != '/') {
            System.out.println("Вы ввели неправильный математический знак!");
        }
        else {
            System.out.println("Вы не нуждаетесь в моих услугах");
        }


        System.out.println("Вы желаете делать еще какие-то действия с полученным результатом?");
        System.out.print("Ответьте да или нет:");
        String a;
        a = myscan.next();
        String yes = "да";
        String no = "нет";


        if (a.equals(yes) == true) {
            if (res > 0) { //если res = 0 мы цикл не выполняем, значит перед этим был результат с запятой.
                System.out.print("Введите математический знак (+,-,*,/):");
                char q = (char) System.in.read();
                System.out.print("Ведите следующее число:");
                int e = myscan.nextInt();

                if (q == '+') {
                    res1 = res + e;
                    System.out.println("Вот ваш результат:" + res1);
                }
                else if (q == '-') {
                    res1 = res - y;
                    System.out.println("Вот ваш результат:" + res1);
                }
                else if (q == '*') {
                    res1 = res * y;
                    System.out.println("Вот ваш результат:" + res1);
                }
                else if (q == '/') {
                    double xe = e;
                    double xa = res;
                    ress1 = xa/xe;
                    System.out.println("Вот ваш результат:" + ress1);
                }
                else if (z != '-' || z != '+' || z != '*' || z != '/') {
                    System.out.println("Вы ввели неправильный математический знак!");
                }
                else {
                    System.out.println("Вы не нуждаетесь в моих услугах");
                }
            }

            else if (ress > 0) {
                System.out.print("Введите математический знак (+,-,*,/):");
                char q = (char) System.in.read();
                System.out.print("Ведите следующее число:");
                double e = myscan.nextInt();


                if (q == '+') {
                    ress1 = res + e;
                    System.out.println("Вот ваш результат:" + ress1);
                }
                else if (q == '-') {
                    ress1 = res - e;
                    System.out.println("Вот ваш результат:" + ress1);
                }
                else if (q == '*') {
                    ress1 = res * e;
                    System.out.println("Вот ваш результат:" + ress1);
                }
                else if (q == '/') {
                    ress1 = res / e;
                    System.out.println("Вот ваш результат:" + ress1);
                }
                else if (z != '-' || z != '+' || z != '*' || z != '/') {
                    System.out.println("Вы ввели неправильный математический знак!");
                }
                else {
                    System.out.println("Вы не нуждаетесь в моих услугах");
                }
            }
        }
        else if (a.equals(no) == true) {
            System.out.println("Вы не нуждаетесь в моих услугах");
        }
        else {
            System.out.println("Веддено неправильный ответ. Досвидания");
        }
    }
}
