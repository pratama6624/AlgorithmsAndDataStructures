
class Tree {
    class Node {
        var value: Int
        var left: Node?
        var right: Node?
        
        init(_ value: Int) {
            self.value = value
        }
    }
    
    private var root: Node?
    
    public func rootNode() -> Node? {
        return root
    }
    
    private func isEmpty() -> Bool {
        root == nil
    }
    
    public func display() {
        preOrder(root!)
    }
    
    private func preOrder(_ node: Node?) {
        guard let node = node else { return }
        preOrder(node.left)
        print(node.value)
        preOrder(node.right)
    }
    
    private func insert(_ root: Node, _ newNode: Node) {
        if newNode.value < root.value {
            if root.left == nil {
                root.left = newNode
            } else {
                insert(root.left!, newNode)
            }
        } else {
            if root.right == nil {
                root.right = newNode
            } else {
                insert(root.right!, newNode)
            }
        }
    }
    
    public func add(_ value: Int) {
        var newNode = Node(value)
        if isEmpty() {
            root = newNode
            return
        }
        insert(root!, newNode)
    }
}

var tree = Tree()
tree.add(10)
tree.add(4)
tree.add(12)
tree.add(2)
tree.add(5)
tree.add(11)
tree.add(3)
tree.add(8)
tree.add(7)

tree.display()

print("\n")

print(tree.rootNode()?.value)
print(tree.rootNode()?.left?.value)
print(tree.rootNode()?.right?.value)
print(tree.rootNode()?.left?.left?.value)
print(tree.rootNode()?.left?.right?.value)
print(tree.rootNode()?.right?.left?.value)
print(tree.rootNode()?.left?.left?.right?.value)
print(tree.rootNode()?.left?.right?.right?.value)
print(tree.rootNode()?.left?.right?.right?.left?.value)
