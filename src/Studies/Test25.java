package Studies;

import java.util.Locale;
//разделение методом Str.split предложения на слова, ("-") разделитель
public class Test25 {
    public static void main(String args[]) {
        String Str = new String("Добро-пожаловать-на-ProgLang.su");
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-")) {
            System.out.println(retval);
        }
    }
}
