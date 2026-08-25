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
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
// https://leetcode.com/problems/sum-of-subarray-minimums/
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
// https://leetcode.com/problems/sliding-window-maximum/description/
// https://leetcode.com/problems/minimum-window-substring/
// https://cses.fi/problemset/task/1652
// https://leetcode.com/problems/subarray-product-less-than-k/submissions/2117041357/
// https://leetcode.com/problems/sliding-window-median/
