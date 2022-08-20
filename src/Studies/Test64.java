package Studies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
// priority queue - приоритетная очередь — это абстрактный тип данных, похожий на обычную очередь, но в котором дополнительно каждый элемент имеет связанный с ним «приоритет».
//Нам нужно принять сначала N количество строк, количество сколько раз будет произведен ввод, и потом отсортировать введеные данные "-ENTER-John-3.75-50"
// где ENTER - \то новый студент в массив, а SERVED это запуск студента с высшим рейтингом cgpa, вывести на экран количество человек которые еще не обслужили

public class Test64 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());//считывание количеств ввода строк
        List<String> events = new ArrayList<>();//создание масива
        //заполнение масива строками
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);//в массив events добовляем event
        }
        List<Student1> students = priorities.getStudents(events);//использование метода Studies.Student1 priorities для нашего масива events
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        }
        else {
            for (Student1 st: students) {
                System.out.println(st.getName());//когда перебрали весь масив вывели имена студентов которые остались в массиве
            }
        }
    }
}
//Данный цикл обратывает введенные строки в масив, если в строке 4 элемента вносит нового студента в масив, если в строке 1 элемент, удаляет 1 студента из массива

//создаем класс Studies.Student1, в котором буду хранится характеристики студента
class Student1 implements Comparable<Student1>{
    String name = new String(); //Метод String Name() возврата имени студента.
    double cgpa; //Метод double getCGPA()возврата CGPA студента.
    int id; //Метод int ID - возврата идентификатора студента.

    //Конструктор Studies.Student(int id, String name, double cgpa), класс введенных студентов
    public Student1(String name,double cgpa,int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
    //метод getName вывод имя из строки масива
    public String getName(){
        return this.name;
    }
//цикл сортировки студентов по cgpa, а потом по имени
    public int compareTo(Student1 s) {
        if(cgpa == s.cgpa) {
            if(name.compareTo(s.name) == 0) {
                if(id == s.id)
                    return 0;
                else if (id > s.id)
                    return 1;
                else
                    return -1;
            }
            else
                return name.compareTo(s.name);
        }
        else if(cgpa > s.cgpa)
            return -1;
        else
            return 1;
    }
}

//сортировка по приорите входа
class Priorities{
    public ArrayList<Student1> getStudents(List<String> events) {
        int n = events.size();
        PriorityQueue<Student1> pq = new PriorityQueue<>();
        for(String i:events) {
            String[] s = new String[4]; //считываем массив из 4 элементов
            s = i.split("\\s");// \s Он указывает на один символ пробела.
            //если у нас только есть [4] элемента масива
            if(s.length>1) {
                pq.add(new Student1(s[1],Double.valueOf(s[2]),Integer.valueOf(s[3])));//записываем в массив три параметра String name, double cgpa, int id
            }
            //если у нас только есть [0] элемент масива
            else {
                pq.poll();
            }
        }
        while(pq.size()>1) {
            System.out.println(pq.poll().name);
        }
        return new ArrayList<Student1>(pq);
    }
}


