package com.dsAlgo.codingBlock.linkedList;

public class DoublyLL {
    private Node head;
    private Node last;

    public void add(int val){
        Node node = new Node(val);
        last=node;
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;

    }

    public void add(int pos,int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            last=node;
            return;
        }
        int cnt=0;
        Node temp=head;
        while(temp.next!=null && pos!=cnt){
            temp=temp.next;
            cnt++;
        }
        if(temp.next==null){
            last=node;
            temp.next=node;
            node.prev=temp;
            return;
        }
        node.prev=temp.prev;
        temp.prev=node;
        node.next=temp;
        temp.prev.prev.next=node;        
    }

    public String delete(){
        if(head==null) return "List is empty;";
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        String x= ""+temp.next.val;
        temp.next=null;
        last=temp;
        return x;
    }

    public String delete(int pos){
        if(head==null){
            return "list is empty!";
        }
        int cnt=0;
        Node temp=head;
        while(temp.next.next!=null && pos!=cnt){
            temp=temp.next;
            cnt++;
        }
        if(temp.next.next==null){
            last=temp;
            String x= ""+temp.next.val;
            temp.next=null;
            return x;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        String x= ""+temp.val;
        return x;

    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");          
            temp=temp.next;
        }
        System.out.print("END!");
    }

    public void displayRev(){
        Node temp=last;
        while(temp!=null){
            System.out.print(temp.val+"->");          
            temp=temp.prev;
        }
        System.out.print("END!");
    }
    

    private class Node{

        int val;
        Node next;
        Node prev;

        public Node(){
        }
        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getLast() {
        return last;
    }

  
}