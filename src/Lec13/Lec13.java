package Lec13;

public class Lec13 {
    public static void main(String [] args) {
        System.out.println("Jai Shree Krishna");

        int [] a = {2 , 12 , 5 , 3 , 17 , 18 , 21 , 4 , 1};
        int [] nse = new int [a.length];

        for(int i = 0; i < a.length; ++i)
            nse[i] = -1;

        for(int i = 0; i < a.length; ++i)
            for(int j = i; j < a.length; ++j)
                 if(a[j] < a[i]) {
                     nse[i] = j;
                     break;
                 }

        for(int i = 0; i < a.length; ++i)
            System.out.print(nse[i] + " ");

        // {2 , 12 , 5 , 3 , 17 , 18 , 21 , 4 , 1};
        // {0   1    2   3   4    5    6    7   8}
        // [8   2    3   8   7    7    7    8         ] <-- ans-
        // [ 8    2   3   8    7    7    7   8   -             ]

        // [8


       //
        /*
             nse -> next smaller eleemnt
             pse

             nge
             pge
        */

        /*
               [ 2 , 12 , 5 , 3 , 17 , 18 , 21 , 4 , 1  ]
               [ 0    1   2   3    4    5    6   7   8  ]
            -->

               [ 1 , 1 , 1 ..... 1 ] --> Size = N
               --> (N - 1) + (N - 2) + (N - 3) + (N - 4) ... 3 + 2 + 1;

               --> (N * (N + 1)) / 2;
               --> ((N - 1) * (N - 1 + 1)) / 2;
               --> (N - 1) * N) / 2;
               --> O(N^2); -->  N = 10^5

                 N^2 ---> 10^10 && N -> 10^5



        */


    }
}

// https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1

/*
class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] a) {
        // code here
        ArrayList<Integer> nse = new ArrayList<>();
        int n = a.length;

        for(int i = 0; i < n; ++i)
            nse.add(-1);

        Stack<Integer> stk = new Stack(); // pushing indexes

        for(int i = 0; i < n; ++i) {
            while((stk.size() > 0)  && (a[i] < a[stk.peek()])) {
                nse.set(stk.peek() , a[i]);
                stk.pop();
            }

            stk.push(i);
        }

        return nse;
    }
}

*/
