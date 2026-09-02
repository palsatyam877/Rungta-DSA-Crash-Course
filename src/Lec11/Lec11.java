package Lec11;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class Lec11 {
    public static ArrayList<ArrayList<Integer>> f(int curr , int [] A) { // 5
        if(curr == A.length - 1)
            return new ArrayList<ArrayList<Integer>>(List.of( new ArrayList<>() , new ArrayList<>(List.of(A[A.length - 1]))));

        ArrayList<ArrayList<Integer>> soSFar = f(curr + 1 , A);

        int N = soSFar.size();

        for(int i = 0; i < N; ++i) {
            soSFar.add(new ArrayList<>());

            soSFar.getLast().add(A[curr]);
            for(int j = 0; j < soSFar.get(i).size(); ++j)
                soSFar.getLast().add(soSFar.get(i).get(j));
        }

        return soSFar;
    }

    public static void main(String [] args) {
        System.out.println("Jai Maa Bhavani");

        /*
        ArrayList<Integer> Arr = new ArrayList<>(List.of(10, 3 , 12 , 16 , 5 , 7 , 19));

        Iterator<Integer> it = Arr.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        StringBuffer S = new StringBuffer();
        S.append('r');
        S.append('q');
        System.out.println(S);
        S.reverse();
        System.out.println(S);

        HashMap<Long , Integer> mp = new HashMap<>();
         */

        // Number of Subsequences

//        int [] a = {4 , 3 , 12 , 9 , 7 , 5};
//        //          0   1   2    3   4   5

        int [] a = {4 , 3 , 12};
        //          0   1   2    3   4   5
        int n = a.length;

//        ArrayList<ArrayList<Integer>> Ans = f(0 , a);
//
//        for(int i = 0; i < Ans.size(); ++i)
//            System.out.println(Ans.get(i));

        /*
        System.out.println("-------------------------------------");

        for(int mask = 0; mask < (1 << n); ++mask) {
            System.out.print("[ ");
            for(int j = 0; j < n; ++j)
                 if((mask & (1 << j)) != 0)
                     System.out.print(a[j] + " ");
            System.out.println(" ]");
        }
         */
    }
}

// https://leetcode.com/problems/binary-search-tree-iterator/
/*
class BSTIterator {
    ArrayList<Integer> Temp = new ArrayList<>();
    Integer inx = 0;

    public void dfs(TreeNode Curr) {
        if(Curr.left != null)
            dfs(Curr.left);

        Temp.add(Curr.val);

        if(Curr.right != null)
            dfs(Curr.right);
    }

    public BSTIterator(TreeNode root) {
        Temp = new ArrayList<>(List.of(-1));
        dfs(root);
    }

    public int next() {
        inx++;
        return Temp.get(inx);
    }

    public boolean hasNext() {
        return inx + 1 < Temp.size();
    }
}
*/

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
/*
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) {
             List<List<Integer>> A = new ArrayList<>();
            return A;
        }

        ArrayDeque<TreeNode> qu = new ArrayDeque<>();
        qu.offer(new TreeNode(-1000));
        qu.offer(root);

        List<List<Integer>> Ans = new ArrayList<>();
        int depth = -1;

        while(qu.size() > 0) {
            TreeNode Curr = qu.poll();

            if(Curr.val == -1000) {
                if(qu.size() == 0)
                    break;

                qu.offer(new TreeNode(-1000));
                ++depth;

                Ans.add(new ArrayList<>());


                continue;
            } else
                Ans.get(depth).add(Curr.val);

            if(Curr.left != null)
                qu.offer(Curr.left);

            if(Curr.right != null)
               qu.offer(Curr.right);
        }

        for(int i = 0; i < Ans.size(); ++i)
          if((i & 1) != 0)
           Collections.reverse(Ans.get(i));

        return Ans;
    }
}
 */

// https://leetcode.com/problems/repeated-dna-sequences/description/

/*
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<Character , Integer> mp = new HashMap<>();
        mp.put('A' , 1);
        mp.put('C' , 2);
        mp.put('G' , 3);
        mp.put('T' , 4);

        HashMap<Integer , Character> mpR = new HashMap<>();
        mpR.put(1 , 'A');
        mpR.put(2 , 'C');
        mpR.put(3 , 'G');
        mpR.put(4 , 'T');

        List<String> Ans = new ArrayList<String>();

        HashMap<Long,Integer> Cnt = new HashMap<>();

        for(int i = 0; i + 10 <= s.length(); ++i) {
           long Curr = 0;

            for(int j = i; j < i + 10; ++j) {
               Curr *= 10;
               Curr += mp.get(s.charAt(j));
            }

            if(Cnt.containsKey(Curr))
                Cnt.put(Curr , Cnt.get(Curr) + 1);
            else
                Cnt.put(Curr , 1);
        }

        // System.out.println(Cnt);

        for(Map.Entry<Long , Integer> C : Cnt.entrySet()) {
            long K = C.getKey();
            Integer F = C.getValue();

            if(F >= 2) {
               StringBuffer S = new StringBuffer();
               Long tempC = K;

                while(tempC > 0) {
                   S.append(mpR.get((int)(tempC % 10) ));
                  tempC /= 10;
                 }

                S.reverse();

                Ans.add(S.toString());
            }
        }

        return Ans;
    }
}

*/

// https://leetcode.com/problems/permutations/

/*
class Solution {
    public List<List<Integer>> f(int n , int [] A) {
        if(n == 0) {
            List<List<Integer>> Ans = new ArrayList<>();
            Ans.add(new ArrayList<>(List.of(A[0])));

            return Ans;
        }

        List<List<Integer>> soFar = f(n - 1 , A);

        int N = soFar.size();

        for(int i = 0; i < N; ++i) {
            soFar.get(i).add(A[n]);

            for(int j = n; j >= 1; --j) {
                Collections.swap(soFar.get(i) , j , j - 1);

                List<Integer> tmp = new ArrayList<>();

                for(int k = 0; k <= n; ++k)
                   tmp.add(soFar.get(i).get(k));

                soFar.add(tmp);
            }

            for(int k = 1; k <= n; ++k)
                Collections.swap(soFar.get(i) , k , k - 1);
        }

        return soFar;
    }

    public List<List<Integer>> permute(int[] A) {
        return f(A.length - 1 , A);
    }
}

*/

/*
class Solution {
    vector<vector<int>> f(int n, vector<int>& A) {
        if (n == 0) {
            vector<vector<int>> Ans;
            Ans.push_back(vector<int>({}));
            Ans.push_back(vector<int>({A[0]}));
            return Ans;
        }

        vector<vector<int>> soFar = f(n - 1, A);

        for (int i = 0; i < soFar.size(); ++i)
            for (int j = 0; j < soFar[i].size(); ++j)
                cout << soFar[i][j] << " \n"[j == (int)soFar[i].size() - 1];

        cout << "---------------------\n";

        int N = soFar.size();

        for (int i = 0; i < N; ++i) {

            soFar[i].push_back(A[n]);

            for (int j = (int)soFar[i].size() - 1; j >= 1; --j) {
                swap(soFar[i][j], soFar[i][j - 1]);

                vector<int> tmp;

                for (int k = 0; k <= (int)soFar[i].size() - 1; ++k)
                    tmp.push_back(soFar[i][k]);

                soFar.push_back(tmp);
            }

            // if (soFar[i].size() == 1)
            //     continue;

            for (int k = 1; k <= soFar[i].size() - 1; ++k) {
                // cout << k << " <- k\n";
                // cout << soFar.size() << " $\n";
                // cout << soFar[i].size() << " @";
                // cout << soFar[i][1] << " ##\n";
                swap(soFar[i][k], soFar[i][k - 1]);
            }
        }

        return soFar;
    }

public:
    vector<vector<int>> permuteUnique(vector<int>& A) {
        vector<vector<int>> X = f((int)A.size() - 1, A);

        set<vector<int>> Ans;

        for(int i = 0; i < X.size(); ++i) {
            if(X[i].size() == A.size())
                Ans.insert(X[i]);
        }

        vector<vector<int>> Ans1;

        for(auto &it : Ans)
           Ans1.push_back(it);

        return Ans1;
    }
};

*/