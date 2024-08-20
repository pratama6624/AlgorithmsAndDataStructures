
// Contoh 1

class Counter {
    var count: Int = 0
    func increment() {
        self.count += 1
    }
    
    func increment(by amount: Int) {
        count += amount
    }
    
    func reset() {
        count = 0
    }
}

let counter = Counter()

counter.increment()
counter.increment(by: 2)
print(counter.count)

counter.reset()
print(counter.count)

// Mutating Func in Class
print("---------------------------------")

struct Point {
    var x = 0.0
    var y = 0.0
    
    mutating func moveBy(x deltaX: Double, y deltaY: Double) {
        self = Point(x: x + deltaX, y: y + deltaY)
    }
}

var myPoint = Point(x: 1.0, y: 2.0)
print("Before: \(myPoint.x), \(myPoint.y)")
myPoint.moveBy(x: 3.0, y: 4.0)
print("After: \(myPoint.x), \(myPoint.y)")

var fixedPoint = Point(x: 3.0, y: 3.0)
fixedPoint.moveBy(x: 2.0, y: 3.0)
