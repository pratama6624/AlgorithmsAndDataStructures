
class Stack {
    private var top: Int
    private var bottom: Int
    private var data: [Int]
    private var size: Int
    
    init(_ size: Int) {
        self.top = -1
        self.bottom = -1
        self.size = 0
        self.data = [Int](repeating: 0, count: size)
    }
    
    private func isEmpty() -> Bool {
        self.top == -1 && self.bottom == -1
    }
    
    private func isFull() -> Bool {
        self.bottom == 0 && self.top == self.data.count - 1
    }
    
    public func push(_ value: Int) {
        guard isFull() else {
            if isEmpty() {
                self.bottom += 1
            }
            self.top += 1
            self.data[top] = value
            self.size += 1
            return
        }
        print("Failed, The Stack is Full")
    }
    
    public func pop() -> Int {
        guard isEmpty() else {
            let current = self.data[top]
            self.data[self.top] = 0
            self.top -= 1
            self.size -= 1
            return current
        }
        print("Failed, The Stack is Empty")
        return 0
    }
    
    public func peek() -> Int {
        self.data[self.top]
    }
    
    public func getSize() -> Int {
        self.size
    }
    
    public func getStack() {
        for i in 0...self.data.count - 1 {
            print("Data \(i): \(self.data[i])")
        }
    }
}

var stack = Stack(6)

stack.push(1) // 1 in
print("Top: \(stack.peek())")

stack.push(2) // 2 in
print("Top: \(stack.peek())") // Top has moved

stack.push(3) // 3 in
print("Top: \(stack.peek())") // Top has moved

stack.push(4) // 4 in
print("Top: \(stack.peek())") // Top has moved

stack.push(5) // 5 in
print("Top: \(stack.peek())") // Top has moved

stack.push(6) // 6 in
print("Top: \(stack.peek())") // Top has moved

// Will fail if you push again because it is already full

stack.push(7) // 7 in, Failed
print("Top: \(stack.peek())") // Top will not move

stack.pop()
stack.pop()
stack.pop()

print("\n")

stack.getStack()

print("\n")

print("Size: \(stack.getSize())")
