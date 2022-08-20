package Studies;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
//приложение которое считывает строку, и разделяет на слова методом split по определлынм разделителям("[\\n\\f\\r\\d\\s\\t.,'?!@_]+"), вывод количество слов и потом каждое слово с нового рядка
public class Test26 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Str = scanner.nextLine();
        String str = Str.trim();
        if (str.length() == 0){
            System.out.println("0");
        }
            else {
                String tokens[];
                tokens = str.split("[\\n\\f\\r\\d\\s\\t.,'?!@_]+");
                System.out.println(tokens.length);
                for (String token : tokens) {
                System.out.println(token);
                }
        }
    }
}
