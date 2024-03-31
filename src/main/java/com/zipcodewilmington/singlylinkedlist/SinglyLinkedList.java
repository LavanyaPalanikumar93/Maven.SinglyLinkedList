    package com.zipcodewilmington.singlylinkedlist;
    /**
         * Created by leon on 1/10/18.
         */
        public class SinglyLinkedList {
        private Node head;
        private int size;
        private int data;
        private class Node {
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public SinglyLinkedList(){
            head=null;
            size=0;
        }
        public void add(int data){
            Node node=new Node(data);
            node.data=data;
            if(node==null){
                node=head;
            }else{
                Node n=head;
               while(n.next!=null){
                    n=n.next;
                }
               n.next=node;
            }

        public void remove(int index){
            for(int i=0;i<index-1;i++){

            }

        }





    }}





