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
        //��� �� ������, ������ ���������� (������ �������, �� �������� �������)
        //String lineToSplit;
        //int numberOfChars;
        try {
            //lineToSplit = input.readLine(); //��� ������ ����� � ������� ��� ����� ���� ������� IOException
            //input.skip(1); //���� ��������� ����� BufferedReader 2 ���� ������ - ����� ������� ���������� � ������� �������� ������ �������� ������, ������� ���������� ����������, ����� �� ��������� ��� ��������� ����������
            //numberOfChars = Integer.parseInt(input.readLine()); // � ��� ��� ��������������� ������ ������ ���� ������� NumberFormatException (���� ������ ����� �� �������, ��������, ������)
            if (Line.isEmpty()){ //���� �������� ������ ������ - ��������� ����������
                throw new IllegalArgumentException("Incorrect line input");
            }
            if (Line.length() < N){
                throw new IllegalArgumentException("Length of substrings can not be bigger than string");
            }
        } catch (IllegalArgumentException exception) { //����� ���������� � ������������
            if (exception.getClass() == NumberFormatException.class) { //���� ��������� ���������� -> NumberFormatException
                System.err.println("Can`t parse following input to Integer");
                exception.printStackTrace();
            } else if (exception.getClass() == IllegalArgumentException.class){ //���� ��������� ���������� -> IllegalArgumentException
                System.err.println(exception.getMessage()); //����������� ����� �� ������ 16 ��� ������ 19 (� ����������� ��� ���� ������� ����������)
            }
            else {
                System.err.println("I/O Exception while reading from console");
            }
            return; //��� ����, ����� ����� ���� ����� �������� ��������� ����������
        }

        splitter1(Line, N);

    }
    public static void splitter1(String Line, int N){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = Line.toCharArray(); //����� ������ �� ������
        for (int i = chars.length-N; i < chars.length; i++) {
            stringBuilder.append(chars[i]); //����������� ��������� numberOfChars �������� � ������ �� �������� �� ��������
        }
        stringBuilder.append("\n"); //��������� ������� �� ����� ������
        for (int i = 0; i < N; i++) {
            stringBuilder.append(chars[i]); //���������� ������ numberOfChars �������� � ������
        }


        System.out.println(stringBuilder);
    }

    //public static void splitter2(String lineToSplit, int numberOfChars){
      //  char[] chars = lineToSplit.toCharArray();
       // char[] beginChars = new char[numberOfChars]; //����� ������ numberOfChars ��������
        //char[] endChars = new char[numberOfChars]; //������ ��������� numberOfChars ��������
        //for (int i = 0; i < numberOfChars; i++) {
          //  beginChars[i] = chars[i];
        //}
        //for (int i = chars.length-numberOfChars, j=0; i < chars.length; i++, j++) {
          //  endChars[j] = chars[i];
        //}
        //String begin = new String(beginChars); // ������ ������ ��������
        //String end = new String(endChars); // ������ ��������� ��������
        //String result = begin + "\n" + end; //������������ �����
        //System.out.println(result);
    //}
}
