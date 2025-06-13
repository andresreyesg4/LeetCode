package Java.Medium;
import java.util.Random;
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

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        
        // Data preprocessing
        fillListWithInstances(l1, 3);
        fillListWithInstances(l2, 3);
        fillListWithNumber(l1);
        fillListWithNumber(l2);

        // Displaying Data
        System.out.println("l1: in reverse order:");
        printList(l1);
        System.out.println("l2: in reverse order");
        printList(l2);
        System.out.println("l1: in right order");
        reverseAddTwoNumbers(l1);
        System.out.println("l2: in right order");
        reverseAddTwoNumbers(l2);
        // ListNode result = addTwoNumbers(l1, l2);
        // System.out.println(result.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        
        
        ListNode result = new ListNode();
        return result;
    }

    public static void reverseAddTwoNumbers(ListNode l1){
        if(l1.next != null){
            reverseAddTwoNumbers(l1.next);
        }
        System.out.println(l1.val);
    }

    public static void fillListWithNumber (ListNode l1){
        ListNode index = l1;
        Random rand = new Random();
        while(index != null){
            index.val = rand.nextInt(9);
            index = index.next;
        }
    }

    public static void printList(ListNode l1){
        ListNode index = l1;
        while(index != null){
            System.out.println(index.val);
            index = index.next;
        }
    }

    public static void fillListWithInstances(ListNode l1, int length){
        ListNode index = l1;
        int i = 0;
        while(i < length){
            index.next = new ListNode();
            index = index.next;
            i++;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


