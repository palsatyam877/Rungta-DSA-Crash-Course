package Lec6;

public class Lec6 {
    public static void main(String [] args) {
        System.out.println("Jai Maa Bhavani");
    }
}

// https://leetcode.com/problems/sliding-window-maximum/description/

/*
class Solution {
    class Pair implements Comparable<Pair>{
        Integer first , second;

        Pair(Integer first , Integer second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair R) {
            if(this.first.compareTo(R.first) == 0)
                return this.second.compareTo(R.second);

            return this.first.compareTo(R.first);
        }
    }

    public int[] maxSlidingWindow(int[] A, int k) {
        int N = A.length;
        TreeSet<Pair> ts = new TreeSet<>();

        for(int i = 0; i < k; ++i)
            ts.add(new Pair(A[i] , i));

        int [] ans = new int [N - k  + 1];

        ans[0] = ts.last().first;

        int l = 0;

        for(int r = k; r < N; ++r) {
            ts.remove(new Pair( A[l] , l));
            ts.add(new Pair(A[r] , r));
            l++;

            ans[l] = ts.last().first;
        }

        return ans;
    }
}
*/

// https://leetcode.com/problems/minimum-window-substring/
// https://leetcode.com/problems/sum-of-subarray-minimums/
// https://cses.fi/problemset/task/1652
// https://leetcode.com/problems/subarray-product-less-than-k/submissions/2117041357/
// https://leetcode.com/problems/sliding-window-median/