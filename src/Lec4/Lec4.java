package Lec4;

import java.util.*;

public class Lec4 {
    public static void main(String [] args) {
//        int [][] X = new int [3][4];
//
//        int [] Tr = {4 , 2 , 3};

//        X[0] = new int [4];
//        X[1] = new int [2];
//        X[0] = new int [3];

//        for(int i = 0; i < Tr.length; ++i)
//            X[i] = new int[Tr[i]];
//
//        for(int i = 0; i < X.length; ++i)
//            for(int j = 0; j < X[i].length; ++j)
//                X[i][j] = (int)(Math.random() * 10);
//
//        for(int i = 0; i < X.length; ++i) {
//            for(int j = 0; j < X[i].length; ++j)
//                System.out.print(X[i][j] + " ");
//            System.out.println();
//        }

        int [][] X = {
                {1 , 2 , 3 , 4},
                {16 , 21 , 3 , 28},
                {17 , 23 , 3 , 17},
        };

        int N = (X.length - 1) +(X[0].length - 1) + 1;
        int r = 0 , c = 0;

//        System.out.println(N);
//
//        while(N-- > 0) {
//            System.out.println(N + " : N");
//            System.out.print(X[r][c] + " ");
//            System.out.println(r + " " + c + " : C");
//            if(c < X[0].length - 1)
//                c++;
//            else
//                r++;
//        }
//


//        System.out.println(X.length + " : rows");
//        System.out.print(X[0].length + " : Coloums");

//        for(int i = 0; i < 3; ++i)
//          for(int j = 0; j < 4; ++j)
//              x[i][j] = (int)(Math.random() * 10);

//        for(int i = 0; i < 10; ++i) {
//            int P = (int)(Math.random() * 100);
//            System.out.println(P);
//        }




//        System.out.println(T);

        int [] a = new int [100];

        for(int i = 0; i < 100; ++i)
            a[i] = -100;

        for(int i = 0; i < 100; ++i)
            System.out.print(a[i] + ",");
     }
}

// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
/*
class Solution {
    public int minStartValue(int[] A) {
       int hi = 10001;
       int lo = 1;
       int ans = -1;

        while(lo <= hi) {
          int mid = (lo + hi) / 2;
          int X = mid;
          boolean f = false;

             for(int j = 0; j < A.length; ++j) {
                X  += A[j];
                if(X <= 0)
                   f = true;
             }

             if(f) {
                lo = mid + 1;
                // System.out.print("F ");
                continue;
             }
                // System.out.print("T ");

            ans = mid;
            hi = mid - 1;
        }

        return ans;
    }
}
*/

// https://leetcode.com/problems/subarray-product-less-than-k/submissions/2117041357/
// https://leetcode.com/problems/insert-interval/submissions/2117083653/
// https://leetcode.com/problems/reverse-words-in-a-string/submissions/2117127355/
