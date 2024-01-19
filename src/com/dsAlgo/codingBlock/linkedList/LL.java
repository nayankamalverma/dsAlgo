package com.dsAlgo.codingBlock.linkedList;

public class LL {
    
    private Node head;
    private Node tail;

    public void addAtFirst(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }else{
            node.next=head;
            head=node;
        }
    }
    public void add(int val){
        Node node = new Node(val);

        if(head==null){
            head=node;
            tail=node;    
        }else{
            tail.next=node;
            tail=node;
        }
    }
    
    public String delete(){
        if(head==null)return "List is empty;";
        Node node = head;
        int x=node.value;
        head =node.next;
        return ""+x;
    }

    public String delete(int pos){
        int cnt=0;
        if(head==null)return "List is empty;";
        Node node=head;
        if(pos==-1){
            Node temp=node.next;
            while(node.next!=null){
                node=node.next;
            }
            temp.next=null;
            return ""+node.value;
        }

        while( node==null || cnt<pos ){
            node=node.next;
            if(cnt==pos-2){
                Node temp = node;
                node=node.next;
                temp.next=node.next;
                return ""+node.value;
            }
            cnt++;
        }
        return "-1";
    }

    public void insert(int val,Node head){
        if(head.next==null){
            Node node=new Node(val);
            head.next=node;
            return;
        }
        insert(val, head.next);
    }

    public void add(int pos,int val){
        Node node= new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }else{
            int cnt=1;
            Node temp = head;
            while(cnt<=pos){
                if(temp.next==null){
                    temp.next=node;
                }else if(cnt==pos-1){
                    Node i=temp.next;
                    temp.next=node;
                    node.next=i;
                }
                cnt++;
            }
        }
    }

    public Node headPos(){
        return head;
    } 

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public void displayRec(Node temp){
        if(temp==null){
            System.out.print("End<-");
            return;
        }
        displayRec(temp.next);
        System.out.print(temp.value+"<-");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value= value;
        }

        public Node(int value,Node next){
            this.value= value;
            this.next= next;
        }
    }
}