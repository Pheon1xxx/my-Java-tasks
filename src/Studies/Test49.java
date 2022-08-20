package Studies;

import java.util.*;
//Java Comparator используются для сравнения двух объектов. В этом задании создаем компаратор и будем использовать его для сортировки массива.
//сначала считываем количество строк, после считываем строки в которых два значения имя и цифра, сравнивать будем по цифрам, если они одинаковые то по буквам
//создаем класс игроков, который содержит две переменные Studies.Player(String name, int score)
//после создаем класс Studies.Checker для сортировки игроков
class Test49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
//класс для сортировки игроков
class Checker implements Comparator<Player>{
    public int compare(Player a, Player b) {
        if(a.score == b.score){
            if(a.name.compareTo(b.name) < 0){//а по сравнению с b
                return -1;
            }
            else if(a.name.compareTo(b.name) > 0){
                return 1;
            }
            return 0;
        }
           else if(a.score > b.score){
            return -1;
        }
        else if(a.score < b.score){
            return 1;
        }
        return 0;
    }
}
class Player{
    String name;
    int score;
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

