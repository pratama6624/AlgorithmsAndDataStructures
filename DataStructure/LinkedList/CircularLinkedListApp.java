package DataStructure.LinkedList;

/* 
    Cicular Single Linked List are unidirectional linked list.
    We can only cross it in one direction.
    But this type of linked list has the last node pointing to the head node.
*/
class CircularLinkedList<Value> {
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
            tail.next = head;
            size++;
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        tail.next = newNode;
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
            Node previous = null;
            int count = 1;
            while(count < pos) {
                count++;
                previous = current;
                current = current.next;
            }
            Node newNode = new Node(value);
            newNode.next = previous.next;
            previous.next = newNode;
            size++;
        }
    }

    // Get & Delete data : From behind
    public Value deleteLast() {
        if(isEmpty()) {
            throw new RuntimeException("Linked List is empty");
        }
        Node current = head;
        Node previous = null;
        while(current != tail) {
            previous = current;
            current = current.next;
        }
        /*
        * If the data reamins 1 maka variable previous
            will be null and will cause a NullPointerExceptionError
        * Then we have to delete the last data [head = null]
        */
        if(previous != null) {
            previous.next = head;
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
        } else if(pos > 1 && pos == size) {
            return deleteLast();
        }
        else {
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
            throw new RuntimeException("Linked List is Empty");
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

    // Check if empty
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

    // Display
    public void display() {
        if(isEmpty()) {
            System.out.println("Linked List is empty");
            return;
        }
        Node pointer = head;
        System.out.print("in -> ");
        String as;
        int count = 1;
        while(count < (size + 1)) {
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
            count++;
        }
        System.out.println("out");
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
        System.out.println("------------------------------------------------------");
        System.out.println("Data Size\t: " + size);
        System.out.println("Head Value\t: " + head.value);
        System.out.println("Head Address\t: " + "@Node-" + System.identityHashCode(head));
        System.out.println("Tail Value\t: " + tail.value);
        System.out.println("Tail Address\t: " + "@Node-" + System.identityHashCode(tail));
        System.out.println("Tail Next Value\t: " + tail.next.value);
        System.out.println("Tail Next Adres\t: " + "@Node-" + System.identityHashCode(tail.next));
        System.out.println("------------------------------------------------------\n\n");
    }
}

public class CircularLinkedListApp {
    public static void main(String[] args) {
        CircularLinkedList<Integer> myList = new CircularLinkedList<>();
        myList.display();
        System.out.println();

        myList.addFirst(10);
        System.out.print("Adding 10\t: ");
        myList.display();
        myList.showDetail();

        myList.add(5, 2);
        System.out.print("Adding 2 at pos 5\t: ");
        myList.display();
        myList.showDetail();

        myList.addFirst(9);
        System.out.print("Adding 9\t: ");
        myList.display();
        myList.showDetail();

        myList.addFirst(8);
        System.out.print("Adding 8\t: ");
        myList.display();
        myList.showDetail();

        myList.add(2, 7);
        System.out.print("Add 7 at pos 2\t: ");
        myList.display();
        myList.showDetail();

        myList.add(5, 5);
        System.out.print("Add 5 at pos 5\t: ");
        myList.display();
        myList.showDetail();

        myList.addFirst(4);
        System.out.print("Adding 4\t: ");
        myList.display();
        myList.showDetail();

        System.out.println("Find value 100\t: " + myList.contains(100));
        System.out.println("Find value 4\t: " + myList.contains(4));
        System.out.println("Find value 9\t: " + myList.contains(9));
        System.out.println("Find value 5\t: " + myList.contains(5));
        System.out.println("\n");

        myList.delete(2);
        System.out.print("Delete at pos 2\t: ");
        myList.display();
        myList.showDetail();

        myList.delete(5);
        System.out.print("Delete at pos 5\t: ");
        myList.display();
        myList.showDetail();

        myList.deleteLast();
        System.out.print("Delete it\t: ");
        myList.display();
        myList.showDetail();
        
        myList.deleteLast();
        System.out.print("Delete it\t: ");
        myList.display();
        myList.showDetail();

        myList.deleteLast();
        System.out.print("Delete it\t: ");
        myList.display();
        myList.showDetail();

        myList.deleteLast();
        System.out.print("Delete it\t: ");
        myList.display();
        myList.showDetail();
    }
}
