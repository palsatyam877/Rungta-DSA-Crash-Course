package Lec6;

import java.util.Iterator;
import java.util.TreeSet;

public class Lec6 {
    public static void main(String [] args) {
        System.out.println("Jai Maa Bhavani");

        Character x = 'D';

        int a = (int)x - (int)('A');

        System.out.println(a);

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(18);
        ts.add(7);
        ts.add(4);
        ts.add(45);
        ts.add(20);
        ts.add(11);
        ts.add(25);
        ts.add(0);
        ts.add(17);
        ts.add(-3);
        ts.add(23);
        ts.add(90);
        ts.add(100);
//        ts.add(-10);

        System.out.println(ts);

//        Iterator<Integer> I = ts.tailSet( 7 , true  ).iterator();
        Iterator<Integer> I = ts.tailSet( 10 , true  ).descendingIterator();

        while(I.hasNext())
            System.out.println(I.next());

//        Integer C = 0;
//
//        for(int i = 0; i < 4; ++i)
//            C = I.next();
//
//        System.out.println(C);
//
//        ts.remove(C);
//
//        System.out.println(ts);


//        System.out.println(p);
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

/*
class Solution {
    public String minWindow(String S, String T) {
        int N = S.length() , M = T.length();

        int [][] Ps = new int [N + 1][60];
        int [] Ts = new int [60];

        for(int i = 0; i < N; ++i) {
            Ps[i + 1][(int)S.charAt(i) - (int)('A')]++;

                for(int j = 0; j < 60; ++j)
                   Ps[i + 1][j] += Ps[i][j];
        }

        for(int i = 0; i < M; ++i)
            Ts[(int)T.charAt(i) - (int)('A')]++;

        int L = -1 , R = -1;

        for(int r = 0; r < N; ++r) {
            int lo = 1 , hi = r + 1;
            int TmpL = -1;

            while(lo <= hi) {
                int mid = (lo + hi) / 2;
                boolean isCap = true;

                for(int j = 0; j < 60; ++j)
                    isCap &= (Ps[r + 1][j] - Ps[mid - 1][j] >= Ts[j]);

                if(!isCap)
                    hi = mid - 1;
                else {
                    TmpL = mid;
                    lo = mid + 1;
                }
            }

            if(TmpL != -1) {
                if(L == -1) {
                    L = TmpL;
                    R = r + 1;
                } else {
                    if(R - L + 1 > r - TmpL + 1) {
                      L = TmpL;
                      R = r + 1;
                    }
                }
            }
        }

        StringBuffer ans = new StringBuffer();

        if(L == -1)
           return ans.toString();
        else {
            for(int i = L; i <= R; ++i)
                ans.append(S.charAt(i - 1));

            return ans.toString();
        }
    }
}
*/

// https://cses.fi/problemset/task/1652
/*
#include<bits/stdc++.h>

using namespace std;
#define ll long long

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

	int n , q;
	cin >> n >> q;

	vector<vector<char>> M;

	M.assign(n + 1 , vector<char>(n + 1 , '.'));

	for(int i = 1; i <= n; ++i)
	  for(int j = 1; j <= n; ++j)
	     cin >> M[i][j];

    vector<vector<int>> P(n + 1 , vector<int>(n + 1 , 0));

    for(int i = 1; i <= n; ++i)
       for(int j = 1; j <= n; ++j) {
          P[i][j] = P[i - 1][j] + P[i][j - 1] - P[i - 1][j - 1];

          if(M[i][j] == '*')
          	  P[i][j]++;
       }


     // for(int i = 1; i <= n; ++i)
        // for(int j = 1; j <= n; ++j)
           // cout << P[i][j] << " \n"[j == n];

	 while(q--) {
	 	int i1 , j1 , i2 , j2;
	 	cin >> i1 >> j1 >> i2 >> j2;

	 	int ans = P[i2][j2] - P[i1 - 1][j2] - P[i2][j1 - 1] + P[i1 - 1][j1 - 1];

	 	cout << ans << "\n";
	 }
}
*/


// https://leetcode.com/problems/subarray-product-less-than-k/submissions/2117041357/
/*
class Solution {
    public int numSubarrayProductLessThanK(int[] A, int k) {
        int N = A.length;
        int l = 0;
        long C = 1;
        long ans = 0;

        for(int r = 0; r < N; ++r) {
            C *= A[r];

            while(l <= r && C >= k) {
                C /= A[l];
                ++l;
            }

            if(A[r] >= k)
               continue;

            if(l <= r)
               ans += r - l + 1;
        }

        return (int)ans;
    }
}

*/

// https://leetcode.com/problems/sliding-window-median/

/*
class Solution {
    class Pair implements Comparable<Pair> {
        Long first, second;

        Pair(Long first, Long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair R) {
            if (this.first.compareTo(R.first) == 0)
                return this.second.compareTo(R.second);

            return this.first.compareTo(R.first);
        }

        @Override
        public String toString() {
            return "{ " + this.first + " , " + this.second + " }";
        }
    }

    public double[] medianSlidingWindow(int[] A, int k) {
        TreeSet<Pair> ts = new TreeSet<>();

        if(k == 1) {
            double [] ans = new double [A.length];

            for(int i = 0; i < A.length; ++i)
               ans[i] = A[i] / 1.0;

            return ans;

        }

        for (int i = 0; i < k; ++i)
            ts.add(new Pair((long)A[i], (long)i));

        int N = A.length;

        double[] ans = new double[N - k + 1];

        if ((k & 1) != 0) {
        //    System.out.println(" $$ ");

            int l = 0;
            Iterator<Pair> I1 = ts.iterator();

            Pair M = new Pair((long)-1, (long)-1);

            for (int i = 0; i < (k / 2) + 1; ++i)
                M = I1.next();

            // System.out.println(M);
            ans[l] = M.first;

           System.out.println(ts);

            for (int i = k; i < N; ++i) {
                if (M.second == l) {
                    // same

                    Pair Tmp = new Pair((long)M.first , (long)M.second);

                    Iterator<Pair> I = ts.tailSet(M, true).iterator();
                    I.next();
                    M = I.next();

                    // System.out.println(M + " )");

                    ts.remove(new Pair((long)A[l], (long)l));
                    ts.add(new Pair((long)A[i], (long)i));
                    // System.out.println(ts);
                    ++l;

                    if (A[i] >= M.first) {
                        // do nothing
                    } else {
                        Iterator<Pair> I2 = ts.headSet(M, true).descendingIterator();
                        M = I2.next();
                        M = I2.next();
                    }
                } else if (M.first < A[l]) {
                    // greater

                    // System.out.println("--------------");
                    System.out.println(M);
                    ts.remove(new Pair((long)A[l], (long)l));
                    ts.add(new Pair((long)A[i], (long)i));
                    ++l;

                    if (A[i] >= M.first) {
                        // do nothing
                    } else {
                        Iterator<Pair> I = ts.headSet(M, true).descendingIterator();
                        M = I.next();
                        M = I.next();
                    }
                } else if (M.first > A[l]) {
                    // smaller
                    ts.remove(new Pair((long)A[l], (long)l));
                    ts.add(new Pair((long)A[i], (long)i));
                    ++l;

                    if (A[i] < M.first) {
                        // do nothing
                    } else {
                        Iterator<Pair> I = ts.tailSet(M, true).iterator();
                        M = I.next();
                        M = I.next();
                    }
                } else if (M.first == A[l]) {
                    if (l > M.second) {
                        // greater
                        ts.remove(new Pair((long)A[l], (long)l));
                        ts.add(new Pair((long)A[i], (long)i));
                        ++l;

                        if (A[i] > M.first) {
                            // do nothing
                        } else {
                            Iterator<Pair> I = ts.headSet(M, true).descendingIterator();
                            M = I.next();
                            M = I.next();
                        }
                        // (long)
                    } else {
                        // smaller
                        ts.remove(new Pair((long)A[l], (long)l));
                        ts.add(new Pair((long)A[i], (long)i));
                        ++l;

                        if (A[i] < M.first) {
                            // do nothing
                        } else {
                            Iterator<Pair> I = ts.tailSet(M, true).iterator();
                            M = I.next();
                            M = I.next();
                        }
                    }
                }
                // System.out.println(M);
                ans[l] = M.first;
            }
        } else {
            // Even

        //    System.out.println(" $$ ");

            int l = 0;
            Iterator<Pair> I1 = ts.iterator();

            Pair M = new Pair((long)-1, (long)-1);

            for (int i = 0; i < (k / 2); ++i)
                M = I1.next();

            // System.out.println(M);

            Iterator<Pair> I4 = ts.tailSet(M , true).iterator();
            Pair M4 = I4.next();
                 M4 = I4.next();

            ans[l] = (M.first + M4.first) / 2.0;

            for (int i = k; i < N; ++i) {
                if (M.second == l) {
                    // same

                    Pair Tmp = new Pair((long)M.first , (long)M.second);

                    Iterator<Pair> I = ts.tailSet(M, true).iterator();
                    I.next();
                    M = I.next();

                    // System.out.println(M + " )");

                    ts.remove(new Pair((long)A[l], (long)l));
                    ts.add(new Pair((long)A[i], (long)i));
                    // System.out.println(ts);
                    ++l;

                    if (A[i] >= M.first) {
                        // do nothing
                    } else {
                        Iterator<Pair> I2 = ts.headSet(M, true).descendingIterator();
                        M = I2.next();
                        M = I2.next();
                    }
                } else if (M.first < A[l]) {
                    // greater
                    ts.remove(new Pair((long)A[l], (long)l));
                    ts.add(new Pair((long)A[i], (long)i));
                    ++l;

                    if (A[i] >= M.first) {
                        // do nothing
                    } else {
                        Iterator<Pair> I = ts.headSet(M, true).descendingIterator();
                        M = I.next();
                        M = I.next();
                    }
                } else if (M.first > A[l]) {
                    // smaller
                    ts.remove(new Pair((long)A[l], (long)l));
                    ts.add(new Pair((long)A[i], (long)i));
                    ++l;

                    if (A[i] < M.first) {
                        // do nothing
                    } else {
                        Iterator<Pair> I = ts.tailSet(M, true).iterator();
                        M = I.next();
                        M = I.next();
                    }
                } else if (M.first == A[l]) {
                    if (l > M.second) {
                        // greater
                        ts.remove(new Pair((long)A[l], (long)l));
                        ts.add(new Pair((long)A[i], (long)i));
                        ++l;

                        if (A[i] > M.first) {
                            // do nothing
                        } else {
                            Iterator<Pair> I = ts.headSet(M, true).descendingIterator();
                            M = I.next();
                            M = I.next();
                        }
                    } else {
                        // smaller
                        ts.remove(new Pair((long)A[l], (long)l));
                        ts.add(new Pair((long)A[i], (long)i));
                        ++l;

                        if (A[i] < M.first) {
                            // do nothing
                        } else {
                            Iterator<Pair> I = ts.tailSet(M, true).iterator();
                            M = I.next();
                            M = I.next();
                        }
                    }
                }
                // System.out.println(M);

                Iterator<Pair> I3 = ts.tailSet(M , true).iterator();
                Pair M3 = I3.next();
                     M3 = I3.next();

                ans[l] = (M.first + M3.first) / 2.0;
            }
        }

        return ans;
    }
}

*/