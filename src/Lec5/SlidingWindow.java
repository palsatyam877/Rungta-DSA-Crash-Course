package Lec5;

import java.util.TreeSet;

public class SlidingWindow {
     public static void main(String [] args) {
         System.out.println("Jai Maa Bhavani");

         TreeSet<Integer> ts = new TreeSet<>();
     }
}

// https://leetcode.com/problems/product-of-array-except-self/
/*
class Solution {
    public int[] productExceptSelf(int[] A) {
        int N = A.length;

        if(N == 1) {
           int [] ans = {N - 1};
           return ans;
        }

        int [] Pr = new int [N];
        int [] Sf = new int [N];

        Pr[0] = A[0];

        for(int i = 1; i < N; ++i)
           Pr[i] = Pr[i - 1] * A[i];

        Sf[N - 1] = A[N - 1];

        for(int i = N - 2; i >= 0; --i)
           Sf[i] = Sf[i + 1] * A[i];

        int [] ans = new int [N];

        ans[0] = Sf[1];
        for(int i = 1; i < N - 1; ++i)
           ans[i] = Pr[i - 1] * Sf[i + 1];

        ans[N - 1] = Pr[N - 2];

        return ans;
    }
}

*/

// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
/*
class Solution {
    static List<Integer> firstNegInt(int A[], int k) {
        // code here
        int N = A.length;
        TreeSet<Integer> ts = new TreeSet<>();
        int [] Ans = new int [N - k + 1];

        for(int i = 0; i < k; ++i)
           if(A[i] < 0)
               ts.add(i);

        if(ts.size() > 0)
             Ans[0] = A[ts.first()];

        int l = 0;

        for(int r = k; r < N; ++r) {
            if(A[l] < 0)
               ts.remove(l);

            if(A[r] < 0)
                ts.add(r);

            if(ts.size() > 0)
                Ans[r - k + 1] = A[ts.first()];
            else
                Ans[r - k + 1] = 0;

            l++;
        }

        List<Integer> A1 = new ArrayList<>();

        for(int i = 0; i < N - k + 1; ++i)
           A1.add(Ans[i]);

        return A1;

    }
}

*/

// https://leetcode.com/problems/k-diff-pairs-in-an-array/

/*
class Solution {
    public int findPairs(int[] A, int K) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        int N = A.length;
        int count = 0;

        for(int i = 0; i < N; ++i)
            if(!mp.containsKey(A[i]))
                 mp.put(A[i] , 1);
            else
                 mp.put(A[i] , mp.get(A[i]) + 1);

        for(Map.Entry<Integer , Integer> X : mp.entrySet()) {
            int Key = X.getKey();

            if(mp.containsKey(Key + K))
                ++count;
        }

        if(K != 0)
            return count;

        count = 0;

        for(Map.Entry<Integer , Integer> X : mp.entrySet()) {
            int Key = X.getKey();

            if(mp.get(Key) > 1)
                ++count;
        }

        return count;
    }
}
 */

// https://leetcode.com/problems/maximum-subarray/
/*
class Solution {
    public int maxSubArray(int[] A) {
        int N = A.length;

        int [] P = new int [N];
        TreeSet<Integer> ts = new TreeSet<>();

        P[0] = A[0];
        ts.add(P[0]);
        int ans = P[0];

        for(int i = 1; i < N; ++i) {
           P[i] = A[i];
           P[i] += P[i - 1];

           if(ts.first() < 0)
               ans = Math.max(ans , P[i] - ts.first());
           else
              ans = Math.max(ans , P[i]);

           ts.add(P[i]);
        }

        return ans;
    }
}
*/

/*
class Solution {
    public int maxSubArray(int[] A) {
        int l = 0;
        int S = 0;
        int ans = 0;
        int n = A.length;

        boolean X = false;

        int mn = -10000000;

        for(int i = 0; i < n; ++i) {
            if(A[i] >= 0)
                X = true;

            mn = Math.max(A[i], mn);
        }

        if(!X)
            return mn;

        for(int r = 0 ; r < n; ++r) {
            // System.out.println(S + " -> " + r);
            S += A[r];

            if(S < 0) {
                l = r + 1;
                S = 0;
            } else {
                ans = Math.max(ans , S);
            }

            // System.out.println(S + " " + r);
        }

        return ans;
    }
}

 */

// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
/*
class Solution {
    public int sumOddLengthSubarrays(int[] A) {
        int Se = 0 , So = 0;
        int cntO = 0 , cntE = 0;
        int n = A.length;

        int [] S = new int [n + 1];

        for(int i = 0; i < n; ++i) {
            int O = 0 , E = 0;
            int e = 0 , o = 0;

            o = cntE * A[i] + Se;
            o += A[i];

            e = (cntO * A[i]) + So;

            O = cntE + 1;
            E = cntO;

            cntE = E;
            cntO = O;

            So = o;
            Se = e;

            S[i] = So;

            // System.out.println(So + " " + Se);
        }

        int ans = 0;

        for(int i = 0; i < n; ++i)
            ans += S[i];

        return ans;
    }
}

*/


