package Linked_List;

import java.util.Scanner;

public class LinkedList {
    private class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item){
        Node nn=new Node();
        nn.val=item;
        if(this.size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }

    public void addLast(int item){
        Node nn=new Node();
        nn.val=item;
        if(this.size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    public void addAtIndex(int item,int k) throws Exception{
        if(k<0||k>size){
            throw new Exception("k out of index");
        }
        if(k==0) addFirst(item);
        else if(k==size) addLast(item);
        else{
            Node k_1th=getNode(k-1);
            Node nn=new Node();
            nn.val=item;
            nn.next=k_1th.next;
            k_1th.next=nn;
            size++;
        }
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    private Node getNode(int k) throws Exception {
        if(k<0||k>size){
            throw new Exception("k out of index");
        }
        Node temp=head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp;
    }

    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }

    public int getAtIndex(int k) throws Exception {
        return getNode(k).val;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        LinkedList ll =new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.display();
        ll.addLast(40);
        ll.addLast(50);
        ll.display();
        ll.addAtIndex(0,3);
        ll.display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAtIndex(4));
    }
}
