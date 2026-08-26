package Lec6;

public class Lec6 {
    public static void main(String [] args) {
//        System.out.println("Jai Maa Bhavani");

        Character x = 'D';

        int a = (int)x - (int)('A');

        System.out.println(a);

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


     for(int i = 1; i <= n; ++i)
        for(int j = 1; j <= n; ++j)
           cout << P[i][j] << " \n"[j == n];

}

*/

// https://leetcode.com/problems/subarray-product-less-than-k/submissions/2117041357/
// https://leetcode.com/problems/sliding-window-median/

// https://leetcode.com/problems/sum-of-subarray-minimums/