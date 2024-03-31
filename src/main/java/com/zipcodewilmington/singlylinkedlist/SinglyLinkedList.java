        package com.zipcodewilmington.singlylinkedlist;
        /**
             * Created by leon on 1/10/18.
             */
            public class SinglyLinkedList {
            private Node head;
            private int size;

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

            public void add(int data) {
                Node node = new Node(data);
                if (head == null) {
                    head=node;
                } else {
                    Node n = head;
                    while (n.next != null) {
                        n = n.next;
                    }
                    n.next = node;
                }size++;
            }
            public void remove(int index){
                    if(index==0){
                       head=head.next;
                    }else{
                    Node n=head;
                    Node n1;
                for(int i=0;i<index-1;i++) {
                    n = n.next;
                }n1=n.next;
                n.next=n1.next;

                }size--;

            }
            public boolean contains(int data){
                Node n=head;
                while(n!=null){
                    if(n.data==data){
                        return true;
                    }
                    n=n.next;
                }
                return false;
            }

            public int find(int data){
                Node n=head;
                int index=0;
                while(n!=null){
                    if(n.data==data){
                        return index;
                    }
                    n=n.next;
                    index++;
                }
                return -1;
            }
        public int size(){
                    return size;
        }

        public int get(int index){
                    Node n=head;
                    for(int i=0;i<index;i++){
                        n=n.next;
                    }
                    return n.data;
        }
        public SinglyLinkedList copy(){
                    SinglyLinkedList newNodeList=new SinglyLinkedList();
                    Node n=head;
                    while(n!=null){
                        newNodeList.add(n.data);
                        n=n.next;
                    }return newNodeList;
        }
        public void sort(){
                   Node n=head;
            Node index;
                   int temp;
                   if(head==null){
                       return;
                   }else{
                       while(n!=null){
                           index=n.next;
                           while(index!=null){
                               if(n.data>index.data){
                               temp=n.data;
                               n.data=index.data;
                               index.data=temp;
                           }index=index.next;
                       }n=n.next;
                   }
        }}
        }





