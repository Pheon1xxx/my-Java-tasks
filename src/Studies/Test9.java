package Studies;

import java.io.IOException;
import java.util.Scanner;
//проверка строки ввода на число это или нет
public class Test9 {
    public static void main(String[] args) throws IOException {
        Scanner myscan = new Scanner(System.in);
        long T = 0;
        String str2 = myscan.nextLine();
        try {
            T = Long.parseLong(str2);
            System.out.println(T+" вы ввелли число");
        }
        catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }
}