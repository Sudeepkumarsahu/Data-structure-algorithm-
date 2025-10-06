//assume there is no duplicate node

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

    public static Node insert(Node root, int value) { // O(height) or O(H)
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            // left subtree
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;

        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) { // O(H)
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else { // root.data == val
                 // case 1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3
            Node IS = inorderSuccessorr(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node  inorderSuccessorr(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root,int X,int Y){
        if (root == null) {
            return;
        }
        if(root.data >= X && root.data <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);

        }
        else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }else{
            printInRange(root.right, X, Y);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left == null && root.right == null){ //leaf
            printPath(path);
        }else{//non - leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path); 
        }

        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        if (search(root, 6)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        delete(root, 5);
        inOrder(root);
        System.out.println();

        printInRange(root, 3, 7);
        System.out.println();
        printRoot2Leaf(root, new ArrayList<>());
    }
}
