package Lec10;
import com.sun.source.tree.ArrayAccessTree;

import java.util.*;



public class Lec10 {
    public static void main(String [] args) {
        System.out.println("Jai Maa Bhavani");

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] subord = new int [n + 1];

        for(int i = 2; i <= n; ++i)
            subord[i] = sc.nextInt();

        for(int i = 0; i <= n; ++i)
            adj.add(new ArrayList<>());

        for(int i = 2; i <= n; ++i)
            adj.get(i).add(subord[i]);

        for(int i = 1; i <= n; ++i) {
            System.out.print(i + " -> ");
            System.out.println(subord[i]);
        }
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

// https://leetcode.com/problems/validate-binary-search-tree/
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
