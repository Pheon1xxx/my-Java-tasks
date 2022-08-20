package Studies;

import java.util.*;
//создание интерфейса Studies.AdvancedArithmetic с int divisor_sum(int n),
class Test66{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: "); //вывели строку без ентера и к ней добавили void ImplementedInterfaceNames(наследование имени интерфейса)
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");//вывели результат согласно методу class Studies.MyCalculator
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

//интерфейс который содежит одну переменную в себе
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//class Studies.MyCalculator записывает в себ€ переменную n и начинает с ней работать, если равно 1, то сумма делителей равна 1, дальше провер€ет остальные цыфры вывод€ только делители нацело числа и записывает их в рес, каждый раз добавл€ю новую цифру котора€ подходит
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        if (n <= 1) { return n;
        }
        int res = n + 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res += i;
            }
        }
        return res;
    }
}

