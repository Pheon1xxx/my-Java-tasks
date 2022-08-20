package Studies;

public class Test65 {
    public static void main(String []args){
         Adder a = new Adder(); //создаем новую перменную класса Studies.Adder с двумя перенными int a, int b
         System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());//выводим имя class Studies.Arithmetic
         System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n"); //Печатаем а с методом add, в котором мы делаем a + b, и присваиваем add return sum
    }
}
class Arithmetic{
    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}

class Adder extends Arithmetic{
    public int callAdd(int a, int b){
        return add(a, b);
    }
}


