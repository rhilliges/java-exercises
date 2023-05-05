package com.example;

public class AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode();
        ListNode c = ln;
        ListNode p1 = l1, p2 = l2;
        int carry = 0;
        while(p1 != null || p2 != null) {
            ListNode n;
            if (p1 == null) {
                p1 = new ListNode(0);
            }
            if (p2 == null) {
                p2 = new ListNode(0);
            }
            int sum = p1.val + p2.val + carry;
            carry = sum / 10;

            n = new ListNode(sum%10);

            c.next = n;
            c = n;

            p1 = p1.next;
            p2 = p2.next;
        }
        if (carry != 0) {
            c.next = new ListNode(carry);
        }
        return ln.next;
    }

    // private ListNode getList(long sum) {
    //     int digit = (int)sum % 10;
    //     if (digit == sum) {
    //         return new ListNode(digit, null);
    //     }
    //     sum /= 10;
    //     ListNode next = getList(sum);
    //     return new ListNode(digit, next);
    // }

    // private long getNumber(ListNode ln, int depth) {
    //     long nr = (long) Math.pow(10, depth) * ln.val;
    //     if (ln.next != null) {
    //         return nr + getNumber(ln.next, ++depth);
    //     }
    //     return nr;
    // }
}
