class SimpleQueue {
    class Node {
        var value: Int
        var next: Node?
        
        init(_ value: Int) {
            self.value = value
        }
    }
    
    private var head: Node?
    private var tail: Node?
    private var size: Int = 0
    
    private func isEmpty() -> Bool {
        head == nil
    }
    
    // add to the rear or tail
    public func enqueue(_ value: Int) {
        var current = Node(value)
        if isEmpty() {
            head = current
            tail = head
            size += 1
            return
        }
        tail?.next = current
        tail = current
        size += 1
    }
    
    // remove from front or head
    public func dequeue() -> Int {
        guard isEmpty() else {
            var headValue = head!.value
            head = head?.next
            return head!.value
        }
        return 0
    }
    
    public func getHead() -> Int {
        guard isEmpty() else {
            return head!.value
        }
        return 0
    }
    
    public func getTail() -> Int {
        guard isEmpty() else {
            return tail!.value
        }
        return 0
    }
    
    public func getSize() -> Int {
        return size
    }
    
    public func getQueue() {
        guard isEmpty() else {
            var pointer = head
            print("in -> ")
            while pointer != nil {
                print(pointer?.value)
                pointer = pointer?.next
            }
            return
        }
        print("Queue is empty")
    }
}

var queue = SimpleQueue()

queue.enqueue(10)
queue.enqueue(5)
queue.enqueue(1)
queue.enqueue(3)
queue.enqueue(7)
queue.enqueue(9)
queue.enqueue(12)

print("Head: \(queue.getHead())")

print("Get then Remove fron front or head: \(queue.dequeue())")

print("Head: \(queue.getHead())")
print("Tail: \(queue.getTail())")

queue.getQueue()

