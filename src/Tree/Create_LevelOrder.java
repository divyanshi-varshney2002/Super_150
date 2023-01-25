package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_LevelOrder {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public Create_LevelOrder(){
        this.root=CreateTree();
    }
    private Node CreateTree(){
        Queue<Node> q=new LinkedList<>();
        Node nn=new Node();
        int val=sc.nextInt();//10
        nn.val=val;
        root=nn;
        q.add(nn);
        while(!q.isEmpty()){
            Node rv=q.remove();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
                Node node=new Node();
                node.val=c1;
                rv.left=node;
                q.add(node);
            }
            if(c2!=-1){
                Node node=new Node();
                node.val=c2;
                rv.right=node;
                q.add(node);
            }
        }
        return root;
    }
    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node==null) return;
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
    public static void main(String[] args) {
        Create_LevelOrder cl=new Create_LevelOrder();
        cl.PreOrder();
        cl.display();
    }
}
