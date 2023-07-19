package BSTree;

import java.util.ArrayList;


public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    //inorder 
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    // Build subtree
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);

        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Search in BST
    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key > root.data) {
            return Search(root.right, key);
        }
        if (key < root.data) {
            return Search(root.left, key);
        }
        return false;
    }

    // Find Inorder Succesor
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete a Node
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 = leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 = single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 = double child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    // Print in Range
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }
    //print path
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    //Root to Leaf Path
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    //Validate BST
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
            
        
    }
    // Mirror a BST
    public static Node Mirror(Node root){
        if(root == null){
            return null;
        }
        Node LeftSubTree = Mirror(root.left);
        Node RightSubTree = Mirror(root.right);

        root.left = RightSubTree;
        root.right = LeftSubTree;
        return root;
    }
    //Preorder
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        //inOrder(root);
        // System.out.println(Search(root, 15));
        // inOrder(root);
        Preorder(root);
        System.out.println();
        // delete(root, 5);
        // inOrder(root);
        // printInRange(root, 1, 3);
       // printRoot2Leaf(root, new ArrayList<>());
       //System.out.println(isValidBST(root, null, null));
       Mirror(root);
       Preorder(root);
    }
}
