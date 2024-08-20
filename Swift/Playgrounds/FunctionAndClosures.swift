// Function 1
print("Function 1 (Normal Function)")
func calculate(_ scores: [Int]) -> (min: Int, max: Int, sum: Int) {
    var min = scores[0]
    var max = scores[0]
    var sum = 0
    
    for score in scores {
        if score < min {
            min = score
        } else if score > max {
         max = score
        }
        
        sum += score
    }
    
    return (min, max, sum)
}

let x = calculate([5, 2, 3, 1, 10, 9, 8])

print("Min : " + String(x.min))
print("Min : \(x.min)")
print("Min : \(x.0)")

print("Max : " + String(x.max))
print("Max : \(x.max)")
print("Max : \(x.1)")

print("Sum of : " + String(x.sum))
print("Sum of : \(x.sum)")
print("Sum of : \(x.2)")

print("\(x)\n")


// Function 2
print("Function 2 (Normal Function)")
func returnSomething() -> Int {
    var x = 2
    while x < 10 {
        x *= 3
    }
    return x
}
print("X : \(returnSomething())\n")

// Function 3
print("Function 3 (Function within Function")
func makeItDeep() -> ((Int) -> Int) {
    func deep(number: Int) -> Int {
        return number * 10
    }
    return deep
}
var deep = makeItDeep()
print("Make it deep : \(deep(10))\n")

// Function 4
print("Function 4 (Higher Order Function)")
func evenOddFinder(list: [Int], condition: (Int) -> Bool) -> [Int] {
    var newList: [Int] = []
    for i in list {
        if condition(i) {
         newList.append(i)
        }
    }
    return newList
}

func isEven(number: Int) -> Bool {
    return number % 2 == 0
}

func isOdd(number: Int) -> Bool {
    return number % 2 == 1
}

let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
let evenNumbers = evenOddFinder(list: numbers, condition: isEven)
print("Even numbers : \(evenNumbers)")
let oddNumbers = evenOddFinder(list: numbers, condition: isOdd)
print("Odd numbers : \(oddNumbers)\n")

// Function 5
print("Function 5 (Higher Order Function - Mapped Function)")
numbers.map({ (number: Int) -> Int in
    let result = 2 * number
    return result
})
let mappedNumbers = numbers.map({number in 3 * number})
print("Mapped numbers : \(mappedNumbers)")

let sortedNumbers = numbers.sorted{$0 > $1}
print("Sorted numbers : \(sortedNumbers)")
