package Studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//умножение ведденного числа на числа от 1 до 10, с помощью BufferedReader
public class Test5 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            if (2<=N && N<=20) {
                for (int i = 1; i<=10; i++){
                    int result = N*i;
                    System.out.println(N+"x"+i+"="+result );
                }
            }
            bufferedReader.close();
        }
    }

