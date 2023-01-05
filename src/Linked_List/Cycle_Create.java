package Linked_List;

public class Cycle_Create {

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
    public void createCycle() throws Exception{
        tail.next=getNode(2);
    }
    public Node MeetingPoint(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return slow;
        }
        return null;
    }

    public void CycleRemoval1(){
        Node meet=MeetingPoint();
        if(meet==null) return;
        Node temp=meet;
        int c=1;
        while(temp.next!=meet){
            c++;
            temp=temp.next;
        }
        Node fast=head;
        for(int i=1;i<=c;i++) fast=fast.next;
        Node slow=head;
        while(slow.next!=fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next=null;
    }
    public void CycleRemoval2() {
        Node meet = MeetingPoint();
        if (meet == null) return;
        Node fast = meet;
        Node slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
}
