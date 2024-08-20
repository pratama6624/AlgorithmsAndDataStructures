// Struct and Class

print("Struct:")

struct MyStruct {
    var name: String
    var nim: String
    var prodi: String
    
    var hello: String {
        return "Hello, my name is \(name)"
    }
    
    func description() -> () {
        print("Name: \(name)\nNim: \(nim)\nProdi: \(prodi)")
    }
}

let mystruct = MyStruct(name: "Pratama", nim: "411222054", prodi: "Teknik Informatika")

print(mystruct.hello)
mystruct.description()

print("\n")

print("Class:")

class MyClass {
    var name: String
    var nim: String
    var prodi: String
    
    init(name: String, nim: String, prodi: String) {
        self.name = name
        self.nim = nim
        self.prodi = prodi
    }
    
    var hello: String {
        return "Hello, my name is \(name)"
    }
    
    func description() -> () {
        print("Name: \(name)\nNim: \(nim)\nProdi: \(prodi)")
    }
}

let myclass = MyClass(name: "Pratama", nim: "411222054", prodi: "Teknik Informatika")

print(myclass.hello)
myclass.description()


print("\n")

// ------------------

class DataImporter {
    var filename = "data.txt"
}

class DataManager {
    lazy var importer = DataImporter()
    var data: [String] = []
}

let manager = DataManager()
manager.data.append("Some data")
manager.data.append("Some more data")

print("Data Manager: \(manager.data)")
print("Data Importer: \(manager.importer.filename)")

print("---------------------------")

struct Point {
    var x = 0.0, y = 0.0
}

struct Size {
    var width = 0.0, height = 0.0
}

struct Rect {
    var origin = Point()
    var size = Size()
    var center: Point {
        get {
            let centerX = origin.x + (size.width / 2)
            let centerY = origin.y + (size.height / 2)
            return Point(x: centerX, y: centerY)
        }
        set(newCenter) {
            origin.x = newCenter.x - (size.width / 2)
            origin.y = newCenter.y - (size.height / 2)
        }
    }
}

var square = Rect(origin: Point(x: 0.0, y: 0.0), size: Size(width: 10.0, height: 10.0))
let initialSquareCenter = square.center
square.center = Point(x: 15.0, y: 15.0)

print("Square.origin now at \(square.origin.x), \(square.origin.y)")

// Computed Properties == Properti yang tidak disimpan secara implisit

struct Circle {
    var jariJari: Double
    
    var area: Double {
        return Double.pi * jariJari * jariJari
    }
}

let myCircle = Circle(jariJari: 7.0)
print("My circle: \(myCircle.area)")

print("\n")

print("--------------------------------")

class Person: CustomStringConvertible {
    private var _name: String
    private var _age: Int
    
    init(name: String, age: Int) {
        self._name = name
        self._age = age
    }
    
    var name: String {
        get {
            return _name
        }
        set(name) {
            self._name = name
        }
    }
    
    var age: Int {
        get {
            return _age
        }
        set(age) {
            self._age = age
        }
    }
    
    var description: String {
        return "Name: \(_name), Age: \(_age)"
    }
}

var person = Person(name: "Pratama", age: 24)
print(person)

// Property Wrapper

print("--------------------------------------")


