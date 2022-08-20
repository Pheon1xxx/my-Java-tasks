package Studies;

import java.io.IOException;
import java.util.Scanner;
// ввод слова - вывод порядкового номера ввода + слово через цикл while
public class Test11 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String ab = scanner.nextLine();
        int a = ab.length();
        int c = 0;
        int b = 1;

        while (a > 0 && b > 0) {
                System.out.printf("%d %s\n", ++c, ab);
                ab = scanner.nextLine();
                b = ab.length();
                if (b==0) {
                    scanner.close();
                }
        }
        scanner.close();
    }
}