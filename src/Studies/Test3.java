package Studies;

import java.util.Scanner;
//сравнивание слов из строки String и вывидение определенных результатов при совпадении или нет.

public class Test3 {
    public static void main (String[] args) throws java.io.IOException {
        System.out.println ("Введите адрес");
        Scanner myscan = new Scanner (System.in);
        String address = myscan.nextLine ();
        // "город Харьков, улица Маяковская, дом 10";

        if ( address.contains ("Харьков"))
            System.out.println ( "Совершите покупку всего за 100$" );
        else
            System.out.println ( "Совершите покупку всего за 10$ " );
//определение количества символов в строке
        int len = address.length ();
        System.out.println ("Вы ввели следующее количество символов: " + len);

        //поиск элемнта в строке, в границах символов
        int begin = address.indexOf(","); // найдём первую запятую - с неё начинается улица в адресе
        System.out.println ("Первая запятая в тексте встречается на позиции " + begin);
        int end = address.indexOf(",", begin + 1); // искать вторую запятую после первой запятой
        String street = address.substring (begin+1, end); // выделим часть строчки с описанием улицы
        System.out.println ("Введенная улица: " + street); // распечатает "улица Маяковская"
    }
}









