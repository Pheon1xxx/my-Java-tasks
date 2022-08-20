package Studies;

import java.io.*;
import java.util.*;
//создать массив Arraylist, сначала считать число которое означает количество элементов в массиве, после чего будет строка в которой сначала идет количество элемнтов и потом цифры, заполнить массив, после нужно считать опять цифру, которая будет означать количество
//операций с нашим масивом, в следующих строках будет указаны условия которые нужно проверить, первая цифра означает подгруппу массива, вторая цифра элемент из подгруппы, вывести на экран эти данные
public class Test45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList[] list= new ArrayList[20002];
        int n;
        n=scan.nextInt();
        //заполняем масив, считываем сначала количество элементов, присваиваем это количество масиву, и запускаем цикл на заполнение под групп этого масива
        for(int i=1;i<=n;i++) {
            list[i]=new ArrayList();
            int x=scan.nextInt();
            for(int j=1;j<=x;j++) {
                int val=scan.nextInt();
                list[i].add(val);
            }
        }
        int q=scan.nextInt();
        for(int i=1;i<=q;i++) {
            int x,y;
            x=scan.nextInt();
            y=scan.nextInt();
            try {
                System.out.println(list[x].get(y-1));
            }
            catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}