package DataStructure.LinkedList;

/*
 * A double Linked List consists of individual elements,
    each of which is linked list by two pointer.
    Each element consists o three parts,
    namely a data and a pointer containing the next data address
    called next and a pointer containing the previous data address called before
 */
class DoublyLinkedList<Value> {
    class Node {
        Value value;
        Node prev;
        Node next;

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
            size++;
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
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
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;        
        }
    }

    // Get & Delete data : From the front
    public Value deleteFirst() {
        if(isEmpty()) {
            throw new RuntimeException("Linked list is empty");
        }
        Node current = head;
        // if there is only one data left
        if(size > 1) {
            head = head.next;
            head.prev = null;
        } else {
            head = null;
        }
        size--;
        return current.value;
    }

    // Get & Delete data : From behind
    public Value deleteLast() {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        }
        Node current = tail;
        // if there is only one data left
        if(size > 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            tail = null;
        }
        size--;
        return current.value;
    }

    // Get & Delete data : In any part
    public Value delete(int pos) {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        } else if(pos > size || pos < 1) {
            // if the position of adding data exceeds the amount of data
            throw new RuntimeException("Size is only " + size + ", and start from 1");
        } else if((pos == 1)) {
            return deleteFirst();
        } else if(this.size > 1 && pos == size) {
            return deleteLast();
        } else {
            Node current = head;
            int count = 1;
            while(count < pos) {
                count++;
                current = current.next;
            }
            // if there is only one data left
            current.next.prev = current.prev;
            current.prev.next = current.next;
            size--;
            return current.value;
        }
    }

    // Get without Delete data : Leading data
    public Value peekFirst() {
        if(isEmpty()) {
            throw new RuntimeException("Linked list is empty");
        }
        return head.value;
    }

    // Get without Delete data : Last data
    public Value peekLast() {
        if(isEmpty()) {
            throw new RuntimeException("Linked list is empty");
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
            if(current.value == value) {
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

    // Private display
    private void display(Node flow, String from, String to) {
        if(isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        Node pointer = flow;
        System.out.print(from + " <=> ");
        String as;
        while(pointer != null) {
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
            if(flow == head) {
                pointer = pointer.next;
            } else {
                pointer = pointer.prev;
            }
        }
        System.out.print(to + "\n");
        System.out.println("------------------------------------------------------");
    }

    // Get size
    public int size() {
        return size;
    }

    // Display : Show all details
    public void showDetail() {
        if(isEmpty()) {
            return;
        }
        System.out.println("Data Size\t: " + size);
        System.out.println("Head Value\t: " + head.value);
        System.out.println("Head Address\t: @Node-" + System.identityHashCode(head));
        System.out.println("Head Prev Adrs\t: " + head.prev); // NULL
        System.out.println("Tail Value\t: " + tail.value);
        System.out.println("Tail Address\t: @Node-" + System.identityHashCode(tail));
        System.out.println("Tail Next Adrs\t: " + tail.next); // NULL
        System.out.println("------------------------------------------------------\n\n");
    }
}

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> member = new DoublyLinkedList<>();
        
        member.displayFirst(); // Empty Linked List
        System.out.println();

        member.addFirst(10);
        System.out.print("Add 10 at First\t: ");
        member.displayFirst();

        member.addFirst(9);
        System.out.print("Add 9 at First\t: ");
        member.displayFirst();

        member.addFirst(8);
        System.out.print("Add 8 at First\t: ");
        member.displayFirst();

        member.addLast(11);
        System.out.print("Add 11 at Last\t: ");
        member.displayFirst();

        member.addFirst(7);
        System.out.print("Add 7 at First\t: ");
        member.displayFirst();

        member.add(3, 1);
        System.out.print("Add 1 at pos 3\t: ");
        member.displayFirst();

        member.add(6, 3);
        System.out.print("Add 3 at pos 6\t: ");
        member.displayFirst();

        System.out.println("");
        System.out.println("Find value 20\t: " + member.contains(20));
        System.out.println("Find value 7\t: " + member.contains(7));
        System.out.println("Find value 11\t: " + member.contains(11));
        System.out.println("Find value 9\t: " + member.contains(9));
        System.out.println("");

        member.deleteFirst();
        System.out.print("Delete First\t: ");
        member.displayFirst();

        member.delete(3);
        System.out.print("Delete at pos 3\t: ");
        member.displayFirst();

        member.deleteLast();
        System.out.print("Delete Last\t: ");
        member.displayFirst();
    }
}
