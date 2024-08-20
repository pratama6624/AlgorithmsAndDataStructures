
class CingulanQueue {
    private var size: Int
    private var data: [Int]
    private var head: Int
    private var tail: Int
    
    init(_ size: Int) {
        self.size = 0
        self.data = [Int](repeating: 0, count: size)
        self.head = -1
        self.tail = -1
    }
    
    public func getHead() -> Int {
        self.data[self.head]
    }
    
    public func getTail() -> Int {
        self.data[self.tail]
    }
    
    private func isEmpty() -> Bool {
        self.head == -1 && self.tail == -1
    }
    
    private func isFull() -> Bool {
        self.head == 0 && self.tail == data.count - 1 || self.head - self.tail == 1
    }
    
    public func enqueue(_ value: Int) {
        guard isFull() else {
            guard isEmpty() else {
                self.tail = (tail + 1) % self.data.count
                self.data[self.tail] = value
                self.size += 1
                return
            }
            self.head += 1
            self.tail = self.head
            self.data[head] = value
            self.size += 1
            return
        }
        print("Failed, The Queue is Full")
    }
    
    public func dequeue() -> Int {
        guard isEmpty() else {
            // One left in the Queue
            var current = self.data[head]
            self.data[self.head] = 0
            self.size -= 1
            if self.head == self.tail {
                self.head = -1
                self.tail = -1
            } else {
                self.head = (self.head + 1) % self.data.count
            }
            print("Dequeue Success")
            return current
        }
        print("Failed, The Queue is Empty")
        return 0
    }
    
    public func getQueue() {
        for i in 0...self.data.count - 1 {
            print("Data \(i): \(self.data[i])")
        }
    }
}

var cingularQueue = CingulanQueue(6)

cingularQueue.enqueue(2) // 2 in, head
cingularQueue.enqueue(5) // 5 in
cingularQueue.enqueue(1) // 1 in
cingularQueue.enqueue(8) // 8 in
cingularQueue.enqueue(4) // 4 in
cingularQueue.enqueue(6) // 6 in, tail
cingularQueue.dequeue() // 2 out, The head moves

print("Head: \(cingularQueue.getHead())") // New head is 5

cingularQueue.enqueue(12) // 12 in, new tail
cingularQueue.enqueue(9) // failed, The queue is full

print("Take the head: \(cingularQueue.dequeue())") // 5 out, The head moves

print("Tahe the head: \(cingularQueue.dequeue())") // 1 out, The head moves, now head is 8

cingularQueue.getQueue()

print("\n")

print("Head: \(cingularQueue.getHead())") // Head is 8
print("Tail: \(cingularQueue.getTail())") // Tail is 12
