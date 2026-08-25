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

// https://leetcode.com/problems/reverse-words-in-a-string/submissions/2117127355/
/*
class Solution {
    public String reverseWords(String S) {
        ArrayList<ArrayList<Character>> ArL = new ArrayList<>();

        int N = S.length();
        ArrayList<Character> C = new ArrayList();

        for(int i = 0; i < N; ++i)  {
            if(S.charAt(i) == ' ') {
                if(C.size() > 0) {
                    ArL.add(C);
                    C = new ArrayList<>();
                }
            } else {
                C.add(S.charAt(i));
            }
        }

        if(C.size() > 0)
           ArL.add(C);

        StringBuffer A = new StringBuffer();

        for(int i = ArL.size() - 1;  i >= 0; --i) {
            for(int j = 0; j < ArL.get(i).size(); ++j)
                A.append(ArL.get(i).get(j));

            if(i != 0)
                A.append(' ');
        }

        return A.toString();
    }
}
*/

// https://www.geeksforgeeks.org/problems/intersecting-intervals/1
/*

class Solution {
    public static int overlapInt(int[][] A) {
        // code here
        int Mx = 0;

        for(int i = 0; i < A.length; ++i)
            Mx = Math.max(Mx , A[i][1]);

        int [] R = new int [Mx + 2];

        for(int i = 0; i < A.length; ++i) {
           R[A[i][0]]++; R[A[i][1] + 1]--;
        }

        int Ans = 0;

        for(int i = 1; i <= Mx; ++i) {
           R[i] += R[i - 1];
           Ans = Math.max(Ans, R[i]);
        }

        return Ans;

    }

}
*/

// https://leetcode.com/problems/insert-interval/submissions/2117083653/}
/*
class Solution {
    class Pair implements Comparable<Pair> {
        Integer first, second;

        Pair(Integer first, Integer second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair R) {
            if (this.first.compareTo(R.first) == 0)
                return this.second.compareTo(R.second);

            return this.first.compareTo(R.first);
        }
    }

    public int[][] insert(int[][] I, int[] nI) {
        int n = I.length;
        int N = (int) 1e5 + 1;

        if(I.length == 0) {
            int[][] Ans = new int[1][2];
            Ans[0][0] = nI[0];
            Ans[0][1] = nI[1];

            return Ans;

        }


        long[] P = new long[N];

        for (int i = 0; i < n; ++i) {
            P[I[i][0]]++;
            P[I[i][1]]--;
        }

        P[nI[0]]++;
        P[nI[1]]--;

        int l = 0;

        ArrayList<Pair> ArL = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < n; ++i) {
            if(I[i][0] == I[i][1])
               hs.add(I[i][0]);
        }

        if(nI[0] == nI[1])
                hs.add(nI[0]);

        if(I[0][0] == 0 && I[0][1] == 0)
             hs.add(0);

        if(P[0] == 0 && hs.contains(0))
                    ArL.add(new Pair(0, 0));

        for (int i = 1; i < N; ++i) {
            P[i] += P[i - 1];

            if (P[i] == 0) {
                if (P[i - 1] != 0) {
                    ArL.add(new Pair(l, i));
                } else {
                    if (hs.contains(i))
                        ArL.add(new Pair(i , i));
                }
            } else {
                if (P[i - 1] == 0)
                    l = i;
            }
        }

        Collections.sort(ArL);

        int[][] Ans = new int[ArL.size()][2];
        int inx = 0;

        for (Pair C : ArL) {
            Ans[inx][0] = C.first;
            Ans[inx++][1] = C.second;
        }

        return Ans;

    }
}

*/