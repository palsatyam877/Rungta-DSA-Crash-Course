package Lec13;

public class Lec13 {
    public static void main(String [] args) {
        System.out.println("Jai Shree Krishna");

        int [] a = {2 , 12 , 5 , 3 , 17 , 18 , 21 , 4 , 1};
        int [] nse = new int [a.length];

        for(int i = 0; i < a.length; ++i)
            nse[i] = -1;

        String s = "dgbmg";

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

// https://www.geeksforgeeks.org/problems/steps-by-knight5927/1
/*
class Solution {
	public:

	int minStepToReachTarget(vector<int>& K, vector<int>& T, int n) {
		vector<pair<int, int>> dir = {
			{ 2, 1 }, { -2, 1 }, { 2, -1}, {-2, -1}, { 1, 2 }, { -1, 2 }, { 1, -2 }, {-1, -2}
		};

		queue<pair<int, int>> qu;
		qu.push({ K[0] - 1, K[1] - 1 });

		vector<vector<int>> vis(1000 + 1, vector<int>(1000 + 1, -1));
		vis[K[0] - 1][K[1] - 1] = 0;

		// 		cout << "hello" << " ^\n";

		while (qu.size() > 0) {
			int i = qu.front().first;
			int j = qu.front().second;

// 			cout << i << " " << j << "\n";
			qu.pop();

			for (int k = 0; k < dir.size(); ++k) {
				int I = i + dir[k].first, J = j + dir[k].second;

				if (I < 0 || J < 0 || I >= n || j >= n)
					continue;

				if (vis[I][J] == -1) {

					vis[I][J] = vis[i][j] + 1;
					qu.push({ I, J });
				}
			}
		}

		return vis[T[0] - 1][T[1] - 1];
	}

};
*/
