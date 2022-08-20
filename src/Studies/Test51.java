package Studies;

import java.util.*;
//JavaDequeue это абстрактный тип данных, который обобщает очередь, для которой элементы могут добавляться или удаляться либо из передней (головной), либо из задней (хвостовой) очереди.
//Deque deque = new LinkedList<>();
//or
//Deque deque = new ArrayDeque<>();
//Первая строка ввода содержит два целых числаа: представление общего количества целых чисел(N) и размера подмассива соответственно(M)
//вторая строка количество целых чисел, M это количество цифр которое заходит в масив, нам нужно проверить массив на количество уникальных простых чисел в массиве (то есть если в массиве у нас 2,3,5 - то 3 уникальных элемента, если 2,2,2 - то один)
// и вывести максильное количество униккальных элементов в одном из массивов

public class Test51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0, distinct = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            if (hashmap.get(num) == null) hashmap.put(num,0);
            hashmap.put(num, hashmap.get(num)+1);
            if (hashmap.get(num)==1) distinct++;
            if (deque.size() == m+1){
                int ele = deque.removeFirst();
                hashmap.put(ele, hashmap.get(ele)-1);
                if (hashmap.get(ele) == 0) distinct--;
            }
            if (deque.size() == m){
                if (distinct > ans) ans = distinct;
            }
        }
        System.out.println(ans);
        in.close();
    }
}