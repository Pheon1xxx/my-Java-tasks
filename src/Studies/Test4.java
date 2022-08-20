package Studies;

import java.util.Scanner;

//лоторея через цикл switch-case, обязательно в конце условий case должен быть break
public class Test4 {
    public static void main(String[] args) {
        System.out.println("Привет, давай сыграем в лотерею?");
        System.out.print("Введите число от 1 до 100:");
            Scanner myscan = new Scanner (System.in);
            int x = myscan.nextInt ();
            switch (x) {
                case 4:
                    System.out.println ("Вы ВЫИГРАЛИ ГЛАВНЫЙ ПРИЗ!");
                    System.out.println ("Это миллион долларов!");
                    break;
                case 10:
                    System.out.println ("Вы выиграли 100 рублей!..");
                    break;
                case 40:
                    System.out.println ("Вы выиграли 10 рублей!..");
                    break;
                case 89:
                    System.out.println ("Вы выиграли 1000 рублей!..");
                    break;
                default:
                    System.out.println ("Попробуйте ещё в следующий раз!");
                    break;
            }
    }
}