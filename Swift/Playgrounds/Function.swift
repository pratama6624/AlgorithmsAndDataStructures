func greetNoParameter() -> String {
    return "Hello, My name is ???"
}

func greet(name: String) -> String {
    return "Hello \(name)"
}

func graduation(name: String, score: Double) -> Bool {
    return score >= 75
}

func noReturn() {
    print("Say hey")
}

func stringCount(name: String) -> Int {
    return name.count
}

func findMinAndMax(array: [Int]) -> (min: Int, max: Int)? {
    if array.isEmpty { return nil }
    var min = array[0], max = array[0]
    for i in 0..<array.count {
        if array[i] < min {
            min = array[i]
        } else if array[i] > max {
            max = array[i]
        }
    }
    return (min, max)
}

func anotherGreeting(for person: String) -> String {
    return "Hello, \(person)"
}

print(greetNoParameter())
print(greet(name: "Kukuh Nur Pratama"))

let student = graduation(name: "Pratama", score: 80.0)
print("Student: \(student ? "Lulus" : "Tidak Lulus")")

noReturn()

let name = "Kukuh Nur Pratama"
print("\(name), you have a long name \"\(stringCount(name: name))\"")

let score: [Int] = [99, 78, 76, 89, 90, 98, 67, 81]
let theScore = findMinAndMax(array: score)
print("Min: \(theScore?.min), Max: \(theScore?.max)")
print(findMinAndMax(array: [Int]()))

print(anotherGreeting(for: "Dave"))

print("----------------------------------------------")

func someFunc(firstParam: Int, secondParam: String) -> String {
     return "First: \(firstParam), Second: \(secondParam)"
}

func gift(from giver: String, to receiver: String) -> String {
    return "From \(giver) to \(receiver)"
}

func defaultParam(name: String = "Kukuh Nur Pratama") -> String {
    return "My name is \(name)"
}

func variadicParam(_ numbers: Int...) {
    for number in numbers {
        print("Number: \(number)")
    }
}

print(someFunc(firstParam: 1, secondParam: "2"))
print(gift(from: "Hanna", to: "Nana"))
print(defaultParam())
print(defaultParam(name: "Pratama One"))
variadicParam(0, 1, 2, 3, 4, 9, 8, 7, 6, 5)

print("----------------------------------------------")

// Inout Parameters

func swapValue(_ a: inout Int, _ b: inout Int) -> String {
    let temp = b
    b = a
    a = temp
    return "A: \(a), B: \(b)"
}

var a = 12, b = 10
print(swapValue(&a, &b))

func swapValueManual(aValue: inout Int, bValue: inout Int) -> (a: Int, b: Int) {
    let temp = aValue
    aValue = bValue
    bValue = temp
    return (aValue, bValue)
}

var aValue = 5, bValue = 1
print(swapValueManual(aValue: &aValue, bValue: &bValue))

// Using Function Types
func addTwoInt(a: Int, b: Int) -> Int {
    return a + b
}
var mathFunc: (Int, Int) -> Int = addTwoInt
var one = 1, three = 3
print("\(one) + \(three) = \(mathFunc(one, three))")
