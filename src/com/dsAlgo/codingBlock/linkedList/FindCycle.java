package com.dsAlgo.codingBlock.linkedList;

public class FindCycle {
    public static void main(String[] args) {
        LL list= new LL();
        // System.out.println(hasCycle(list));
    }

    /* public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)return true;
        }
        return false;
    }
    */
}
