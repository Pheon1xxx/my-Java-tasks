package Studies;

import java.io.IOException;
import java.util.Scanner;
//матиматически методы, возведение в степень Math.pow
public class Test6 {
    public static void main(String[] args) throws IOException {
        Scanner myscan = new Scanner(System.in);
        int q = myscan.nextInt();
        int i=1;//количество ввода
        while (q>=i) {
            //a+2pow(n-1)*b
            int a = myscan.nextInt();//переменная 1
            int b = myscan.nextInt();//переменная 2
            int n = myscan.nextInt();//число выведеных цифр и возведение в степень

            int z = 1;
            int c = 2;
            int e = 0;
            double p = Math.pow(c, e);
            int pe = (int) p;
            int s = a + pe * b;;//результат первого действия

            int r = 0;//конечный результат
            int k = 0;//добавляемая переменная
            int ek = 1;
            double pk = 0;
            r=s;

            while (n>=z) {
                r = r+k;
                pk = Math.pow(c, ek);
                int pke = 0;
                pke = (int) pk;
                k = pke*b;
                System.out.print(r+" ");
                z++;
                ek++;
            }
            System.out.println();
            i++;
        }
    }
}
