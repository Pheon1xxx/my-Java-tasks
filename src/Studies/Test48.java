package Studies;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//нужно проверить сбалансированность строк, а имменно открытй элемент должен закрыться - (), {}, [].
//считываем строку до ОЕF, Класс Stack – это подкласс Vector, который реализует стандартный стек last-in, first-out.
//проверяем первые элементы, c == '{' || c == '(' || c == '[' если совпадают, то вставляем в  Stack, если после 2,3,4 if выполняется, значит нарушено и удаляем все, и если последнее условие выполняется, вставляем, и становится тру
public class Test48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            Stack<Character> stack = new Stack<>();
            String line = scanner.nextLine();
            for(char c : line.toCharArray()) {
                if(c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                    continue;
                }
                if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }
                if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    continue;
                }
                if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                    continue;
                }
                if(c == '}' || c == ')' || c == ']') {
                    stack.push(c);
                    break;
                }
            }
            System.out.println(stack.isEmpty());
        }
    }
}