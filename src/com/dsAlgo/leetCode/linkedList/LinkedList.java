package com.dsAlgo.leetCode.linkedList;


public class LinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //141. => Linked List cycle
    public boolean hasCycle(ListNode head) {
        ListNode s=head,f=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s)return true;
        }
        return false;
    }

    public int cycleLength(ListNode head){
        ListNode temp=head;
        int length=0;
        do{
            temp=temp.next;
            length++;
        }while(temp!=head);
        return length;
    }
}
