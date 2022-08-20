package Studies;

import java.io.IOException;
import java.util.Scanner;
//цикл while
public class Test10
{
    public static void main(String[] args) throws IOException {
        Scanner myscan = new Scanner(System.in);
        int q = myscan.nextInt();
        while (q>0) {
            System.out.println("Осталось "+q+" сек");
            q--;
        }
    }
}
