package Queue;

public class Queue {
    /*
    FIFO (First in first Out)
    LILO (Last In Last Out)
     */
    private int arr[];
    private int front;
    private int size;
    public Queue(){
        arr=new int [5];
        front=0;
        size=0;
    }
    public Queue(int n){
        arr=new int [n];
        front=0;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public void Enqueue(int item){
        isFull() ;
        arr[(front+size)%arr.length]=item;
        size++;
    }
    public int Dequeue(){
        int rv=arr[front];
        front++;
        size--;
        return rv;
    }
    public int GetFront() {
        int rv=arr[front];
        return rv;
    }
    public void displau(){
        for (int i = 0; i < size; i++) {
            int idx=(front+size);
        }
    }
}
