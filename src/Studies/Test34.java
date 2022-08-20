package Studies;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Test34 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        BigDecimal array[] = new BigDecimal[N];//создание массива BigDecimal с количетсвом ячеек N
        BigDecimal temp = BigDecimal.valueOf(0);//создание переменной равной 0

        for (int i = 0; i<N; i++){
            array[i] = scan.nextBigDecimal();//наполнение масива с клавиатуры
        }
//сортировка масива от большего значения к меньшему
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[j].equals(array[i].max(array[j]))) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }
}
