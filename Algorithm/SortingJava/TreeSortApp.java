package SortingJava;

import java.util.Arrays;

class TreeSort {
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;
    private int[] dataSorted;
    private int counter = 0;

    public int[] toSort(int[] data) {
        this.dataSorted = Arrays.copyOf(data, data.length);
        this.addNode(data[0]);
        // Adding loop
        for(var i = 1; i < data.length; i++) {
            this.addNode(data[i]);
        }
        // Sorting
        System.out.println("\n");
        this.inOrder(root);
        return this.dataSorted;
    }

    // LEFT, ROOT, RIGHT
    private void inOrder(Node node) {
        if(node == null) return;
        inOrder(node.left);

        System.out.print(node.value + ", ");
        this.dataSorted[counter++] = node.value;
        
        inOrder(node.right);
    }

    private void addNode(int value) {
        Node newNode = new Node(value);
        if(root == null) {
            System.out.println("Add " + value + "\ton root");
            root = newNode;
            return;
        }
        System.out.print("Add " + newNode.value + "\ton ");
        this.insertNode(root, newNode);
    }

    private void insertNode(Node root, Node newNode) {
        if(newNode.value < root.value) {
            if(root.left == null) {
                System.out.println("left");
                root.left = newNode;
            } else {
                System.out.print("left -> ");
                insertNode(root.left, newNode);
            }
        } else {
            if(root.right == null) {
                System.out.println("right");
                root.right = newNode;
            } else {
                System.out.print("right -> ");
                insertNode(root.right, newNode);
            }
        }
    }
}

public class TreeSortApp {
    public static void main(String[] args) {
        // int[] data = {5, 7, 1, 9, 7, 3, 2, -10, 0, 20, 4, 6, 11, 41};
        int[] data = {25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 24, 31};
        System.out.println(Arrays.toString(data) + "\n");

        TreeSort tree = new TreeSort();
        int[] dataSorted = tree.toSort(data);
        System.out.println("\n\n" + Arrays.toString(dataSorted));
    }
}