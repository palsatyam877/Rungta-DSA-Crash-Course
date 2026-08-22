package Lec3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec3 {

    static class FastReader {

        // BufferedReader to read input
        BufferedReader b;

        // StringTokenizer to tokenize input
        StringTokenizer s;

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() {
            return Integer.parseInt(next());
        }

        // Method to read the next token as a long
        long nextLong() {
            return Long.parseLong(next());
        }

        // Method to read the next token as a double
        double nextDouble() {
            return Double.parseDouble(next());
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static boolean check(int [] a , int n , int x , long h) {
        long req = 0;

        for(int i = 0; i < n; ++i)
            if(a[i] < h)
                 req += (h - a[i]);

        return req <= x;
    }

    public static void solve(FastReader s) {
         int n = s.nextInt() , x = s.nextInt();

         int [] a = new int[n + 1];

         for(int i = 0; i < n; ++i)
             a[i] = s.nextInt();

         long lo = 0 , hi = (long)2e9;
         long ans = 0;

         while(lo <= hi) {
             long mid = (lo + hi) / 2;

             if(check(a , n , x , mid)) {
                 ans = mid;
                 lo = mid + 1;
             } else {
                 hi = mid - 1;
             }
         }

        System.out.println(ans);
    }

    public static void main(String [] args) {
//        System.out.println("Jai Maa Bhavani");
         FastReader s = new FastReader();

         int t = s.nextInt();

         while(t-- > 0)
             solve(s);
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