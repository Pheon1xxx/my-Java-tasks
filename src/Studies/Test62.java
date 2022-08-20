package Studies;

import java.io.*;
import java.util.*;
//��������� ������� ������� ��������� ����������� ����� �����(������ ������� �� ���� ����), ����� ��������� ������ � ����������� ��: ���� ������ ����� � �� ����������� ��������� 1, ���� ������ ��� ����������� ��������� ������ �������� �����,
// �� ���� �� 5 ���� ������� ���������� ���� �������� �������� �����������
//Set setA = new HashSet() - �������� ��������� INT, � ������� ����� �������� ���� ����������, � � ������ ��������� ����� ���� �� ����� ��������� ���� +1
public class Test62 {
    static private final String INPUT = "in";
    static private final String OUTPUT = "out";
    public static void main(String[] args) throws IOException {
        Set setA = new HashSet();
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++) {
            String a=scan.next();
            String b=scan.next();
            Pair P=new Pair(a,b); //�������� ����� ���� �������� class Studies.Pair<A, B>, � � ���� class Studies.Pair<A, B> �������� �������� �� �������� ��������� ����
            setA.add(P);
            System.out.println(setA.size());
        }
    }
}
//�������� ���� � � �
class Pair<A, B> {
    private A first;
    private B second;
//�������� ������ Studies.Pair ���������� �� �������� � � �
    public Pair(A first, B second) {
        super(); //�������� ����� super � Java ������������ �����, ����� ��������� ��������� ��������� �� ��� ���������������� ����� �����? ��� ���� ����� ���������� � ���������� � � � �� class Studies.Pair<A, B>
        this.first = first;
        this.second = second;
    }
//�������� ���������� hashCode ������� ����� ���������� � � �, � ���� ��� �� ����� �������� 0, � ����� ����������� �������� hashCode (hashFirst + hashSecond) * hashSecond + hashFirst
    public int hashCode() {
        int hashFirst = first != null ? first.hashCode() : 0; //��������� �������� � ��������, ������� ������� �� ���� ��������� � ������������ ��� ������ ��������� ���� boolean.
        // ���� ���������� ��������� ��� ��������� ��������� ����������� � ���, ����� ������, ����� �������� ������ ���� ��������� ����������. ���� first �� ����� 0, �� ����������� first.hashCode(), ���� ����� �� 0
        int hashSecond = second != null ? second.hashCode() : 0;
        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }
//�������� ���������� boolean equals ��� ��������� false/true
    public boolean equals(Object other) {
        if (other instanceof Pair) {
            Pair otherPair = (Pair) other;
            return ((this.first == otherPair.first || (this.first != null && otherPair.first != null && this.first.equals(otherPair.first))) && (this.second == otherPair.second || ( this.second != null && otherPair.second != null && this.second.equals(otherPair.second))));
        }
        return false;
    }
// �������� ������� � ������� ��� ����������
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
    public A getFirst() {
        return first;
    }
    public void setFirst(A first) {
        this.first = first;
    }
    public B getSecond() {
        return second;
    }
    public void setSecond(B second) {
        this.second = second;
    }
}
