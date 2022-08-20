package Studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Test35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Line = scan.nextLine();
        int N = scan.nextInt();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //тот же сканер, только практичнее (меньше методов, но работает быстрее)
        //String lineToSplit;
        //int numberOfChars;
        try {
            //lineToSplit = input.readLine(); //при ошибке ввода с консоли тут может быть брошено IOException
            //input.skip(1); //если считывать через BufferedReader 2 раза подряд - после первого считывания в консоли остается символ переноса строки, который необходимо пропустить, иначе он запишется при следующем считывании
            //numberOfChars = Integer.parseInt(input.readLine()); // а тут при преобразловании строки можеть быть брошено NumberFormatException (если вместо числа мы считали, допустим, строку)
            if (Line.isEmpty()){ //если введеная строка пустая - выбросить исключение
                throw new IllegalArgumentException("Incorrect line input");
            }
            if (Line.length() < N){
                throw new IllegalArgumentException("Length of substrings can not be bigger than string");
            }
        } catch (IllegalArgumentException exception) { //ловим исключения и обрабатываем
            if (exception.getClass() == NumberFormatException.class) { //если пойманное исключение -> NumberFormatException
                System.err.println("Can`t parse following input to Integer");
                exception.printStackTrace();
            } else if (exception.getClass() == IllegalArgumentException.class){ //если пойманное исключение -> IllegalArgumentException
                System.err.println(exception.getMessage()); //распечатать текст из строки 16 или строки 19 (в зависимости где было брошено исключение)
            }
            else {
                System.err.println("I/O Exception while reading from console");
            }
            return; //для того, чтобы после этой строк програма завершила выполнение
        }

        splitter1(Line, N);

    }
    public static void splitter1(String Line, int N){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = Line.toCharArray(); //делим строку на сиволы
        for (int i = chars.length-N; i < chars.length; i++) {
            stringBuilder.append(chars[i]); //записывавем последние numberOfChars символов в билдер от младшего до старшего
        }
        stringBuilder.append("\n"); //добавляем переход на новую строку
        for (int i = 0; i < N; i++) {
            stringBuilder.append(chars[i]); //записываем первые numberOfChars символов в билдер
        }


        System.out.println(stringBuilder);
    }

    //public static void splitter2(String lineToSplit, int numberOfChars){
      //  char[] chars = lineToSplit.toCharArray();
       // char[] beginChars = new char[numberOfChars]; //масив первых numberOfChars символов
        //char[] endChars = new char[numberOfChars]; //массив последних numberOfChars символов
        //for (int i = 0; i < numberOfChars; i++) {
          //  beginChars[i] = chars[i];
        //}
        //for (int i = chars.length-numberOfChars, j=0; i < chars.length; i++, j++) {
          //  endChars[j] = chars[i];
        //}
        //String begin = new String(beginChars); // строка первых символов
        //String end = new String(endChars); // строка последних символов
        //String result = begin + "\n" + end; //конкатенация строк
        //System.out.println(result);
    //}
}
