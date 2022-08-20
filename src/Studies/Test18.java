package Studies;

import java.io.IOException;
// public static String firstUpperCase(String word) делает первую букву слова большой
public class Test18 {
    public static String firstUpperCase(String word){
        if (word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    public static void main(String[] args) throws IOException {
        String var = "name";
        System.out.println("get" + firstUpperCase(var) + "()");//Выведет: "getName()"
    }
}