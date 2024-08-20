// Note: There is no full and limit and the concept of cingular array
class Stack<T> {
    class Node<T> {
        var value: T
        var next: Node<T>?
        
        init(_ value: T) {
            self.value = value
        }
    }
    
    private var size: Int = 0
    private var bottom: Node<T>?
    private var top: Node<T>?
    
    private func isEmpty() -> Bool {
        size == 0
    }
    
    public func push(_ value: T) {
        var current = Node(value)
        if isEmpty() {
            bottom = current
            top = bottom
        } else {
            current.next = top
            top = current
        }
        size += 1
    }
    
    public func pop() -> T? {
        guard !isEmpty() else {
            return nil
        }
        var poppedValue = top!.value
        if size == 1 {
            top = nil
            bottom = nil
        } else {
            top = top?.next
        }
        size -= 1
        return poppedValue
    }
    
    public func peek() -> T? {
        isEmpty() ? nil : top?.value
    }
    
    public func getSize() -> Int {
        size
    }
    
    public func getStack() {
        var pointer = top
        while pointer != nil {
            print("\(pointer?.value) ")
            pointer = pointer?.next
        }
    }
}

var stack = Stack<Int>()

stack.push(1) // 1 in
stack.push(2) // 2 in
stack.push(3) // 3 in
stack.push(4) // 4 in

stack.pop() // 4 out
stack.pop() // 3 out

stack.push(5) // 5 in

stack.pop() // 5 out
stack.pop() // 2 out
stack.pop() // 1 out

print("Size: \(stack.getSize())")

stack.getStack()

print("Peek: \(stack.peek())")
