package FreeLearn.Sorting;

import java.util.Arrays;

class Tree {
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    
    private Node root;
    private int[] sorted;
    private int counter = 0;

    public int[] sort(int[] data) {
        // Make copy of data numbers
        sorted = new int[data.length];
        // Make tree structure
        System.out.println();
        for(var value : data) {
            addNode(value);
        }
        System.out.println();
        // Call inOrder function
        inOrder(root);
        // Return data sorted
        return sorted;
    }

    private void addNode(int value) {
        Node newNode = new Node(value);
        if(root == null) {
            System.out.println("Adding " + value + " on root");
            root = newNode;
            return;
        }
        insertNode(root, newNode);
    }

    private void insertNode(Node root, Node newNode) {
        if(newNode.value < root.value) {
            if(root.left == null) {
                System.out.println("Adding " + newNode.value + " on left");
                root.left = newNode;
            } else {
                insertNode(root.left, newNode);
            }
        } else {
            if(root.right == null) {
                System.out.println("Adding " + newNode.value + " on right");
                root.right = newNode;
            } else {
                insertNode(root.right, newNode);
            }
        }
    }

    // LEFT -> ROOT -> RIGHT
    private void inOrder(Node node) {
        if(node == null) return;
        inOrder(node.left);
        this.sorted[counter++] = node.value;
        inOrder(node.right);
    }
}

public class TreeSort {
    public static void main(String[] args) {
        int[] numbers = {25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 24, 31, 44, 66, 90};
        System.out.println("Before Sort : " + Arrays.toString(numbers));
        Tree tree = new Tree();
        int[] sorted = tree.sort(numbers);
        System.out.println("After Sort : " + Arrays.toString(sorted));
    }
}
