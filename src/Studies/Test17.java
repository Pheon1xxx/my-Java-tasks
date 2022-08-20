package Studies;

import java.io.IOException;
import java.util.Scanner;
//Сумма символов строк, compareTo сравнивание переменных, если переменные равны то 0, если А больше В то +, если А меньше В -, firstUpperCase - первая буква будет большой
public class Test17 {
    public static String firstUpperCase(String word){
        if (word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    public static void main(String[] args) throws IOException {
        Scanner my = new Scanner(System.in);
        String A = my.next();
        int a = A.length();
        String B = my.next();
        int b = B.length();

        int result = a+b;
        System.out.println(result);

        int comparedResult = A.compareTo(B);
        if (comparedResult > 0) {
            System.out.println("Yes");
        }
        else if (comparedResult <= 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Ravno");
        }
        System.out.println(firstUpperCase(A)+" "+firstUpperCase(B));
    }
}
