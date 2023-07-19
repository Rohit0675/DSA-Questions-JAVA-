package BinaryTree;

public class heightTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int Count(Node root) {
        if (root == null) {
            return 0;
        }
        int lcount = Count(root.left);
        int rcount = Count(root.right);

        return (lcount + rcount) + 1;
    }

    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int lsum = Sum(root.left);
        int rsum = Sum(root.right);

        int totalSum = lsum + rsum + root.data;
        return totalSum;
    }

    public static int Diameter2(Node root) {// O(N^2)
        if (root == null) {
            return 0;
        }
        int ld = Diameter2(root.left);
        int rd = Diameter2(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDiam = lh + rh + 1;

        return Math.max(selfDiam, Math.max(ld, rd));
    }

    //// optimized diameter code
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }

    }

    public static Info Diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(10);
        System.out.println("Height of tree: " + height(root));
        System.out.println("Total Count of Nodes: " + Count(root));
        System.out.println("Sum of the data of node: " + Sum(root));
        System.out.println("Maximum diameter of tree: " + Diameter2(root));
        System.out.println("Maximum diameter of tree: " + Diameter(root).diam);
    }

}
