package Studies;

import java.io.IOException;
import java.util.Scanner;
//сравнение слов
public class Test21 {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String Word = scan.nextLine();
        String Drow = reverseString(Word);
        if (Word.equals(Drow)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
