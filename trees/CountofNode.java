public class CountofNode {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {// this is return root node
            idx++;
            if (nodes[idx] == -1) { // -1 represent null node in tree
                return null;

            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int CountofNodes(Node root) {
        if (root == null) {
            return 0;

        }
        int leftNodes = CountofNodes(root.left);
        int rightNodes = CountofNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static int sumofNodes(Node root) {
        if (root == null) {
            return 0;

        }
        int leftsum = sumofNodes(root.left);
        int rightsum = sumofNodes(root.right);
        return leftsum + rightsum + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;

        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int myheight = Math.max(leftheight, rightheight) + 1;
        return myheight;
    }

    // diameter of a tree -> Number of Nodes in the Longest path between any 2 nodes
    // Approach 1 : O(n^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;

        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // Approach 2 : O(n)
    static class TreeInfo {
        int ht;
        int diam;
        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
          return new TreeInfo(0, 0);

        }
        
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myheight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int myDiam =  Math.max(diam3, Math.max(diam1, diam2));
        TreeInfo myInfo = new TreeInfo(myheight, myDiam);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };// preorder form
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(CountofNodes(root));
        System.out.println(sumofNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
}
