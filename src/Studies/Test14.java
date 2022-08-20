package Studies;

import java.io.IOException;
    import java.text.SimpleDateFormat;
    import java.util.*;
//цикл try-catch при вводе даты, выводит день недели этой даты. SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy") метод для форматирования введееных данных к формату dd.MM.yyyy, сопоставления введенной даты и днем недели из календаря
    public class Test14 {
        public static void main(String args[])throws IOException {
            Scanner my = new Scanner(System.in);
            String date = my.nextLine();

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Date dayWeek = null;
            try {
                dayWeek = format.parse(date);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
        }
    }

