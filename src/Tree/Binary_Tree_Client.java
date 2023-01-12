package Tree;

public class Binary_Tree_Client {
    public static void main(String[] args) {
        Binary_Tree bt=new Binary_Tree();
        bt.display();
//        bt.PreOrder();
//        bt.PostOrder();
//        bt.InOrder();
//        System.out.println(bt.search(140));
        System.out.println(bt.Max());
        System.out.println(bt.Height());
    }
}
