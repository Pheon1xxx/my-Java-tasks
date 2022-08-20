package Studies;

import java.util.*;
// три разных метода, которые сортируют слов String s на элементы, и из этих элемнтов делают новые слова с количетсвом символов int k
public class Test36 {
    public static String getSmallestAndLargestCompareTo(String s, int k) {
        String substring = s.substring(0, k); //Метод substring() имеет два варианта и возвращает новую строку, которая является подстрокой данной строки.
        String smallest = substring;
        String largest = substring;
        for (int i = 1; i <= s.length() - k; i++) {
            substring = s.substring(i, i + k);//заполняем String substring следующим элемнтом, сравниваем его с предыдущей буквой и если она большо то меняем местами
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargestList(String s, int k) {
        Vector<String> substrings = new Vector<String>(); //Класс Vector реализует динамический массив. Он похож на ArrayList
        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add( s.substring(i, i + k) );
        }
        Collections.sort(substrings);
        String smallest = substrings.get(0);
        String largest = substrings.get(substrings.size() - 1);
        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargestArray(String s, int k) {
        String[] substrings = new String[s.length() - k + 1];
        for (int i = 0; i <= s.length() - k; i++) {
            substrings[i] =  s.substring(i, i + k);
        }
        Arrays.sort(substrings);
        String smallest = substrings[0];
        String largest = substrings[substrings.length - 1];
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargestCompareTo(s, k));
        System.out.println(getSmallestAndLargestList(s, k));
        System.out.println(getSmallestAndLargestArray(s, k));
    }
}