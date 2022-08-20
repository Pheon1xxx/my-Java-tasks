package Studies;

import java.util.Scanner;
//лотерея с вводом одного числа и сравниванием его с 4 выигрышными вариантами
public class Test1 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Привет, давай сыграем в лотерею?");
        System.out.print("Введите число от 1 до 100:");

        Scanner myscan = new Scanner(System.in);

        int x;
        x = myscan.nextInt();

        if (x < 0 || x > 100) {
            System.out.println ("Вы ввели число вне заданных границ!");
        } else if (x == 4) {
            System.out.println ("Да, ДЖЭКПОТ, вы выиграли ГЛАВНЫЙ ПРИЗ 1000000 $!");
        } else if (x == 10) 	{
            System.out.println ("Вам повезло! 100 рублей ваши!");
        } else if (x == 40) 	{
            System.out.println ("В этот раз мы дадим вам 10 рублей!");
        } else if (x == 89) 	{
            System.out.println ("Ваш приз 1000 рублей!");
        } else {
            System.out.println ("Попробуйте ещё в другой раз.");
        }
    }
}





