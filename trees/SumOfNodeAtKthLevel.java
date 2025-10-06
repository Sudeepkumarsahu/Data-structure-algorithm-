import java.util.*;

public class SumOfNodeAtKthLevel {
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

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int sumAtKthLevel(Node root, int k) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        int sum = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (level == k) {
                for (int i = 0; i < size; i++) {
                    sum += queue.poll().data;
                }
                return sum;
            }
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        int k = 1;
        System.out.println("Sum of nodes at level " + k + ": " + sumAtKthLevel(root, k));
    }
}
