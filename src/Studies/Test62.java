package Studies;

import java.io.*;
import java.util.*;
//программа котора€ сначала считывает количествов ввода строк(строка состоит из двух слов), после считывает строки и анализирует их: если строка нова€ и не повтор€етс€ добавл€ет 1, если строка уже повтор€лась оставл€ет старое значение цифры,
// то есть из 5 фраз находит количество фраз котоорые €вл€ютс€ уникальными
//Set setA = new HashSet() - создание множества INT, в котором будут хранитс€ наши результаты, и с каждым по€вление новой пары мы будем добавл€ть туда +1
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
            Pair P=new Pair(a,b); //созданем новую пару согласно class Studies.Pair<A, B>, и в теле class Studies.Pair<A, B> проводим действи€ на проверку введенных слов
            setA.add(P);
            System.out.println(setA.size());
        }
    }
}
//создание пары ј и ¬
class Pair<A, B> {
    private A first;
    private B second;
//—оздание метода Studies.Pair состо€щего из значение ј и ¬
    public Pair(A first, B second) {
        super(); // лючевое слово super в Java используетс€ тогда, когда подклассу требуетс€ сослатьс€ на его непосредственный супер класс? дл€ того чтобы обратитьс€ к переменным ј и ¬ из class Studies.Pair<A, B>
        this.first = first;
        this.second = second;
    }
//создание переменной hashCode котора€ будет сравнивать ј и ¬, и если они не равны выводить 0, и после присваивать значение hashCode (hashFirst + hashSecond) * hashSecond + hashFirst
    public int hashCode() {
        int hashFirst = first != null ? first.hashCode() : 0; //“ернарный оператор Ч оператор, который состоит из трех операндов и используетс€ дл€ оценки выражений типа boolean.
        // ÷ель тернарного оператора или условного оператора заключаетс€ в том, чтобы решить, какое значение должно быть присвоено переменной. ≈сли first не равно 0, то присваиваем first.hashCode(), если равно то 0
        int hashSecond = second != null ? second.hashCode() : 0;
        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }
//создание переменной boolean equals дл€ выведени€ false/true
    public boolean equals(Object other) {
        if (other instanceof Pair) {
            Pair otherPair = (Pair) other;
            return ((this.first == otherPair.first || (this.first != null && otherPair.first != null && this.first.equals(otherPair.first))) && (this.second == otherPair.second || ( this.second != null && otherPair.second != null && this.second.equals(otherPair.second))));
        }
        return false;
    }
// создание гетеров и сетеров дл€ переменных
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
