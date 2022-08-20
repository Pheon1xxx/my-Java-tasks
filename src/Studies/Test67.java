package Studies;

import java.util.*;
//создаем три класса, сверяем их с введенными данными, и считаем сколько какого данных класса есть

class Student2{}
class Rockstar{}
class Hacker{}


public class Test67 {
    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            if(element instanceof Student2 )//если введенная фраза равна Studies.Student2
                a++;
            if(element instanceof Rockstar)//если введенная фраза равна Studies.Rockstar
                b++;
            if(element instanceof Hacker)//если введенная фраза равна Studies.Hacker
                c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

    public static void main(String []args){
        ArrayList mylist = new ArrayList();//создаем массив с количеством каждых слов
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Studies.Student2"))mylist.add(new Student2());
            if(s.equals("Studies.Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Studies.Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}
