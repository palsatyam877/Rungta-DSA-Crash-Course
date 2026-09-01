package Lec10;

public class Lec10 {
    public static void main(String [] args) {
        System.out.println("Jai Maa Bhavani");
    }
}

// https://leetcode.com/problems/binary-tree-right-side-view/
/*
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

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// https://cses.fi/problemset/task/1674

// https://leetcode.com/problems/validate-binary-search-tree/
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
