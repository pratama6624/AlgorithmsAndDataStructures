let numbers: [Int] = [1, 2, 4, 3, 5, 6, 8, 7, 9, 11, 17, 10]
func desc(_ int1: Int, int2: Int) -> Bool {
    return int1 < int2
}
var sortNumbers = numbers.sorted(by: desc)
print(sortNumbers)

sortNumbers = numbers.sorted(by: { (int1: Int, int2: Int) -> Bool in return int1 > int2 
})
print(sortNumbers)

var mathFunc: (Int, Int) -> Int = {(x, y) in return x + y}
print("5 + 7 = \(mathFunc(5, 7))")

var isOdd: (Int) -> Bool = {(x) in return x % 2 == 1}
print("5 are \(isOdd(5) ? "odd" : "even")")
print("10 are \(isOdd(10) ? "odd" : "even")")

var sayHello: (String, Int) -> String = {
    (name, age) in return "Hey \(name), i am pratama. You look \(age <= 30 ? "still young" : "old")"
}
print(sayHello("Hanna", 20))
print(sayHello("Oni", 24))
print(sayHello("Leo", 45))

let odds: [Int] = [1, 9, 5, 11, 3, 7, 13, 17, 15]
var oddSorted = odds.sorted {$0 < $1}

print("Odds : \(oddSorted)")
print("Odds Desc : \(odds.sorted {$0 > $1})")

// Map

let digitName: [Int: String] = [
    0: "Zero", 1: "One", 2: "Two", 3: "Three", 4: "Four",
    5: "Five", 6: "Six", 7: "Seven", 8: "Eight", 9: "Nine"
]
let numbersToDigitName: [Int] = [16, 510, 58]

let strings = numbersToDigitName.map { (number) -> String in
    var number = number
    var output = ""
    repeat {
        output = digitName[number % 10]! + output
        number /= 10
    } while number > 0
    return output
}
print(strings)

let doubleOdd = odds.map({(number: Int) -> Int in
    return number * 2
})
print("Double of odds: \(doubleOdd)")
print("Double od odds: \(odds.map {$0 * 2})")

let arrayOfInt: [Int] = [1, 2, 3, 4, 5]
let adding = arrayOfInt.map({ (number: Int) -> Int in
    return number + 10
})
// or
let addingClosures = arrayOfInt.map {$0 + 10}

//-------------------------------------------

let arrayRandomIntegers: [Int] = [7, 12, 5, 8, 14, 3, 9, 10]
let newArray = arrayRandomIntegers.map({ (number: Int) -> Int in
    return (number % 2 == 0) ? (number * 2) + 10 : number
})
print("New Array: \(newArray)")

//-------------------------------------------

func makeIncrementer(forIncrement amount: Int) -> () -> Int {
    var runningTotal = 0
    func incrementer() -> Int {
        runningTotal += amount
        return runningTotal
    }
    return incrementer
}

let incrementByTwo = makeIncrementer(forIncrement: 2)
print(incrementByTwo())
print(incrementByTwo())
print(incrementByTwo())
print(incrementByTwo())
print(incrementByTwo())

// ---------------Function in Function

func temperatureConverter(_ convertionType: String) -> (Double) -> Double {
    switch convertionType {
    case "CtoF":
        return { celcius in
            return (celcius * 9/5) + 32
        }
    case "FtoC":
        return { fahrenheit in
            return (fahrenheit - 32) * 5/9
        }
    default:
        fatalError("Invalid convertion type")
    }
}
let celciusToFahrenheit = temperatureConverter("CtoF")
print("50C: \(celciusToFahrenheit(50))F")
print("100C: \(celciusToFahrenheit(100))F")

let fahrenheitToCelcius = temperatureConverter("FtoC")
print("122F: \(fahrenheitToCelcius(122))C")
print("212F: \(fahrenheitToCelcius(212))C")



