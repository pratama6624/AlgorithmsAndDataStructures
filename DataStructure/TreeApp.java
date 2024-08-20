package DataStructure;

class Tree {
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    private boolean isEmpty() {
        return root == null;
    }

    public Node root() {
        return this.root;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            System.out.println("add " + newNode.value + "\t: on root");
            root = newNode;
            return;
        }
        insertNode(root, newNode);
    }

    private void insertNode(Node root, Node newNode) {
        if(newNode.value < root.value) {
            if(root.left == null) {
                System.out.println("add " + newNode.value + "\t: on left");
                root.left = newNode;
            } else {
                insertNode(root.left, newNode);
            }
        } else {
            if(root.right == null) {
                System.out.println("add " + newNode.value + "\t: on right");
                root.right = newNode;
            } else {
                insertNode(root.right, newNode);
            }
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Empty Tree");
            return;
        } else if(root != null) {
            System.out.println("root\t: " + root.value);
        }
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node == null) return;
        // Left child
        inOrder(node.left);
        System.out.println("left\t: " + node.value);
        inOrder(node.right);
    }
}

public class TreeApp {
    public static void main(String[] args) {
        Tree data = new Tree();
        data.add(10);
        data.add(9);
        data.add(11);
        data.add(27);
        data.add(20);
        data.add(5);
        data.add(41);
        data.add(13);
        data.add(2);
        data.add(1);
        data.add(8);
        data.add(6);
        data.add(3);
        data.add(4);
        data.add(42);
        data.add(7);

        System.out.println("");

        data.display();

        System.out.println("\n");

        System.out.println(data.root().value + "\t: on root");
        System.out.println(data.root().left.value + "\t: on root -> left");
        System.out.println(data.root().left.left.value + "\t: on root -> left -> left");
        System.out.println(data.root().left.left.left.value + "\t: on root -> left -> left -> left");
        System.out.println(data.root().left.left.left.left.value + "\t: on root -> left -> left -> left -> left");
        System.out.println(data.root().left.left.left.right.value + "\t: on root -> left -> left -> left -> right");
        System.out.println(data.root().left.left.left.right.right.value + "\t: on root -> left -> left -> left -> right -> right");
        System.out.println(data.root().left.left.right.left.right.value + "\t: on root -> left -> left -> right -> left -> right");
    }
}
