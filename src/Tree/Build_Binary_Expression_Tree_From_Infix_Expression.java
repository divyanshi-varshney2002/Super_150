package Tree;

/*
A binary expression tree is a kind of binary tree used to represent arithmetic expressions.
Each node of a binary expression tree has either zero or two children.
Leaf nodes (nodes with 0 children) correspond to operands (numbers), and internal nodes (nodes with 2 children) correspond to the operators '+' (addition), '-' (subtraction), '*' (multiplication), and '/' (division).
For each internal node with operator o, the infix expression that it represents is (A o B), where A is the expression the left subtree represents and B is the expression the right subtree represents.
You are given a string s, an infix expression containing operands, the operators described above, and parentheses '(' and ')'.
Return the binary expression tree, which its in-order traversal reproduce s.
Please note that order of operations applies in s.
That is, expressions in parentheses are evaluated first, and multiplication and division happen before addition and subtraction.
*/
public class Build_Binary_Expression_Tree_From_Infix_Expression {

    public class Node {
        int val;
        Node left;
        Node right;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val,Node left,Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution{
//        public Node expTree(String s){
//            if(s.length()==0) return null;
//
//        }
    }

}
