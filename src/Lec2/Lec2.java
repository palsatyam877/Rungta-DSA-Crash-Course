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
        // https://leetcode.com/problems/search-in-rotated-sorted-array/
/*
class Solution {
    public int search(int[] A, int T) {
        int N = A.length;

        if(A[0] < A[N - 1]) {
            // no rotations
            int lo = 0 , hi = N - 1;

            while(lo <= hi) {
                int mid = (lo + hi) / 2;

                if(A[mid] == T)
                    return mid;
                else if(A[mid] > T)
                    hi = mid - 1;
                else
                  lo = mid + 1;
            }
        } else {
            int piv = N - 1 , lo = 0 , hi = N - 1;

            while(lo <= hi) {
                int mid = (lo + hi) / 2;
                int ans = N - 1;

                if(A[mid] > A[N - 1])
                    lo = mid + 1;
                else {
                    piv = mid;
                    hi = mid - 1;
                }
            }

            if(T == A[N - 1])
                return N - 1;

            if(T > A[N - 1]) {
                lo = 0; hi = piv - 1;

                while(lo <= hi) {
                    int mid = (lo + hi) / 2;

                    if(A[mid] > T)
                        hi = mid - 1;
                    else if(A[mid] < T)
                        lo = mid + 1;
                    else
                       return mid;
                }

            } else {
                lo = piv ; hi = N - 1;

                while(lo <= hi) {
                    int mid = (lo + hi) / 2;

                    if(A[mid] > T)
                        hi = mid - 1;
                    else if(A[mid] < T)
                        lo = mid + 1;
                    else
                       return mid;
                }
            }

            return -1;
        }

        return -1;
    }
}

*/

        // https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
/*
class Solution {
    public int shipWithinDays(int[] W, int D) {
        int lo = 0 , hi = 100000000 , N = W.length;
        int ans = N - 1;

        for(int i = 0; i < N; ++i)
            lo = Math.max(lo , W[i]);

        while(lo <= hi) {
            int Capacity = (lo + hi) / 2;
            int currW = 0 , currD = 0;

            for(int i = N - 1; i >= 0; --i) {
                if(currW + W[i] > Capacity) {
                    currD++;
                    currW = W[i];
                } else
                    currW += W[i];


                // System.out.println(currW + " " + i);
            }

            if(currW > 0)
                currD++;

            if(currD > D)
                lo = Capacity + 1;
            else {
                ans = Capacity;
                hi = Capacity - 1;
            }
        }

        return ans;
    }
}

*/

        // https://leetcode.com/problems/koko-eating-bananas/
/*
class Solution {
    public boolean Check(int S , int [] P , int H) {
        int N = P.length;
        int tot = 0;

        for(int i = 0; i < N; ++i)
            tot += (P[i] / S) + (P[i] % S == 0 ? 0 : 1);

        return tot <= H;
    }

    public int minEatingSpeed(int[] P, int H) {
        int T = 0;

        for(int i = 0; i < P.length; ++i)
            T = Math.max(T , P[i]);

        int ans = 0;

        for(int S = 1; S <= T; ++S) {
            if(Check(S , P , H)) {
                System.out.print("T ");
                if(ans == 0)
                    ans = S;
            } else
                System.out.print("F ");
        }

        return ans;
    }
}

*/
        /*
class Solution {
    public boolean Check(long S , int [] P , long H) {
        int N = P.length;
        long tot = 0;

        for(int i = 0; i < N; ++i)
            tot += (P[i] / S) + (P[i] % S == 0 ? 0 : 1);

        return tot <= H;
    }

    public int minEatingSpeed(int[] P, int H) {
        int T = 0;

        for(int i = 0; i < P.length; ++i)
            T = Math.max(T , P[i]);

        int ans = 0;
        long lo = 1 , hi = T;

        while(lo <= hi) {
            long S = (lo + hi) / 2;

            if(Check(S , P , H)) {
                ans = (int)S;
                hi = S - 1;
            } else {
                lo = S + 1;
            }
        }

        return ans;
    }
}


        */

        // https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
        // https://codeforces.com/contest/1873/problem/E

        /*     Hard Problem      */

        // https://leetcode.com/problems/meeting-rooms-iii/
        // https://leetcode.com/problems/find-median-from-data-stream/
    }
}
