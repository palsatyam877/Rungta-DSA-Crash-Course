package Lec2;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lec2 {
    public static void main(String [] args) {
        // https://leetcode.com/problems/top-k-frequent-elements/description/
        /*
class Solution {
    class Pair implements Comparable<Pair>{
        Integer first , second;

        Pair(Integer first , Integer second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair right) {
            if(this.first.compareTo(right.first) == 0)
                return this.second.compareTo(right.second);

            return this.first.compareTo(right.first);
        }
    }

    public int[] topKFrequent(int[] A, int K) {
        HashMap<Integer , Integer> mp = new HashMap<>();

        int N = A.length;

        for(int i = 0; i < N; ++i)
            if(mp.get(A[i]) != null)
                mp.put(A[i] , mp.get(A[i]) + 1);
            else
                mp.put(A[i] , 1);

        TreeSet<Pair> ts = new TreeSet<>();

        for(Integer Key : mp.keySet()) {
            Pair C = new Pair(Key , mp.get(Key));
            if(ts.size() < K)
                ts.add(new Pair(C.second , C.first));
            else {
                Pair L = ts.getFirst();

                if(C.second > L.first) {
                    ts.remove(L);
                    ts.add(new Pair(C.second , C.first));
                }
            }
        }

        int [] ans = new int [K];
        int inx = 0;

        for(Pair C : ts)
             ans[inx++] = C.second;

        return ans;
    }
}

        */


        // https://leetcode.com/problems/roman-to-integer/description/?topicSlugs=array
        // https://leetcode.com/problems/k-closest-points-to-origin/

        /*     Binary Search     */


//        TreeSet<Integer> ts = new TreeSet<>();

        // https://leetcode.com/problems/first-bad-version/description/
        // https://leetcode.com/problems/sqrtx/
        // https://leetcode.com/problems/search-in-rotated-sorted-array/
        // https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
        // https://leetcode.com/problems/koko-eating-bananas/
        // https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
        // https://codeforces.com/contest/1873/problem/E

        /*     Hard Problem      */

        // https://leetcode.com/problems/meeting-rooms-iii/
        // https://leetcode.com/problems/find-median-from-data-stream/
    }
}
