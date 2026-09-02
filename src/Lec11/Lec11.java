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
