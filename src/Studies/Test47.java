package Studies;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//сначала вводим количество элементов массива, затем вводим через пробел элементы массива, после этого пишем количество раз выполнени€ операции
//если оппераци€ Insert то вводим две цифры, перва€ это индекс, втора€ число которое вставл€ем в этот индекс, если Delete то вводим номер элемента который удал€ем
public class Test47 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        LinkedList < Integer > LL = new LinkedList < Integer > ();
        int n = st.nextInt();
        for (int i = 0; i < n; i++) {
            int p = st.nextInt();
            LL.add(p);//создали итератор, дл€ записи элементов
        }
        int q = st.nextInt();
        while (q--> 0) {
            st.nextLine();
            String s = st.nextLine();
            if (s.equals("Insert")) {
                int index = st.nextInt();
                int num = st.nextInt();
                LL.add(index, num);//добавл€ем в наш итерратор данные
            }
            else {
                int num = st.nextInt();
                LL.remove(num);//удал€ем данные
            }
        }
        //»тератор Ч это поведенческий паттерн, позвол€ющий последовательно обходить сложную коллекцию, без раскрыти€ деталей еЄ реализации. Ѕлагодар€ »тератору, клиент может обходить разные коллекции одним и тем же способом, использу€ единый интерфейс итераторов.
        Iterator itr = LL.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\n");
    }
}