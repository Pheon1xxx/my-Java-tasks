package Studies;

import java.util.*;
//Нужно принять сначала цыфру с количетсвом строк, потом строки с данными ID, FirstName и CGPA, после нужна отсортировать по CGPA и вывести только имя, если CGPA равно, то сортировать по имени

public class Test50 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
//создаем масив студентов
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
//создали студента в массиве с параметрами
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);//добавили в массив студента
            testCases--;
        }
        Collections.sort(studentList, new StudentComparator());
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
//класс для идентификации студентов
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
//сортировка студентов по Cgpa
class StudentComparator implements Comparator<Student>{
//На самом деле аннотация @Override указывает, что далее мы собираемся переопределять метод базового класса.
    @Override
    public int compare(Student s1, Student s2) {
        double cgpa1 = s1.getCgpa();
        double cgpa2 = s2.getCgpa();
        if(Math.abs(cgpa1 - cgpa2)<.00000001){
            int fnameCom = s1.getFname().compareTo(s2.getFname());//если Cgpa равно сравниваем по имени
            if(fnameCom==0){
                return s1.getId()-s2.getId();
            }
            return fnameCom;
        }
        return (cgpa1<cgpa2)?1:(cgpa1>cgpa2?-1:0);
    }

}
