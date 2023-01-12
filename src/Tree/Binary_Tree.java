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
        boolean hrc=sc.nextBoolean();  //has right child
        if(hlc){
            nn.left=CreateTree();
        }
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
}
