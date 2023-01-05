package Linked_List;

public class Cycle_Client {
    public static void main(String[] args) throws Exception{
        Cycle_Create cc=new Cycle_Create();
        cc.addLast(1);
        cc.addLast(2);
        cc.addLast(3);
        cc.addLast(4);
        cc.addLast(5);
        cc.addLast(6);
        cc.addLast(7);
        cc.addLast(8);
        cc.display();
        cc.createCycle();
//        cc.display();
        cc.CycleRemoval2();
        cc.display();
    }
}
