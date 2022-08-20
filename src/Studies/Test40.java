package Studies;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//удаление повтор€ющихс€ слов с троке через метод Pattern
public class Test40 {
    public static void main(String[] args) {
        String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        in.skip("\n");
        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        in.close();
    }
}
