package DataStructure;

// Stack is a data with LIFO method (Last In First Out)
// With Node and JAVA Generic
class StackDataStructure<Value> {
    class Node {
        Value value;
        Node next;

        Node(Value value) {
            this.value = value;
        }
    }
    private Node top;
    private Node bottom;
    private int maxSize;
    private int size;
    
    StackDataStructure(int maxSize) {
        this.maxSize = maxSize;
    }

    StackDataStructure() {
        this.maxSize = 10;
    }

    // Add data : From top
    public void push(Value value) {
        if(isEmpty()) {
            top = new Node(value);
            bottom = top;
            size++;
            return;
        }
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Get & Delete data : From top
    public Value pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        Node current = top;
        top = top.next;
        size--;
        return current.value;
    }

    // Check is Full
    private boolean isFull() {
        return size == maxSize;
    }

    // Check is Empty
    private boolean isEmpty() {
        return top == null;
    }

    // Get without Delete data : Top data
    public Value peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.value;
    }

    // Get size
    public int size() {
        return size;
    }

    // Display : Show details
    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("top => ");
        Node pointer = top;
        while(pointer != null) {
            System.out.print(pointer.value + " => ");
            pointer = pointer.next;
        }
        System.out.print("bottom\n");
    }
}

public class Stack {
    public static void main(String[] args) {
        StackDataStructure<String> stack = new StackDataStructure<String>(10);

        stack.push("H");
        System.out.print("Adding \"H\"\t: ");
        stack.display();

        stack.push("U");
        System.out.print("Adding \"U\"\t: ");
        stack.display();

        stack.push("K");
        System.out.print("Adding \"K\"\t: ");
        stack.display();

        stack.push("U");
        System.out.print("Adding \"U\"\t: ");
        stack.display();

        stack.push("K");
        System.out.print("Adding \"K\"\t: ");
        stack.display();

        stack.pop();
        System.out.print("Remove value\t: ");
        stack.display();

        stack.pop();
        System.out.print("Remove value\t: ");
        stack.display();

        stack.pop();
        System.out.print("Remove value\t: ");
        stack.display();

        stack.pop();
        System.out.print("Remove value\t: ");
        stack.display();

        stack.push("X");
        System.out.print("Adding \"X\"\t: ");
        stack.display();

        stack.push("Y");
        System.out.print("Adding \"Y\"\t: ");
        stack.display();

        stack.pop();
        System.out.print("Remove value\t: ");
        stack.display();
    }
}
