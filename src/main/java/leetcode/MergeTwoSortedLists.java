package leetcode;

import java.util.*;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        var result =  mergeTwoSortedLists(l1, l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    // ! Check https://www.youtube.com/watch?v=IMWiPqoneT4&ab_channel=DineshVaryani for animation solution.
    private static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;


        while(l1 != null && l2 != null){

            if(l1.val < l2.val){
                currentNode.next = l1;
                l1 = l1.next;
            }
            else{
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }

        if(l1 != null){
            currentNode.next = l1;
            l1 = l1.next;
        }

        if(l2 != null){
            currentNode.next = l2;
            l2 = l2.next;
        }

        return tempNode.next;
    }

    static class ListNode {
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

}
