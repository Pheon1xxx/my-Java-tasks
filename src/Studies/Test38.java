package Studies;

import java.util.Scanner;
import java.util.regex.*;
// проверка введеных строк на метод Pattern.compile
public class Test38 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            testCases--;
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException ex){
                System.out.println("Invalid");
            }
        }
    }
}