
enum CompassPoint {
    case north
    case east
    case south
    case west
}

enum numbers: CaseIterable {
    case zero, one, two, three, four, five, six, seven, eight, nine
}

var compass = CompassPoint.east

print("Timur: \(compass)")
print("Barat: \(CompassPoint.west)")

compass = .south

print("Compass now is \(compass)")
switch compass {
case .north:
    print("Go north")
case .east:
    print("Go east")
case .south:
    print("Go south")
case .west:
    print("Go west")
default:
    print("Wrong direction")
}

enum baverages: CaseIterable {
    case coffee, tea, juice
}
let numberOfList = baverages.allCases.count
print("Baverages: \(numberOfList)")

print("------")

for number in numbers.allCases {
    print(number)
}

print("-----------")

enum Barcode {
    case upc(Int, Int, Int, Int)
    case qrCode(String)
}
cocaCola = .qrCode("ABCDEFGHIJKLMNOP")

switch cocaCola {
case .upc(let numberSystem, let manufacturer, let product, let check):
    print("UPC: \(numberSystem), \(manufacturer), \(product), \(check)")
case .qrCode(let productCode):
    print("QR CODE: \(productCode)")
}

var cocaCola = Barcode.upc(8, 85909, 51226, 3)

switch cocaCola {
case let .upc(numberSystem, manufacturer, product, check):
    print("UPC: \(numberSystem), \(manufacturer), \(product), \(check)")
case let .qrCode(productCode):
    print("QR CODE: \(productCode)")
}

// Raw Values

enum orderStatus: String {
    case pending = "Pending"
    case processing = "Processing"
    case shipped = "Shipped"
    case delivered = "Delivered"
}
let currentStatus = orderStatus.processing
print("Order: \(currentStatus)")

enum direction: String {
    case north, east, south, west
}
let onDirection = direction.east.rawValue
print("On Direct: \(onDirection)")

enum planet: Int {
    case mercury = 1, venus, earth, mars, jupiter, saturn, neptune
}
print("Mars at position: \(planet.earth.rawValue)")

let findPosition = 12
if let somePlanet = planet(rawValue: findPosition) {
    switch somePlanet {
    case .earth:
        print("You can live here")
    default:
        print("It's dangerous to live here")
    }
} else {
    print("There isn't a planet at position")
}

print("------------------")

print("Rwcursive enum")

enum BinaryTree {
    indirect case node(value: Int, left: BinaryTree, right: BinaryTree)
    case empty
}
let leaf = BinaryTree.node(value: 5, left: .empty, right: .empty)
let tree = BinaryTree.node(value: 10, left: leaf, right: .empty)
print(leaf)
print(tree)
