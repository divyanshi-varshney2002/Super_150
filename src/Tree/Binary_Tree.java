package Tree;
import java.awt.*;
import java.util.*;
public class Binary_Tree {
    private class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public Binary_Tree(){
        root=CreateTree();
    }
    Scanner sc=new Scanner(System.in);
    private Node CreateTree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();  //has left child
        if(hlc){
            nn.left=CreateTree();
        }
        boolean hrc=sc.nextBoolean();  //has right child
        if(hrc){
            nn.right=CreateTree();
        }
        return nn;
    }
//            10
//          /    \
//        5        7
//       /  \    /  \
//      .    11 9    .
//    10 true 5 false true 11 false false true 7 true 9 false false false
    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node==null){
            return;
        }
        String s="";
        s="<--"+s+node.val+"-->";
        if(node.left!=null) s=node.left.val+s;
        else s="."+s;
        if(node.right!=null) s=s+node.right.val;
        else s=s+".";
        System.out.println(s);
        display(node.left);
        display(node.right);
    }
    public void PreOrder(){
        PreOrder(root);
        System.out.println();
    }
    private void PreOrder(Node node){
        if(node==null) return;
        System.out.print(node.val+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public void PostOrder(){
        PostOrder(root);
        System.out.println();
    }
    private void PostOrder(Node node){
        if(node==null) return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.val+" ");
    }
    public void InOrder(){
        InOrder(root);
        System.out.println();
    }
    private void InOrder(Node node){
        if(node==null) return;
        InOrder(node.left);
        System.out.print(node.val+" ");
        InOrder(node.right);
    }
    public boolean search(int item){
        return search(root,item);
    }
    private boolean search(Node node,int item){
        if(node==null) return false;
        if(node.val==item) return true;
        boolean left=search(node.left,item);
        boolean right=search(node.right,item);
        return left || right;
    }
//    10 true 30 true -7 false false true 50 true 11 false true 12 true 13 false false false true 180 false false true 140 true 170 false false true 180 true 120 false false true 130 true 110 false true 12 false false false
//            30<--10-->140
//            -7<--30-->50
//            .<---7-->.
//            11<--50-->180
//            .<--11-->12
//            13<--12-->.
//            .<--13-->.
//            .<--180-->.
//            170<--140-->180
//            .<--170-->.
//            120<--180-->130
//            .<--120-->.
//            110<--130-->.
//            .<--110-->12
//            .<--12-->.
    public int Max(){
        return Max(root);
    }
    private int Max(Node node){
        if(node==null) return Integer.MIN_VALUE ;
        int left=Max(node.left);
        int right=Max(node.right);
        return Math.max(node.val,Math.max(left,right));
    }

    public int Min(){
        return Min(root);
    }
    private int Min(Node node){
        if(node==null) return Integer.MAX_VALUE ;
        int left=Min(node.left);
        int right=Min(node.right);
        return Math.min(node.val,Math.min(left,right));
    }

    public int Height(){
        return Height(root);
    }
    private int Height(Node node){
        if(node==null) return -1;
        int left=Height(node.left);
        int right=Height(node.right);
        return Math.max(left,right)+1;
    }
}
