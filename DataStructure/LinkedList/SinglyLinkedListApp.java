package DataStructure.LinkedList;

// A data structure consisting of several Nodes spread across memory and interconnected by addresses
class SinglyLinkedList<Value> {
    class Node {
        Value value;
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
            current.next = newNode;
            size++;
        }
    }

    // Get & Delete data : From the front
    public Value deleteFirst() {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        }
        Node current = head;
        head = head.next;
        size--;
        return current.value;
    }

    // Get & Delete data : From behind
    public Value deleteLast() {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        }
        Node current = head;
        Node previous = null;
        while(current.next != null) {
            previous = current;
            current = current.next;
        }
        /*
        * If the data reamins 1 maka variable previous
            will be null and will cause a NullPointerExceptionError
        * Then we have to delete the last data [head = null]
        */
        if(previous != null) {
            previous.next = null;
            tail = previous;
        } else {
            head = null;
        }
        size--;
        return current.value;
    }

    // Get & Delete data : In any part
    public Value delete(int pos) {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        } else if(pos > size || pos < 1) {
            throw new RuntimeException("Size is only " + size + ", and start from 1");
        } else {
            Node current = head;
            Node previous = null;
            int count = 1;
            while(count < pos) {
                count++;
                previous = current;
                current = current.next;
            }
            /*
            * If the data reamins 1 maka variable previous
                will be null and will cause a NullPointerExceptionError
            * Then we have to delete the last data [head = null]
            */
            if(previous != null) {
                previous.next = current.next;
                current.next = null;
            } else {
                head = null;
            }
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

    // Searching
    public int contains(Value value) {
        Node current = head;
        int count = 1;
        while(current != null) {
            if(value == current.value) {
                return count;
            }
            count++;
            current = current.next;
        }
        // Return -1 if value not found
        return -1;
    }

    // Check is empty
    private boolean isEmpty() {
        // If head is null the we can be sure the linked list is empty
        return head == null;
    }

    // Display
    public void display() {
        if(isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        Node pointer = head;
        String as;
        System.out.print("in -> ");
        while(pointer != null) {
            if(pointer == head && pointer == tail) {
                as = " [head & tail] -> ";
            } else if(pointer == head) {
                as = " [head] -> ";
            } else if(pointer == tail) {
                as = " [tail] -> ";
            } else {
                as = " -> ";
            }
            System.out.print(pointer.value + as);
            pointer = pointer.next;
        }
        System.out.print("out\n");
        System.out.println("---------------------------------------------------------");
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
        System.out.println("Head Address\t: @Node-" + System.identityHashCode(head));
        System.out.println("Head Value\t: " + head.value);
        System.out.println("Tail Address\t: @Node-" + System.identityHashCode(tail));
        System.out.println("Tail Value\t: " + tail.value);
        System.out.println("Tail Next Adrs\t: " + tail.next);
        System.out.println("--------------------------------------------------------\n\n");
    }
}

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        // Test List Integer
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.display();
        System.out.println();
        
        list.addFirst(10);
        System.out.print("Add First 10\t: ");
        list.display();

        list.addLast(9);
        System.out.print("Add Last 9\t: ");
        list.display();

        list.add(3, 20);
        System.out.print("Add 20 at pos 3\t: ");
        list.display();

        list.addFirst(8);
        System.out.print("Add First 8\t: ");
        list.display();

        list.addFirst(7);
        System.out.print("Add First 7\t: ");
        list.display();

        list.deleteLast();
        System.out.print("Delete Last\t: ");
        list.display();

        list.add(2, 11);
        System.out.print("Add 11 at pos 2\t: ");
        list.display();

        list.add(4, 12);
        System.out.print("Add 12 at pos 4\t: ");
        list.display();

        System.out.println("");
        System.out.println("Find value 5\t: " + list.contains(5));
        System.out.println("Find value 12\t: " + list.contains(12));
        System.out.println("");
        
        list.delete(3);
        System.out.print("Delete at pos 3\t: ");
        list.display();
        
        list.delete(5);
        System.out.print("Delete at pos 5\t: ");
        list.display();

        list.deleteLast();
        System.out.print("Delete Last\t: ");
        list.display();

        list.deleteFirst();
        System.out.print("Delete First\t: ");
        list.display();

        list.deleteLast();
        System.out.print("Delete Last\t: ");
        list.display();

        list.deleteFirst();
        System.out.print("Delete First\t: ");
        list.display();
    }
}
