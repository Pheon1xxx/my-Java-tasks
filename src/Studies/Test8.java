package Studies;

import java.io.IOException;
import java.util.Scanner;
//цикл try-catch, проверка числа к какому типу данных принадлежит, Long.parseLong(String) конвертация из строки в численные переменные
public class Test8 {

    public static void main(String[] args) throws IOException {
        Scanner myscan = new Scanner(System.in);
        int q = myscan.nextInt();//количество ввода
        int i = 1;
        while (q >= i) {
            long T = 0;
            String str2 = myscan.nextLine();
            str2 = myscan.next();
            try {
                T = Long.parseLong(str2);
                if (T<=9223372036854775807L && T>2147483647) {
                    System.out.println(T+" can be fitted in:");
                    System.out.println("* long");
                }
                else if (T>=-9223372036854775808L && T<-2147483648) {
                    System.out.println(T+" can be fitted in:");
                    System.out.println("* long");
                }
                else if (T<=2147483647 && T>32767) {
                    System.out.println(T+" can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if (T>=-2147483648 && T<-32768 ) {
                    System.out.println(T+" can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if ( T>=-32768 && T<-128 ) {
                    System.out.println(T+" can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if ( T<=32767 && T>127) {
                    System.out.println(T+" can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if ( T>=-128 && T<=127) {
                    System.out.println(T+" can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else {
                    System.out.println(str2+" can't be fitted anywhere.");
                }
            }
            catch (NumberFormatException e) {
                System.err.println(str2+" can't be fitted anywhere.");
            }
            i++;
        }
    }
}
