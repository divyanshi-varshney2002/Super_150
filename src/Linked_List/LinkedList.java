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

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList ll =new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.display();
    }
}
