import Foundation

enum VendingMachineError: Error {
    case invalidSelection
    case insufficientFunds(coinsNeeded: Int)
    case outOfStock
}

struct Item {
    var price: Int
    var count: Int
}

class VendingMachine {
    var inventory = [
        "Candy Bar": Item(price: 12, count: 7),
        "Chips": Item(price: 10, count: 4),
        "Pepsi": Item(price: 15, count: 11)
    ]
    var coinsDeposited = 0
    
    func vend(itemNamed name: String) throws {
        guard let item = inventory[name] else {
            throw VendingMachineError.invalidSelection
        }
        
        guard item.count > 0 else {
            throw VendingMachineError.outOfStock
        }
        
        guard item.price <= coinsDeposited else {
            throw VendingMachineError.insufficientFunds(coinsNeeded: item.price - coinsDeposited)
        }
        
        coinsDeposited -= item.price
        
        var newItem = item
        newItem.count -= 1
        inventory[name] = newItem
        
        print("Dispending \(name)")
    }
}

let favoriteSnacks = [
    "Alice": "Chips",
    "Bob": "Licorice",
    "Eve": "Pretzels"
]

func buyFavoriteSnack(person: String, vendingMachine: VendingMachine) throws {
    let snackName = favoriteSnacks[person] ?? "Candy Bar"
    try vendingMachine.vend(itemNamed: snackName)
}

struct PurchasedSnack {
    let name: String
    init(name: String, vendingMachine: VendingMachine) throws {
        try vendingMachine.vend(itemNamed: name)
        self.name = name
    }
}

// Try it
var vendingMachine = VendingMachine()
vendingMachine.coinsDeposited = 40
do {
    try buyFavoriteSnack(person: "Alice", vendingMachine: vendingMachine)
    print("Success! Yum.")
} catch VendingMachineError.invalidSelection {
    print("Invalid Selection")
} catch VendingMachineError.outOfStock {
    print("Out Of Stcok")
} catch VendingMachineError.insufficientFunds(let coinsNeeded) {
    print("Insufficient funds. Please insert an additional \(coinsNeeded) coins.")
} catch {
    print("Unexpected error: \(error).")
}

// Try it
func eat(item: String) throws {
    do {
        try vendingMachine.vend(itemNamed: item)
    } catch VendingMachineError.invalidSelection, VendingMachineError.insufficientFunds, VendingMachineError.outOfStock {
        print("Invalid selection, out of stock, or not enough money.")
    }
}
try eat(item: "Chips")

// Try it
func nourish(with item: String) throws {
    do {
        try vendingMachine.vend(itemNamed: item)
    } catch is VendingMachineError {
        print("Couldn't buy that from the vending machine.")
    }
}
do {
    try nourish(with: "Beef-Flavored Chips")
} catch {
    print("Unexpected non-vending-machine-related error: \(error)")
}

// break
print("\n")


// Converting errors to optional value
func loadFile(path: String) -> String? {
    do {
        let content = try String(contentsOfFile: path)
        return content
    } catch {
        print("Error: \(error)")
        print("Return nil")
        return nil
    }
}
let filePath = "/path/to/file.txt"
let fileContent = loadFile(path: filePath)

if let content = fileContent {
    print("File Content: \(content)")
} else {
    print("Error: Fail load file")
}

// Break
print("\n")

// Defer
// Its function is to clear memory after a block of code has been used, either finished in an error-free condition or leaving an error

// Resetting Variables
func calculateAverage(numbers: [Int]) -> Double {
    defer {
        print("Clear memori after use")
    }
    
    var sum = 0
    var count = 0
    
    for number in numbers {
        sum += number
        count += 1
    }
    
    if count == 0 {
        return 0
    } else {
        return Double(sum) / Double(count)
    }
}

let result = calculateAverage(numbers: Array(stride(from: 0, to: 10, by: 1)))

print(result)
