package Studies;

import java.math.BigDecimal;
import java.util.*;
// ���������� ������� ������ � ������� BigDecimal �� �������� � ��������, ��� ��������� ������� ��������� �����
class Test37 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n+2];
        for(int i = 0;i < n;i++){
            s[i] = sc.next();
        }

        for(int i = 0;i<n;i++){
            BigDecimal max = new BigDecimal(s[i]);
            int idx = i;
            for(int j = i+1;j<n;j++)
            {
                BigDecimal curr = new BigDecimal(s[j]);
                if(curr.compareTo(max) == 1){
                    max=curr;
                    idx=j;
                }
            }
            String temp = s[i];
            s[i] = s[idx];
            s[idx] = temp;
        }
        for(int i = 0;i<n;i++){
            System.out.println(s[i]);
        }
    }
}