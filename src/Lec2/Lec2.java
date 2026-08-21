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
/*
class Solution {
    public int romanToInt(String s) {
        int Ans = 0;

        Map<Character , Integer> mp = new HashMap<>();
        mp.put('I' , 1);
        mp.put('V' , 5);
        mp.put('X' , 10);
        mp.put('L' , 50);
        mp.put('C' , 100);
        mp.put('D' , 500);
        mp.put('M' , 1000);

        HashSet<String> hs = new HashSet<>();

        String [] S = { "IV" , "IX" , "XL" , "XC" , "CD" , "CM"};

        Ans = mp.get(s.charAt(0));

        for(int i = 1; i < s.length(); ++i) {
            Ans += mp.get(s.charAt(i));

            StringBuffer C = new StringBuffer();

            C.append(s.charAt(i - 1));
            C.append(s.charAt(i));

            String T = C.toString();

            for(int j = 0; j < S.length; ++j)
                if(S[j].equals(T)) {
                    Ans -= (mp.get(s.charAt(i - 1)) * 2);
                }
        }

        return Ans;

        // XIV
    }
}

*/

        // https://leetcode.com/problems/k-closest-points-to-origin/

/*
class Solution {
    class Pair implements Comparable<Pair> {
        Integer first , second;

        Pair(Integer first , Integer second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair Right) {
            if(this.first.compareTo(Right.first) == 0)
                return this.second.compareTo(Right.second);

            return this.first.compareTo(Right.first);
        }
    }

    public int[][] kClosest(int[][] P, int K) {
        TreeSet<Pair> ts = new TreeSet<>();

        for(int i = 0; i < K; ++i)
            ts.add(new Pair( -1 * ((P[i][0] * P[i][0]) + (P[i][1] * P[i][1])) , i));

        for(int i = K; i < P.length; ++i) {
            Pair C = ts.getFirst();

            int CurrDis = -C.first;
            int Dis = (P[i][0] * P[i][0]) + (P[i][1] * P[i][1]);

            if(Dis < CurrDis) {
                ts.remove(C);
                ts.add(new Pair(-Dis , i));
            }
        }

        int [][] ans = new int [K][2];
        int inx = 0;

        for(Pair C : ts) {
            ans[inx][0] = P[C.second][0];
            ans[inx++][1] = P[C.second][1];
        }

        return ans;
    }
}

*/

        /*     Binary Search     */

//        TreeSet<Integer> ts = new TreeSet<>();

        // https://leetcode.com/problems/first-bad-version/description/
/*
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long lo = 1 , hi = (int)n , ans = (int)n;

        while(lo <= hi) {
            long mid = (lo + hi) / 2;

            if(isBadVersion((int)mid)) {
                ans = mid;
                hi = mid - 1;
            } else
                lo = mid + 1;
        }

        return (int)ans;
    }
}

*/

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
