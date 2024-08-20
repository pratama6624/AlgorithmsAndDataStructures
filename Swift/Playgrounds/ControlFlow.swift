import Cocoa

// For in Loop
var members = ["Anna", "Hanna", "Tito", "John", "Alexa", "Rita"]
var count: Int = 0
for member in members {
    count += 1
    print("Member ke \(count): \(member)")
}

print("----------------------------------------------")

var numberOfLegs: [String: Int] = [
    "Ant": 6,
    "Elephant": 4,
    "Cat": 4,
    "Spider": 8,
    "Duck": 2
]
for (name, leg) in numberOfLegs {
    print("\(name) with \(leg) leg")
}

print("----------------------------------------------")

for i in 1...10 {
    if i % 2 == 1 {
        print("Odd: \(i)")
    } else {
        print("Even: \(i)")
    }
}

print("----------------------------------------------")

let base = 3
let power = 10
var answer = 1
for _ in 1...power {
    print("\(answer) * \(base)")
    var n = answer *= base
}
print("\(base) to the power of \(power) is \(answer)")

print("----------------------------------------------")

var numbers: Set<Int> = [1, 2, 3, 4, 5, 6, 7, 8, 9]
var sumOf: Int = 0
for _ in numbers {
    print("Hello, I don't need the value of this")
}

print("----------------------------------------------")

let minuteInterval = 5
let minute = 60
var counter: Int = 0
for tickMark in stride(from: 0, to: minute, by: minuteInterval) {
    counter += 1
    print("Step \(counter): \(tickMark)")
}

print("----------------------------------------------")

let hours = 12
let hoursInterval = 3
for tickMark in stride(from: 3, through: hours, by: hoursInterval) {
    print("Step: \(tickMark)")
}

print("----------------------------------------------")

// Snakes and Ladders

let finalSquare = 25
var board = [Int](repeating: 0, count: finalSquare + 1)
board[03] = +08
board[06] = +11
board[09] = +09
board[10] = +02
board[14] = -10
board[19] = -11
board[22] = -02
board[24] = -08
var square = 0
var diceRoll = 0

print(board)

print("\nStart Game")

repeat {
    let randomDiceRoll = Int.random(in: 1...6)
    square += randomDiceRoll
    diceRoll += 1
    if diceRoll == 7 {
        diceRoll = 1
    }
    /*
     Ada sedikit kesalahan dalam cara memainkan Snakes and Ladders
     yaitu ketika angka random dadu menyebabkan pemain berada di luar board atau melewatinya
     seharusnya berbalik memantul tetapi disini tidak seperti itu...
     disini permainan terus berlanjut bahkan ketika pemain melewati garis finish
     */
    if square < board.count {
        // if we're still on the board, move up or down for a snake or a ladder
        square += board[square]
    }
    
    print("Dice Roll: \(randomDiceRoll), Current square: \(square)")
} while square < finalSquare
print("Game Over!")

print("----------------------------------------------")

// Conditional Statement
let value = 80
let status = if value >= 80 {
    "Good job"
} else {
    "Bad job"
}
print("Value \(value): \(status)\n")

let temperature = -22
let freeze: String? = if temperature >= 20 {
    "Hot"
} else if temperature > -20, temperature < 20 {
    "Cold"
} else {
    nil
}
print("Temperature \(temperature): is \(freeze)")

print("----------------------------------------------")

//let you = "It's born"
let you = "not yet born"
let name = if you == "It's born" {
    "Hanna"
} else {
    nil as String?
}
print("Name: \(name)")

// Switch
let lamp = "yellow"
var response: String?
switch lamp {
case "red":
    response = "Stop"
case "yellow":
    response = "Slowly"
case "green":
    response = "Go Ahead"
default:
    response = nil
}
print("Lamp is \(lamp): \(response)")

print("----------------------------------------------")

let letter: Character = "C"
let whatLetter: String = switch letter {
case "a", "A":
    ": Letter A"
case "b", "B":
    ": Letter B"
default:
    ": I don't know what is it"
}
print("The Letter\(whatLetter)")

print("----------------------------------------------")

let age: Int = 11
let ageCategory: String = switch age {
case 1..<13:
    "children"
case 13..<20:
    "teenager"
case 20..<41:
    "mature"
case let x where x > 40:
    "elderly"
default:
    "Not human"
}
print("You are \(ageCategory)")

print("----------------------------------------------")

// Tuples
let somePoint = (x: 0, y: 5)
print("X: \(somePoint.x)")
print("Y: \(somePoint.y)")
let showSomePoint: String = switch somePoint {
case (0, 0):
    " is at the origin"
case (_, 0):
    " is on the x-axis"
case (0, _):
    " is on the y-axis"
case (-2...2, -2...2):
    " is inside the box"
default:
    " is outside of the box"
}
print("\(somePoint) \(showSomePoint)")

print("----------------------------------------------")

let anotherPoint = (x: 80, y: 0)
switch anotherPoint {
case (0, let y):
    print("on the y-axis with a y value of \(y)")
case (let x, 0):
    print("on the x-axis with an x value of \(x)")
case let(x, y):
    print("somewhere else at (\(x), \(y))")
}

print("----------------------------------------------")

let yetAnotherPoint = (1, -1)
switch yetAnotherPoint {
case let (x, y) where x == y:
    print("(\(x), \(y)) is on the line x == y")
case let (x, y) where x == -y:
    print("(\(x), \(y)) is on the line x == -y")
case let (x, y) where -x == y:
    print("(\(x), \(y)) is on the line -x == y")
case let (x, y):
    print("(\(x), \(y)) is just some arbitrary point")
}
print("Point: \(yetAnotherPoint)")

print("----------------------------------------------")

// Compound Cases

let someCharacter: Character = "+"
switch someCharacter {
case "a", "i", "u", "e", "o":
    print("\(someCharacter) is a vowel")
case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m",
     "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z":
    print("\(someCharacter) is a consonant")
default:
    print("\(someCharacter) isn't a vowel or consonant")
}

let stillAnotherPoint = (9, 1)
switch stillAnotherPoint {
case (let distance, 0), (0, let distance):
    print("On an axis, \(distance) from the origin")
default:
    print("Not on an axis")
}

print("----------------------------------------------")

let kuadran = (0, 1)
switch kuadran {
case let(x, y) where x > 0 && y > 0:
    print("Kuadran 1")
case let(x, y) where x < 0 && y > 0:
    print("Kuadran 2")
case let(x, y) where x < 0 && y < 0:
    print("Kuadran 3")
case let(x, y) where x > 0 && y < 0:
    print("Kuadran 4")
case (_, let y) where y == 0:
    print("Kuadran 5")
case (let x, _) where x == 0:
    print("Kuadran 6")
default:
    print("Nothing in the axis")
}

print("----------------------------------------------")

// Break

var puzzleIn = "kukuh nur pratama"
var puzzleOut = ""
let characterToRemove: [Character] = ["a", "i", "u", "e", "o", " "]
for character in puzzleIn {
    if characterToRemove.contains(character) {
        continue
    }
    puzzleOut.append(character)
}
print("Puzzle Out is \(puzzleOut)")

var oddNumbers: [Int] = []
for i in 1..<20 {
    if i % 2 == 0 {
        continue
    }
    oddNumbers.append(i)
}
print(oddNumbers)

print("----------------------------------------------")

let integerToDescribe = 11
var description = "The number \(integerToDescribe) is"
switch integerToDescribe {
case 2, 3, 5, 7, 11, 13, 17, 19:
    description += " a prime number, and also"
    fallthrough
default:
    description += " an integer"
}
print(description)

print("----------------------------------------------")

let rate = 3
var desc: String = ""
switch rate {
case 1:
    desc += "Produk sangat buruk. Saya kecewa."
case 2:
    desc += "Produk kurang memuaskan. Perlu perbaikan."
case 3:
    desc += "Produk standar. Tidak terlalu baik, tidak terlalu buruk."
    fallthrough
case 4:
    desc += "Produk bagus. Saya senang dengan pembeliannya."
    fallthrough
case 5:
    desc += "Produk luar biasa! Sangat memuaskan."
    fallthrough
default:
    desc += "Terima kasih atas penilaian tinggi Anda!"
}
print(desc)

print("----------------------------------------------")

outerLoop: for i in 1..<6 {
    innerLoop: for j in 1...5 {
        if i * j == 12 {
            print("Bingo, \(i) * \(j) = 12")
            break outerLoop
        } else {
            print("\(i), \(j)")
        }
    }
    print(" spase")
}

print("\n")

var arrayOfProduct: [String] = [
    "Chips", "Soda", "Popcorn", "Candy", "Cookies", "Cola", "Juice", "Crackers"
]
loopSearchOfProduct: for i in arrayOfProduct {
    if i == "Cola" {
        print("Product found it, coca cola, remove it from the store list")
        break loopSearchOfProduct
    } else {
        print("Still searching: \(i)")
    }
}

print("\n")

var keySearch = "Tea"
var listOfProduct: [[String]] = [
    ["Chips", "Soda", "Popcorn", "Candy", "Cookies", "Cola", "Juice", "Crackers"],
    ["Water", "Tea", "Coffee", "Energy Drink", "Lemonade", "Iced Tea", "Sports Drink"]
]
rack: for i in 0..<listOfProduct.count {
    list: for j in 0..<listOfProduct[i].count {
        if listOfProduct[i][j] == keySearch {
            print("Product: \(listOfProduct[i][j])")
            break rack
        } else {
            print("Still Searching: \(listOfProduct[i][j])")
        }
    }
    print("next")
}

print("----------------------------------------------")

// Early exit

func greet(person: [String: String]) {
    guard let name = person["name"] else {
        return
    }
    
    print("Hello, \(name)")
    
    guard let location = person["location"] else {
        print("I hope the weather is nice near you")
        return
    }
    
    print("I hope the weather is nice in \(location)")
}
greet(person: ["name": "Pratama", "location": "South Korea"])
greet(person: ["name": "John"])
greet(person: ["location": "Jakarta"])

print("----------------------------------------------")

// Defer action atau menunda blok kode tertentu

var score = 1
if score < 10 {
    defer {
        print("Score: \(score)")
    }
    score += 5
}

print("\n")

struct Order {
    var name: String?
    var product: String?
    var qty: Int?
    var price: Double?
}

func processOrder(order: Order?) {
    guard let validOrder = order else {
        print("Invalid order")
        return
    }
    
    defer {
        print("Performing cleanup or final actions")
    }
    
    print("Processing order: \(validOrder)")
}

var order = Order(name: "Pratama", product: "Iphone 14 Pro Max", qty: 1, price: 18_000_000.0)

var orderEmpty = Order(name: nil, product: nil, qty: 0, price: 0.0)

processOrder(order: Order())

print("\n")

func connecttionToServer() -> Bool {
    return true
}

func connectToServer() {
    print("Opening connection...")
    
    let startTime = Date()
    
    defer {
        let endTime = Date()
        print("Closing connection...")
        print("Connection duration: \(endTime.timeIntervalSince(startTime)) second")
    }
    
    guard connecttionToServer() else {
        print("Connection failed, exiting program")
        return
    }
    
    print("Connection success")
}

connectToServer()
