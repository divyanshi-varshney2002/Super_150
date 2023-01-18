package Tree;

import java.util.*;

public class LevelOrder_traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q=new LinkedList<>();
            Queue<TreeNode> q1=new LinkedList<>();
            List<List<Integer>> ans=new ArrayList<>();
            List<Integer> ll=new ArrayList<>();
            if(root==null) return ans;
            q.add(root);//add last
            while(!q.isEmpty()){
                TreeNode rv=q.remove();//remove first
                ll.add(rv.val);
                if(rv.left!=null) q1.add(rv.left);
                if(rv.right!=null) q1.add(rv.right);
                if(q.isEmpty()){
                    ans.add(ll);
                    ll=new ArrayList<>();
                    q=q1;
                    q1=new LinkedList<>();
                }
            }
            return ans;
        }
    }
}
