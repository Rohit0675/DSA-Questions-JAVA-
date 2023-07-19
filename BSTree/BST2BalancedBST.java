package BSTree;

import java.util.ArrayList;

public class BST2BalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;
       

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void getinOrder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getinOrder(root.left, inorder);
        inorder.add(root.data);
        getinOrder(root.right, inorder);

    }

    public static void Preorder(Node root) {        
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static Node createBST(ArrayList<Integer> inorder, int start , int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, start, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;
    }
    public static Node balancedBST(Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getinOrder(root, inorder);
        //sorted inorder -> balanced BST
        root = createBST(inorder, 0, inorder.size()-1);

        return root;

    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = balancedBST(root);
        Preorder(root);
    }

    
}
