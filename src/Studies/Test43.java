package Studies;

import java.util.*;
import java.io.*;
//¬ам даетс€ массив6х6. ѕесочные часы в массиве Ч это часть, имеюща€ следующую форму:
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0    1 1 1
//0 0 0 0 0 0      1
//0 0 0 0 0 0    1 1 1
//0 0 0 0 0 0
//ѕесочные часы с наибольшей суммой нужно вывести

class Test43 {
    public static void main(String []argh){
        int[][] arr = new int[10][10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int maxi=-100000;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i<=3 && j<=3){
                    int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+(arr[i+1][j+1])+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    if(sum>maxi) maxi=sum;
                }
            }
        }
        System.out.println(maxi);
    }
}