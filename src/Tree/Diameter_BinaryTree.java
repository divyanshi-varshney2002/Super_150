package Tree;

public class Diameter_BinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public class Diapair {
        int ht = -1;
        int d = 0;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).d;
    }
    public Diapair diameter(TreeNode root){
        if(root==null)  return new Diapair();
        Diapair ldp=diameter(root.left);//left DiaPair
        Diapair rdp=diameter(root.right);//right DiaPair
        Diapair sdp=new Diapair();
        int sd=ldp.ht+rdp.ht+2;
        sdp.d=Math.max(ldp.d,Math.max(rdp.d,sd));
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        return sdp;
    }
}
