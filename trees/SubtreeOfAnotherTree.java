public class SubtreeOfAnotherTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node() {
        }

        Node(int data) {
            this.data = data;

        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public boolean isIdentical(Node root, Node subRoot) {
            if (root == null && subRoot == null) {
                return true;
            }
            if (root == null || subRoot == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
            return false;
        }

        public boolean isSubtree(Node root, Node subRoot) {
            if (subRoot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(3,
                new Node(4, new Node(1), new Node(2)),
                new Node(5));

        Node subRoot = new Node(3, new Node(4), new Node(5));

        Solution solution = new Solution();
        System.out.println(solution.isSubtree(root, subRoot)); // Output: true
    }
}
