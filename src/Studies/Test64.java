package Studies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
// priority queue - ������������ ������� � ��� ����������� ��� ������, ������� �� ������� �������, �� � ������� ������������� ������ ������� ����� ��������� � ��� ����������.
//��� ����� ������� ������� N ���������� �����, ���������� ������� ��� ����� ���������� ����, � ����� ������������� �������� ������ "-ENTER-John-3.75-50"
// ��� ENTER - \�� ����� ������� � ������, � SERVED ��� ������ �������� � ������ ��������� cgpa, ������� �� ����� ���������� ������� ������� ��� �� ���������

public class Test64 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());//���������� ��������� ����� �����
        List<String> events = new ArrayList<>();//�������� ������
        //���������� ������ ��������
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);//� ������ events ��������� event
        }
        List<Student1> students = priorities.getStudents(events);//������������� ������ Studies.Student1 priorities ��� ������ ������ events
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        }
        else {
            for (Student1 st: students) {
                System.out.println(st.getName());//����� ��������� ���� ����� ������ ����� ��������� ������� �������� � �������
            }
        }
    }
}
//������ ���� ���������� ��������� ������ � �����, ���� � ������ 4 �������� ������ ������ �������� � �����, ���� � ������ 1 �������, ������� 1 �������� �� �������

//������� ����� Studies.Student1, � ������� ���� �������� �������������� ��������
class Student1 implements Comparable<Student1>{
    String name = new String(); //����� String Name() �������� ����� ��������.
    double cgpa; //����� double getCGPA()�������� CGPA ��������.
    int id; //����� int ID - �������� �������������� ��������.

    //����������� Studies.Student(int id, String name, double cgpa), ����� ��������� ���������
    public Student1(String name,double cgpa,int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
    //����� getName ����� ��� �� ������ ������
    public String getName(){
        return this.name;
    }
//���� ���������� ��������� �� cgpa, � ����� �� �����
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

//���������� �� �������� �����
class Priorities{
    public ArrayList<Student1> getStudents(List<String> events) {
        int n = events.size();
        PriorityQueue<Student1> pq = new PriorityQueue<>();
        for(String i:events) {
            String[] s = new String[4]; //��������� ������ �� 4 ���������
            s = i.split("\\s");// \s �� ��������� �� ���� ������ �������.
            //���� � ��� ������ ���� [4] �������� ������
            if(s.length>1) {
                pq.add(new Student1(s[1],Double.valueOf(s[2]),Integer.valueOf(s[3])));//���������� � ������ ��� ��������� String name, double cgpa, int id
            }
            //���� � ��� ������ ���� [0] ������� ������
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


