package Studies;

import java.util.Arrays;
//метод для сортировки двух слов на анаграмму, делает массив из двух строк, сортирует каждый масив по возрастанию и потом сравнивает слова, если равны значит анаграмма
public class Test24 {
    public boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
        }
    }


