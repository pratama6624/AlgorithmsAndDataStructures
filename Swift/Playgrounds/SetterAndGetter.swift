// 1. Standart Setter and Getter
print("Standart Class")
class Person: CustomStringConvertible {
    private var _name: String
    private var _age: Int
    
    init(name: String, age: Int) {
        self._name = name
        self._age = age
    }
    
    var name: String {
        get {
            return self._name
        }
        set(newName) {
            self._name = newName
        }
    }
    
    var age: Int {
        get {
            return self._age
        }
        set(newAge) {
            self._age = newAge
        }
    }
    
    var description: String {
        return "Name: \(self._name), age: \(self._age)"
    }
}

let person = Person(name: "Pratama", age: 24)
print("Name: \(person.name), age: \(person.age)")
person.name = "Pratama One"
person.age = 25
print(person)

print("\nStandart Struct")

struct PersonStruct {
    private var _name: String
    
    init(name: String) {
        self._name = name
    }
    
    var name: String {
        get {
            return self._name
        }
        set(newName) {
            self._name = newName
        }
    }
}

let personStruct = PersonStruct(name: "Pratama")
print("Name: \(personStruct.name)")

print("\n-----------------")
// 2. Property Observers
class StepCounter {
    var totalStep: Int = 0 {
        willSet(newTotalStep) {
            print("Set step: \(newTotalStep)")
        }
        didSet {
            if totalStep > oldValue {
                print("Step: \(totalStep - oldValue)")
            }
        }
    }
}

let stepCounter = StepCounter()
stepCounter.totalStep = 100
stepCounter.totalStep = 150
stepCounter.totalStep = 50
stepCounter.totalStep = 500
