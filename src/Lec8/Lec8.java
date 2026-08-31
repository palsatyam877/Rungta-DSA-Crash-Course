package Lec8;

import java.util.*;

public class Lec8 {
    static class Node {
        int val;
        ArrayList<Node> child;

        Node(int val) {
            this.val = val;
            this.child = new ArrayList<>();
        }

        @Override
        public String toString() {
            return this.val +"";
        }
    }

    public static void dfs(Node Curr , Node Prev , ArrayList<ArrayList<Node>> adj) {
        System.out.print(Curr.val + " ");

        for(int i = 0; i < Curr.child.size(); ++i)
            if(Curr.child.get(i) != Prev)
                 dfs(Curr.child.get(i) , Curr , adj);
    }

    public static void main(String [] args) {
        System.out.println("Jai Maa Bhavani");

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);
        Node n13 = new Node(13);
        Node n14 = new Node(14);
        Node n15 = new Node(15);

        n3.child.addAll(List.of(n2 , n1 , n8));
        n8.child.addAll(List.of(n4 , n7 , n9));
        n4.child.addAll(List.of(n13 , n14 , n10 , n11));
        n10.child.add(n12);
        n12.child.addAll(List.of(n5 , n15));
        n15.child.add(n6);

        int N = 15;

        int [][] M = new int[16][16];

        ArrayList<ArrayList<Node>> adj = new ArrayList<>();

        for(int i = 0; i <= N; ++i)
            adj.add(new ArrayList<>());

        for(Node C : List.of(n1 , n2 ,n3 ,n4 ,n5 ,n6 ,n7 ,n8 ,n9 ,n10 ,n11 ,n12 ,n13 ,n14 ,n15))
            for(int j = 0; j < C.child.size(); ++j) {
                adj.get(C.val).add(C.child.get(j));
                adj.get(C.child.get(j).val).add(C);
            }

        dfs(n3, new Node(-1) , adj);

//        ArrayDeque<Node> qu = new ArrayDeque<>();
//        qu.add(n3);
//
//        while(qu.size() > 0) {
//            Node C = qu.poll();
//            System.out.print(C.val + " ");
//
//            for(int j = 0; j < C.child.size(); ++j)
//                qu.add(C.child.get(j));
//        }
    }
}
