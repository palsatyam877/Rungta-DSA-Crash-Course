package Lec7;

import java.awt.desktop.SystemEventListener;

public class Lec7 {
    static class ListNode {
        Integer data;
        ListNode next;

        ListNode(Integer data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String [] args) {
//        System.out.println("Jai Maa Jagat Janani");

        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(7);
        ListNode l4 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode head = l1;

       while(head != null) {
           System.out.print(head.data + " ");
           head = head.next;
       }
    }
}

// https://leetcode.com/problems/add-two-numbers/?envType=problem-list-v2&envId=linked-list
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1909424473/?envType=problem-list-v2&envId=linked-list
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/?envType=problem-list-v2&envId=linked-list
// https://leetcode.com/problems/linked-list-cycle-ii/submissions/1912305370/?envType=problem-list-v2&envId=linked-list
// https://leetcode.com/problems/rotate-list/?envType=problem-list-v2&envId=linked-list