package DataStructure.Queue;

class CircularQueue {
    private int size;
    private int[] data;
    private int head;
    private int tail;

    // Size => Fixed
    CircularQueue(int dataSize) {
        this.size = 0;
        this.data = new int[dataSize];
        this.head = -1;
        this.tail = -1;
    }

    // Size default => 10
    CircularQueue() {
        this.size = 0;
        this.data = new int[10];
        this.head = -1;
        this.tail = -1;
    }

    // enqueue : adds elements to the end of the queue
    public void enqueue(int value) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            if(head == -1) {
                head++;
                tail++;
                data[head] = value;
                size++;
            } else {
                tail = (tail + 1) % data.length;
                data[tail] = value;
                size++;
            }
        }
    }

    // dequeue : Removes elements from the front of the queue
    public int dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            int current = data[head];
            data[head] = 0;
            if(head == tail) {
                head = -1;
                tail = -1;
                size = 0;
                return current;
            } else {
                head = (head + 1) % data.length;
                size--;
                return current;
            }
        }
    }

    // peek : Get the value of the front of the queue without deleting it
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return data[head];
    }

    // isFull : Check if the queue is full
    private boolean isFull() {
        return head == 0 && tail == data.length - 1 || head - tail == 1;
    }

    // isEmpty : Check if the queue is empty
    private boolean isEmpty() {
        return head == -1 && tail == -1;
    }

    // print : Only to check the flow of data in and out
    public void print() {
        for(var i = 0; i < data.length; i++) {
            if(i == head && i == tail) {
                System.out.print(data[i] + " [head and tail], ");
            } else if(i == head) {
                System.out.print(data[i] + " [head], ");
            } else if(i == tail) {
                System.out.print(data[i] + " [tail], ");
            } else {
                System.out.print(data[i] + ", ");
            }
        }
        if(this.getSize() != 0) {
            System.out.print("\tSize => " + this.getSize() + "\n");
        } else {
            System.out.println();
        }
    }

    // getSize : Get the number of members in the queue
    public int getSize() {
        return this.size;
    }
}

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        int dequeueValue, peekValue;

        System.out.println("ENQUEUE : ");

        queue.enqueue(9);
        System.out.print("After 9 in\t=> ");
        queue.print();

        queue.enqueue(8);
        System.out.print("After 8 in\t=> ");
        queue.print();

        queue.enqueue(7);
        System.out.print("After 7 in\t=> ");
        queue.print();

        queue.enqueue(6);
        System.out.print("After 6 in\t=> ");
        queue.print();

        queue.enqueue(5);
        System.out.print("After 5 in\t=> ");
        queue.print();

        System.out.println("\nDEQUEUE : ");

        dequeueValue = queue.dequeue();
        System.out.print("After " + dequeueValue + " out\t=> ");
        queue.print();

        System.out.println("\nPEEK : ");

        peekValue = queue.peek();
        System.out.print("Peek " + peekValue + " out\t=> ");
        queue.print();

        System.out.println("\nDEQUEUE : ");

        dequeueValue = queue.dequeue();
        System.out.print("After " + dequeueValue + " out\t=> ");
        queue.print();

        dequeueValue = queue.dequeue();
        System.out.print("After " + dequeueValue + " out\t=> ");
        queue.print();

        dequeueValue = queue.dequeue();
        System.out.print("After " + dequeueValue + " out\t=> ");
        queue.print();

        System.out.println("\nENQUEUE : ");

        queue.enqueue(10);
        System.out.print("After 10 in\t=> ");
        queue.print();

        queue.enqueue(1);
        System.out.print("After 1 in\t=> ");
        queue.print();

        queue.enqueue(15);
        System.out.print("After 15 in\t=> ");
        queue.print();
    }
}
