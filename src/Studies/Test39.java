package Studies;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
//цикл проверки введенных данных - IP или нет? окончание ввода есть ОЕF(пустая строка)
    class Test39{
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
    //MyRegex Паттерн для проверки ведденных данных, на подлиность IP или нет
    static class  MyRegex{
        String pattern =
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    }
}


