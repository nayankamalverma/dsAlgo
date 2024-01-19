package com.dsAlgo.codingBlock.linkedList;


public class Basic {
    public static void main(String[] args) {
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.insert(5, list.headPos());
        list.display();
    }
}
