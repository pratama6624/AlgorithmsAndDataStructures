package DataStructure.LinkedList;

/*
    Circular Doubly Linked List is a Combinational of  Doubly Linked List & Circular Linked List.
    Like a Doubly Linked List, this Linked List has an additional pointer
    Pointer called the previous pointer, and similar to a Circular Linked List,
    the last Node points to the Head Node
*/
class CircularDoublyLinkedList<Value> {
    class Node {
        Value value;
        Node next;
        Node prev;
        Node(Value value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Add data : From the front
    public void addFirst(Value value) {
        if(isEmpty()) {
            head = new Node(value);
            tail = head;
            tail.next = head;
            head.prev = tail;
            size++;
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        tail.next = head;
        head.prev = tail;
        size++;
    }

    // Add data : From behind
    public void addLast(Value value) {
        if(isEmpty()) {
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        head.prev = tail;
        tail.next = head;
        size++;
    }

    // Add data : In any part
    public void add(int pos, Value value) {
        if(isEmpty() || pos == 1) {
            addFirst(value);
        } else if(pos > 1 && (pos - size == 1)) {
            addLast(value);
        } else if(pos > (size + 1) || pos < 1) {
            // if the position of adding data exceeds the amount of data
            System.out.println("Size is only " + size + ", and start from 1");
        } else {
            Node current = head;
            int count = 1;
            while(count < (pos - 1)) {
                count++;
                current = current.next;
            }
            Node newNode = new Node(value);
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
            size++;
        }
    }

    // Get & Delete : From the front
    public Value deleteFirst() {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        }
        Node current = head;
        // if there is only one data left
        if(size > 1) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        } else {
            head = null;
        }
        size--;
        return current.value;
    }

    // Get & Delete : From behind
    public Value deleteLast() {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        }
        Node current = tail;
        // if there is only one data left
        if(size > 1) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        } else {
            tail = null;
        }
        size--;
        return current.value;
    }

    // Get & Delete : In any part
    public Value delete(int pos) {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        } else if(pos < 1 || pos > size) {
            // if the position of adding data exceeds the amount of data
            throw new RuntimeException("Size is only " + size + ", and start from 1");
        } else if(pos == 1) {
            return deleteFirst();
        } else if(pos > 1 && pos == size) {
            return deleteLast();
        } else {
            Node current = head;
            int count = 1;
            while(count < pos) {
                count++;
                current = current.next;
            }
            current.prev.next = current.next;
            current.next = current.prev;
            size--;
            return current.value;
        }
    }

    // Get without Delete data : Leading data
    public Value peekFirst() {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        }
        return head.value;
    }

    // Get without Delete data : Last data
    public Value peekLast() {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        }
        return tail.value;
    }

    // Check is empty
    private boolean isEmpty() {
        return head == null;
    }

    // Searching
    public int contains(Value value) {
        Node current = head;
        int count = 1;
        while(count < (size + 1)) {
            if(value == current.value) {
                return count;
            }
            current = current.next;
            count++;
        }
        return -1;
    }

    // Display : From the front 
    public void displayFirst() {
        display(head, "in", "out");
    }

    // Display : From behind
    public void displayLast() {
        display(tail, "out", "in");
    }

    // Private Display
    private void display(Node node, String from, String to) {
        if(isEmpty()) {
            System.out.println("Linked List is empty");
            return;
        }
        Node pointer = node;
        int count = 1;
        String as;
        System.out.print(from + " <=> ");
        while(count < (size + 1)) {
            if(pointer == head && pointer == tail) {
                as = " [head and tail] <=> ";
            } else if(pointer == head) {
                as = " [head] <=> ";
            } else if(pointer == tail) {
                as = " [tail] <=> ";
            } else {
                as = " <=> ";
            }
            System.out.print(pointer.value + as);
            if(node == head) {
                pointer = pointer.next;
            } else {
                pointer = pointer.prev;
            }
            count++;
        }
        System.out.print(to + "\n");
    }

    // Get Size
    public int size() {
        return size;
    }

    // Display : Show all details
    public void showDetail() {
        if(isEmpty()) {
            return;
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Data Size\t: " + size);
        System.out.println("Head Value\t: " + head.value);
        System.out.println("Head Address\t: @Node-" + System.identityHashCode(head));
        System.out.println("Head Prev Val\t: " + head.prev.value);
        System.out.println("Head Prev Adrs\t: @Node-" + System.identityHashCode(head.prev));
        System.out.println("Tail Value\t: " + tail.value);
        System.out.println("Tail Address\t: @Node-" + System.identityHashCode(tail));
        System.out.println("Tail Next Val\t: " + tail.next.value);
        System.out.println("Tail Next Adrs\t: @Node-" + System.identityHashCode(tail.next));
        System.out.println("------------------------------------------------------\n\n");
    }
}

public class CircularDoublyLinkedListApp {
    public static void main(String[] args) {
        CircularDoublyLinkedList<String> list = new CircularDoublyLinkedList<>();
        list.displayFirst();
        System.out.println();

        list.addFirst("m");
        System.out.print("Add First m\t: ");
        list.displayFirst();
        list.showDetail();

        list.addFirst("a");
        System.out.print("Add First a\t: ");
        list.displayFirst();
        list.showDetail();

        list.addFirst("t");
        System.out.print("Add First t\t: ");
        list.displayFirst();
        list.showDetail();

        list.addLast("a");
        System.out.print("Add Last a\t: ");
        list.displayFirst();
        list.showDetail();

        list.addFirst("r");
        System.out.print("Add First r\t: ");
        list.displayFirst();
        list.showDetail();

        list.deleteFirst();
        System.out.print("Delete First\t: ");
        list.displayFirst();
        list.showDetail();

        list.deleteLast();
        System.out.print("Delete Last\t: ");
        list.displayFirst();
        list.showDetail();

        list.addFirst("r");
        System.out.print("Add First r\t: ");
        list.displayFirst();
        list.showDetail();

        list.addFirst("P");
        System.out.print("Add First P\t: ");
        list.displayFirst();
        list.showDetail();

        list.add(3, "a");
        System.out.print("Add a pos 3\t: ");
        list.displayFirst();
        list.showDetail();

        list.add(7, "a");
        System.out.print("Add a pos 7\t: ");
        list.displayFirst();
        list.showDetail();

        System.out.println("Peek first val\t: " + list.peekFirst());
        System.out.println("Peek last val\t: " + list.peekLast());
        System.out.println("Find value X\t: " + list.contains("X"));
        System.out.println("Find value P\t: " + list.contains("P"));
        System.out.println("Find value t\t : " + list.contains("t"));
        System.out.println();

        list.delete(5);
        System.out.print("Delete a pos 5\t: ");
        list.displayFirst();
        list.showDetail();

        list.delete(2);
        System.out.print("Delete a pos 2\t: ");
        list.displayFirst();
        list.showDetail();
    }
}
