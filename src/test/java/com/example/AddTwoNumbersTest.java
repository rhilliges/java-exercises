package com.example;

import org.junit.Test;

import com.example.AddTwoNumbers.ListNode;

public class AddTwoNumbersTest {
    
// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers converter =  new AddTwoNumbers();
        ListNode n2 = converter.new ListNode(3);
        ListNode n1 = converter.new ListNode(4, n2);
        ListNode l1 = converter.new ListNode(2, n1);

        ListNode k2 = converter.new ListNode(4);
        ListNode k1 = converter.new ListNode(6, k2);
        ListNode l2 = converter.new ListNode(5, k1);

        ListNode r = converter.addTwoNumbers(l1, l2);

        System.out.println(r);
    }
}
