package Studies;

import java.util.Arrays;
//����� ��� ���������� ���� ���� �� ���������, ������ ������ �� ���� �����, ��������� ������ ����� �� ����������� � ����� ���������� �����, ���� ����� ������ ���������
public class Test24 {
    public boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
        }
    }

