package Studies;

import java.util.*;
//јбстрактный класс Java Ч это класс, который не может быть создан. Ёто означает, что вы не можете создавать новые экземпл€ры абстрактного класса.
//нам нужно с абстрактного class Studies.Book вытащить данные, через другой класс, с помощь сеттера

public class Test53{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());

    }
}
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    void setTitle(String s){
        title=s;
    }
}

