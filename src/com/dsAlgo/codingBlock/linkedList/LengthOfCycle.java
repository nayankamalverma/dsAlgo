package com.dsAlgo.codingBlock.linkedList;

public class LengthOfCycle {
    public static void main(String[] args) {
        
    }

    /*
    public int hasCycle(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                int cnt=0;
                ListNode temp=slow;
                do{
                    temp=temp.next;
                    cnt++;
                }while(temp!=slow)
                return cnt;
            }
        }
        return 0;
    }
     */
}
