package Lec14;
import java.util.*;

public class StoneGame {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int [] a = new int [n];

            for(int i = 0; i < n; ++i)
                a[i] = sc.nextInt();

            int ans = 0;

            for(int i = 0; i < n; ++i)
                if(a[i] % 2 == 0)
                    ++ans;

            System.out.println(ans);
        }
    }
}

/*
3
6
1 4 32 56 332 22
3
4 345 23
7
1 4 32 56 1 8 3
*/
