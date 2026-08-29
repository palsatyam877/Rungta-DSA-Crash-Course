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

    public static void f(ListNode curr) {
          if(curr == null)
              return;

          f(curr.next);
          System.out.print(curr.data + " ");
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

        f(l1);

/*       while(head != null) {
           System.out.print(head.data + " ");
           head = head.next;
       }*/
    }
}

// https://leetcode.com/problems/add-two-numbers/?envType=problem-list-v2&envId=linked-list
/*
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode curr = head;
        int carry = 0;

        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;

            if(curr == null) {
                head = new ListNode(sum % 10);
                curr = head;
            } else {
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
            }

            carry = sum / 10;

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null) {
            int sum = l1.val + carry;

            if(curr == null) {
                head = new ListNode(sum % 10);
                curr = head;
            } else {
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
            }

            carry = sum / 10;
            l1 = l1.next;
        }

        while(l2 != null) {
            int sum = l2.val + carry;

            if(curr == null) {
                head = new ListNode(sum % 10);
                curr = head;
            } else {
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
            }

            carry = sum / 10;
            l2 = l2.next;
        }

        if(carry > 0)
            curr.next = new ListNode(carry);

        return head;
    }
}
*/

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1909424473/?envType=problem-list-v2&envId=linked-list
/*
class Solution {
    public int f(ListNode curr , int n) {
        if(curr == null)
            return n;

        int N = f(curr.next , n);
        N--;

        if(N == -1)
            curr.next = curr.next.next;

        return N;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N = f(head , n);
        N--;
        if(N == -1)
           head = head.next;


        return head;
    }
}
*/

/*

class Solution {

    public ListNode removeNthFromEnd(ListNode H, int n) {
        int N = 0;

        ListNode C = H;

        while(C != null) {
            ++N;
            C = C.next;
        }

        if(N == n)
           return H.next;

        C = H;
        N -= n;
        N--;

        while(N-- > 0)
            C = C.next;

         C.next = C.next.next;

        return H;
    }
}
*/

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/?envType=problem-list-v2&envId=linked-list
/*
class Solution {
    public ListNode deleteDuplicates(ListNode H) {
        ListNode T = H;

        while(H != null) {
            ListNode C = H;

            while(C.next != null && C.next.val == H.val)
                C = C.next;

            H.next = C.next;
            H = H.next;
        }

        return T;
    }
}
*/

// https://leetcode.com/problems/linked-list-cycle-ii/submissions/1912305370/?envType=problem-list-v2&envId=linked-list
/*
public class Solution {
    public ListNode detectCycle(ListNode H) {

        HashSet<ListNode> hs = new HashSet<>();

        while(H != null) {
            if(hs.contains(H))
                return H;

            hs.add(H);

            H = H.next;
        }

        return null;
    }
}

*/

// https://leetcode.com/problems/rotate-list/?envType=problem-list-v2&envId=linked-list

/*
class Solution {
    ListNode GH = null;

    public int f(ListNode C , int k) {
        // System.out.println(C.val + " : K1");
        if(C == null)
            return k;

        // System.out.println(C.val + " : K2");

        int K = f(C.next , k);
        if(C.next == null)
           C.next = GH;

        K--;

        // System.out.println(K + " : K");

        if(K == -1) {
            // System.out.println(C.val + " : Node");
            GH = C.next;
            C.next = null;
        }

        return K;
    }

    public ListNode rotateRight(ListNode H, int k) {
        int N = 0;

        ListNode C = H;

        if(H == null || k == 0)
            return H;

        while(C != null) {
            C = C.next;
            ++N;
        }

        GH = H;

        k %= N;

        C = H;

        if(k == 0)
            return H;

        f(C , k);

        return GH;
    }
}

*/

/*
class Solution {
    public ListNode rotateRight(ListNode H, int k) {
        if(H == null || k == 0)
            return H;

        int N = 0;
        ListNode C = H;
        ListNode Last = null;

        while(C != null) {
            ++N;

            if(C.next == null) {
               Last = C;
               C.next = H;
               break;
            }

            C = C.next;
        }

        int sz = N;
        k %= N;

        if(k == 0) {
           Last.next = null;
           return H;
        }

        k = N - k;
        k--;
        C = H;

        while(k-- > 0) {
            C = C.next;
        }

        H = C.next;
        C.next = null;

        return H;
    }
}

*/

// https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/1912164378/?envType=problem-list-v2&envId=linked-list
/*
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
*/

// https://leetcode.com/problems/copy-list-with-random-pointer/submissions/1912176981/?envType=problem-list-v2&envId=linked-list
/*
class Solution {
    public Node copyRandomList(Node head) {
        Node H = null;
        Node C1 = null;
        Node C = head;
        HashMap<Node , Node> mp = new HashMap<>();

        while(C != null) {
            if(C1 == null) {
               C1 = new Node(C.val);
               H = C1;
            } else {
               C1.next = new Node(C.val);
               C1 = C1.next;
            }

            mp.put(C , C1);


            C = C.next;
        }

        C = head;
        C1 = H;

        while(C != null) {
            C1.random = mp.get(C.random);
            C1 = C1.next;
            C = C.next;
        }

        return H;
    }
}
*/

// https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/submissions/1912366897/?envType=problem-list-v2&envId=linked-list