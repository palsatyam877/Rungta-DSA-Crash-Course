package Lec10;
import com.sun.source.tree.ArrayAccessTree;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec10 {
    static class FastReader {

        // BufferedReader to read input
        BufferedReader b;

        // StringTokenizer to tokenize input
        StringTokenizer s;

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() {
            return Integer.parseInt(next());
        }

        // Method to read the next token as a long
        long nextLong() {
            return Long.parseLong(next());
        }

        // Method to read the next token as a double
        double nextDouble() {
            return Double.parseDouble(next());
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static int dfs(int curr , ArrayList<ArrayList<Integer>> adj , int [] A) {
          int tot = 1;

          for(int child : adj.get(curr)) {
             tot +=  dfs(child , adj , A);
          }

          A[curr] = tot - 1;

          return tot;
    }

    public static void main(String [] args) {
//        System.out.println("Jai Maa Bhavani");

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        int [] subord = new int [n + 1];

        for(int i = 2; i <= n; ++i)
            subord[i] = sc.nextInt();

        for(int i = 0; i <= n; ++i)
            adj.add(new ArrayList<>());

        for(int i = 2; i <= n; ++i)
            adj.get(subord[i]).add(i);

        int [] A = new int[n + 1];

        dfs(1 , adj , A);

        for(int i = 1; i <= n; ++i)
            System.out.print(A[i] + " ");
    }
}

// https://leetcode.com/problems/binary-tree-right-side-view/
/*  BFS
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayDeque<TreeNode> qu = new ArrayDeque<>();
        int N = -100001;

        if(root == null) {
           return new ArrayList<>();
        }

        TreeNode NULL = new TreeNode(N);
        qu.add(NULL);
        qu.add(root);

        int prev = N;

        List<Integer> ans = new ArrayList<>();

        while(qu.size() > 0) {
            TreeNode C = qu.poll();

            if(C.val == N) {
                if(prev != N)
                    ans.add(prev);

                if(qu.size() != 0)
                    qu.offer(NULL);
                else
                   break;

                continue;
            } else
                prev = C.val;


            if(C.left != null)
                qu.offer(C.left);

            if(C.right != null)
                qu.offer(C.right);
        }

        return ans;
    }
}
*/

/* DFS
class Solution {
    public void dfs(TreeNode C , int depth , List<Integer> ans) {
        if(depth + 1 > ans.size())
            ans.add(0);

        ans.set(depth , C.val);

        if(C.left != null)
            dfs(C.left , depth + 1 , ans);

        if(C.right != null)
            dfs(C.right , depth + 1 , ans);
    }

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
           return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();

        dfs(root , 0 , ans);

        return ans;

    }
}
*/

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/
/*
class Solution {
    public int dfs(TreeNode C , int maxSoFar) {
        int ans = C.val >= maxSoFar ? 1 : 0;

        if(C.left != null)
            ans += dfs(C.left , Math.max(maxSoFar , C.val));

        if(C.right != null)
            ans += dfs(C.right , Math.max(maxSoFar , C.val));

        return  ans;
    }

    public int goodNodes(TreeNode root) {
        return dfs(root , -100000);
    }
}
*/

// https://leetcode.com/problems/binary-tree-maximum-path-sum/
/*
class Solution {
    class Pair {
        Integer Mx , cMx;

        Pair(Integer Mx , Integer cMx) {
            this.Mx = Mx;
            this.cMx = cMx;
        }
    }

    public Pair dfs(TreeNode Curr) {
        int Mn = (int)-1e9;
        Pair C = new Pair(Curr.val , Curr.val);
        Pair L = new Pair(Mn , Mn);
        Pair R = new Pair(Mn , Mn);

        if(Curr.left != null)
            L = dfs(Curr.left);

        if(Curr.right != null)
            R = dfs(Curr.right);

        C.Mx = Math.max( Math.max(L.Mx , R.Mx) ,  Math.max( Curr.val , Math.max( Curr.val + L.cMx + R.cMx , Math.max( Curr.val + L.cMx , Curr.val + R.cMx ))));
        C.cMx = Math.max( Curr.val ,  Math.max( Curr.val + L.cMx , Curr.val + R.cMx ));

        return C;
    }

    public int maxPathSum(TreeNode root) {
         return dfs(root).Mx;
    }
}
*/

// https://cses.fi/problemset/task/1674
/*
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec10 {
    static class FastReader {

        // BufferedReader to read input
        BufferedReader b;

        // StringTokenizer to tokenize input
        StringTokenizer s;

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() {
            return Integer.parseInt(next());
        }

        // Method to read the next token as a long
        long nextLong() {
            return Long.parseLong(next());
        }

        // Method to read the next token as a double
        double nextDouble() {
            return Double.parseDouble(next());
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static int dfs(int curr , ArrayList<ArrayList<Integer>> adj , int [] A) {
          int tot = 1;

          for(int child : adj.get(curr)) {
             tot +=  dfs(child , adj , A);
          }

          A[curr] = tot - 1;

          return tot;
    }

    public static void main(String [] args) {
//        System.out.println("Jai Maa Bhavani");

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        int [] subord = new int [n + 1];

        for(int i = 2; i <= n; ++i)
            subord[i] = sc.nextInt();

        for(int i = 0; i <= n; ++i)
            adj.add(new ArrayList<>());

        for(int i = 2; i <= n; ++i)
            adj.get(subord[i]).add(i);

        int [] A = new int[n + 1];

        dfs(1 , adj , A);

        for(int i = 1; i <= n; ++i)
            System.out.print(A[i] + " ");
    }
}
*/

// https://leetcode.com/problems/validate-binary-search-tree/
/*
class Solution {
    public class Pair {
        Long mn , mx;
        Boolean bst;

        Pair(Long mn , Long mx , Boolean bst) {
            this.mn = mn;
            this.mx = mx;
            this.bst = bst;
        }
    }

    public Pair dfs(TreeNode Curr) {
        long MX = (long)1e18;

        Pair L = new Pair(MX , MX , true);
        Pair R = new Pair(-MX , -MX , true);

        if(Curr.left != null)
           L = dfs(Curr.left);

        if(Curr.right != null)
           R = dfs(Curr.right);

        long CurrMn = MX , CurrMx = -MX;
        boolean CurrBst = true;

        if(L.mx == MX)
            CurrMn = Curr.val;
        else {
            CurrMn = L.mn;
            CurrBst &= (Curr.val > L.mx) && L.bst;
        }

        if(R.mx == -MX)
            CurrMx = Curr.val;
        else {
            CurrMx = R.mx;
            CurrBst &= (Curr.val < R.mn) && R.bst;
        }

        return new Pair( CurrMn , CurrMx , CurrBst );
    }

    public boolean isValidBST(TreeNode root) {
        return dfs(root).bst;
    }
}
*/


// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
