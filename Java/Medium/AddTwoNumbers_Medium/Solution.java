package Java.Medium.AddTwoNumbers_Medium;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *  int val;
 *  ListNote next;
 *  ListNode() {}
 *  ListNode(int val) { this.val = val; }
 *  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 * Write a function where given two non-zero linked lists in reversed order, returns the addition of the numbers
 * Example 1: l1=[2,4,3] l2=[5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807
 * 
 * Example 2: l1=[2,4,5] l2=[4,5]
 * Output: [5,9,9]
 * Explanation: 542 + 54 = 599
 * 
 * Solution: Utilize the length list as N to leverage the use of 10^(N-1)and find the number from the linked list using recursion. 
 * Example: 3 x 10^2 = 300 -> 300 + (4 x 10^1) = 340 -> 340 + (2 x 10^0)= 342
 *          4 x 10^2 = 400 -> 400 + (6 x 10^1) = 460 -> 460 + (5 x 10^0)= 465
 *                                                                      = 807
 */
 

public class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        // Create a dummy head node for the result linked list.
        // This simplisies handling the head of the new list.
        ListNode dummyHead = new ListNode(0);
        // 'current' pointer will traverse and build the result list.
        ListNode current = dummyHead;
        // 'carry' variable to store any carry-over to the next digit. 
        int carry = 0;

        // loop while there are still digits in either list or there's a carry.
        while(l1 != null || l2 != null || carry !=0 ){
            // Get the digit from l1, or 0 if l1 is null.
            int digit1 = (l1 != null) ? l1.val : 0;
            // Similarly get the digit from l2 or 0 if null.
            int digit2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum of the current digits and the carry.
            int sum = digit1 + digit2 + carry;
            // Update the carry for th enext iteration
            carry = sum / 10;
            int digitSum = sum % 10;
            // Create a new node with the calculated digitSum.
            current.next = new ListNode(digitSum);
            // Move the 'current' pointer to the newly created node.
            current = current.next;

            // Move l1 to its next node if it's not null.
            if (l1 != null) {
                l1 = l1.next;
            }
            // Move l2 to its next node if it's not null.
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        ListNode result = dummyHead.next;
        return result;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }
}

