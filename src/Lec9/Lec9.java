package Lec9;

import java.util.ArrayDeque;

public class Lec9 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void f() {
        System.out.println("Hello everyone");
    }

    /*
    Pre Order

    public static void dfs(Node C) {
        if(C == null)
              return;

        System.out.print(C.data + " ");

        dfs(C.left); dfs(C.right);
    }

    */

    /*
    In Order
    public static void dfs(Node C) {
        if(C == null)
            return;

        dfs(C.left);

        System.out.print(C.data + " ");

        dfs(C.right);
    }
     */

    /*
       Post Order
    public static void dfs(Node C) {
        if(C == null)
            return;

        dfs(C.left);
        dfs(C.right);
        System.out.print(C.data + " ");
    }

    */

    public static void main(String [] args) {
        System.out.println("Jai Maa Ambe");

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        n4.left = n7;
        n7.right = n5;
        n5.right = n6;
        n4.right = n3;
        n3.left = n8;
        n8.right = n2;
        n2.right = n1;

//        ArrayDeque<Node> qu = new ArrayDeque<>();
//        qu.add(n4);

//        while(qu.size() > 0) {
//            Node Curr = qu.poll();
//
//            System.out.print(Curr.data + " ");
//
//            if(Curr.left != null)
//                qu.offer(Curr.left);
//
//            if(Curr.right != null)
//                 qu.offer(Curr.right);
//        }

//        dfs(n4);
    }
}

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
/*
class Solution {
    public int dfs(TreeNode C) {
        if (C == null)
            return 0;

        return 1 + Math.max(dfs(C.left), dfs(C.right));
    }

    public int maxDepth(TreeNode R) {
        if (R == null)
            return 0;
        return dfs(R);
    }
}

*/

// https://leetcode.com/problems/diameter-of-binary-tree
// https://leetcode.com/problems/balanced-binary-tree/
// https://leetcode.com/problems/same-tree
// https://leetcode.com/problems/subtree-of-another-tree/
// https://leetcode.com/problems/binary-tree-level-order-traversal/
// https://leetcode.com/problems/binary-tree-right-side-view/
// https://leetcode.com/problems/count-good-nodes-in-binary-tree/
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// https://cses.fi/problemset/task/1674

// https://leetcode.com/problems/validate-binary-search-tree/
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/

