package Lec11;

import java.util.*;

public class Lec11 {
    public static void main(String [] args) {
        System.out.println("Jai Maa Bhavani");

        ArrayList<Integer> Arr = new ArrayList<>(List.of(10, 3 , 12 , 16 , 5 , 7 , 19));

        Iterator<Integer> it = Arr.iterator();

        while(it.hasNext())
            System.out.println(it.next());
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