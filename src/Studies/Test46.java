package Studies;

import java.util.*;
import java.io.*;
//считать сначала количество строк ввода данных с телефонными номерами, одна ячейка содержит две строки первая это имя, вторая номер телефона, потом прочитать вводимые имена, и если они есть в списке то вывести имя=телефон
//создадим HashMap<String, Integer> для хранения name,phone
class Test46{
    public static void main(String []argh) {
        HashMap<String, Integer> hash = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();//перейти на следующую линию чтобы не считывать пустую строку
        for(int i=0;i<n;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            hash.put(name,phone);
        }
        //считали строку с именем, и проверили в HashMap если ли такая стринг, после этого вывели данные
        while(in.hasNext()) {
            String s = in.nextLine();
            try {
                int out=hash.get(s);
                System.out.println(s+"="+out);
            }
            //если словили ошибка, что такой строки нет, вывели что нет такого имени
            catch(Exception e) {
                System.out.println("Not found");
            }
        }
    }
}