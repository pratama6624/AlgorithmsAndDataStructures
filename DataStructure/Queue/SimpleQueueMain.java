package DataStructure.Queue;

// Simple Queue is a queue that only one way, enter from the back and exit from the front
// The concept is to use a LinkedList
// With generic parameter
class SimpleQueue<T> {
    class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    // enqueue : operator to add data
    public void enqueue(T value) {
        if(isEmpty()) {
            rear = new Node(value);
            front = rear;
            size++;
            return;
        }
        Node current = new Node(value);
        current.next = rear;
        rear = current;
        size++;
    }

    // dequeue : operator to get and delete data
    public T dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        Node node = rear;
        Node previous = null;
        while(node.next != null) {
            previous = node;
            node = node.next;
        }
        /*
        * If the data reamins 1 maka variable previous
            will be null and will cause a NullPointerExceptionError
        * Then we have to delete the last data [head = null]
        */
        if(previous != null) {
            previous.next = null;
            front = previous;
        } else {
            rear = null;
        }
        size--;
        return node.value;
    }

    // peek : 
    public T peekFront() {
        if(rear == null) {
            throw new RuntimeException("Queue is empty");
        }
        return front.value;
    }

    // peek : 
    public T peekRear() {
        if(rear == null) {
            throw new RuntimeException("Queue is empty");
        }
        return rear.value;
    }

    // Empty or not
    private boolean isEmpty() {
        return rear == null;
    }

    // Displaying => flow
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node pointer = rear;
        System.out.print("in -> ");
        String as;
        while(pointer != null) {
            if(pointer == rear) {
                as = " [rear] -> ";
            } else if(pointer == front) {
                as = " [front] -> ";
            } else {
                as = " -> ";
            }
            System.out.print(pointer.value + as);
            pointer = pointer.next;
        }
        System.out.println("out");
    }

    // get size
    public int size() {
        return this.size;
    }
}

public class SimpleQueueMain {
    public static void main(String[] args) {
        SimpleQueue<String> queue = new SimpleQueue<>();

        queue.enqueue("P1");
        System.out.print("Enqueue\t:\t");
        queue.display();

        queue.enqueue("P2");
        System.out.print("Enqueue\t:\t");
        queue.display();

        queue.enqueue("P3");
        System.out.print("Enqueue\t:\t");
        queue.display();

        queue.enqueue("P4");
        System.out.print("Enqueue\t:\t");
        queue.display();

        System.out.println("Dequeue\t:\t" + queue.dequeue() + " is out");
        System.out.println("Dequeue\t:\t" + queue.dequeue() + " is out");
        System.out.println("Dequeue\t:\t" + queue.dequeue() + " is out");
        System.out.println("Dequeue\t:\t" + queue.dequeue() + " is out");
        
        queue.enqueue("P5");
        System.out.print("Enqueue\t:\t");
        queue.display();

        queue.enqueue("P6");
        System.out.print("Enqueue\t:\t");
        queue.display();

        queue.enqueue("P7");
        System.out.print("Enqueue\t:\t");
        queue.display();
    }
}
