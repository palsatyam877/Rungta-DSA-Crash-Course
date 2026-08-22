package Lec3;

public class Lec3 {
    public static void main(String [] args) {
        System.out.println("Jai Maa Bhavani");
    }
}

// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

/*
class Solution {
    public boolean Check(int [] B , int m , int k , int D) {
        int N = B.length;
        int C = 0 , Boq = 0;

        for(int i = 0; i < N; ++i)
            if(B[i] <= D) {
               ++C;

                if(C == k) {
                   Boq++;
                   C = 0;
                }
            } else
                C = 0;

        return Boq >= m;
    }

    public int minDays(int[] B, int m, int k) {
        long ub = 0;

        for(int i = 0; i < B.length; ++i)
            ub = Math.max(ub , B[i]);

        int ans = -1;

        for(int D = 1; D <= ub; ++D) {
            boolean A = Check(B , m , k , D);

            if(A) {
                if(ans == -1)
                   ans = D;
                 System.out.print("T");
            } else
                System.out.print("F");
        }

        return ans;
    }
}

*/

/*
class Solution {
    public boolean Check(int [] B , int m , int k , long D) {
        int N = B.length;
        int C = 0 , Boq = 0;

        for(int i = 0; i < N; ++i)
            if(B[i] <= D) {
               ++C;

                if(C == k) {
                   Boq++;
                   C = 0;
                }
            } else
                C = 0;

        return Boq >= m;
    }

    public int minDays(int[] B, int m, int k) {
        long ub = 0;

        for(int i = 0; i < B.length; ++i)
            ub = Math.max(ub , B[i]);

        long ans = -1;

        long lo = 1 , hi = ub;

        for(;lo <= hi;) {
            long D = (lo + hi) / 2;

            boolean A = Check(B , m , k , D);

            if(A) {
                ans = D;
                hi = D - 1;
            } else
                lo = D + 1;

        }

        return (int)ans;
    }
}

*/

// https://codeforces.com/contest/1873/problem/E

/**** Hard Problem ****/
// https://leetcode.com/problems/meeting-rooms-iii/
// https://leetcode.com/problems/find-median-from-data-stream/