struct SimpleArray {
    private var name: [String]
    
    init() {
        self.name = []
    }
    
    subscript(index: Int) -> String {
        get {
            guard index < name.count && index >= 0 else {
                return "Index out of range"
            }
            return name[index]
        }
        set(newValue) {
            if index >= name.count {
                name.append(contentsOf: repeatElement("", count: index - name.count + 1))
            }
            name[index] = newValue
        }
    }
}

var array = SimpleArray()
array[0] = "Pratama"
array[1] = ""
print(array[0])
print(array[1])

//----------------------------------------------------------------------------------------

print("\n\n")

class Vehicle {
    var currentSpeed: Double = 0.0
    var description: String {
        return "Traveling at \(currentSpeed) mph"
    }
    
    func makeNoise() {
        // Do nothing
    }
}

let someVehicle = Vehicle()

print(someVehicle.description)

class Bicycle: Vehicle {
    var hasBasket: Bool = false
}

var bicycle = Bicycle()
bicycle.currentSpeed = 20.0

print(bicycle.description)
