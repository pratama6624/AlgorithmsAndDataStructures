
class Person {
    var ownerName: String?
    var resident: Resident?
}

class Resident {
    var rooms: [Room] = []
    var numberOfRooms: Int {
        return rooms.count
    }
    subscript(i: Int) -> Room {
        get {
            return rooms[i]
        }
        set {
            rooms[i] = newValue
        }
    }
    func printNumberOfRooms() {
        print("The number of room is \(numberOfRooms)")
    }
    var address: Address?
}

class Room {
    let name: String
    init(name: String) {
        self.name = name
    }
}

class Address {
    var buildingName: String?
    var buildingNumber: String?
    var street: String?
    
    func buildingIdentifier() -> String? {
        if let buildingNumber = buildingNumber, let street = street {
            return "\(buildingNumber) \(street)"
        } else if buildingName != nil {
            return buildingName
        } else {
            return nil
        }
    }
}

let pratama = Person()
pratama.ownerName = "Kukuh Nur Pratama"
pratama.resident = Resident()
pratama.resident?.rooms.append(Room(name: "Bedroom"))
pratama.resident?.rooms.append(Room(name: "Living Room"))
pratama.resident?.rooms.append(Room(name: "Dining Room"))
pratama.resident?.rooms.append(Room(name: "Workspace"))

print("Owner name: \(pratama.ownerName)")
pratama.resident?.printNumberOfRooms()

for i in 0...(pratama.resident?.numberOfRooms ?? 0) - 1 {
    print("Room \(i): \(pratama.resident?.rooms[i].name)")
}
pratama.resident?.address = Address()

print("\nAddress:")
let address = Address()
address.buildingName = "Tokarev"
address.buildingNumber = "35"
address.street = "Bunga Anggrek"

pratama.resident?.address = address

print("Building name is \(pratama.resident?.address?.buildingName)")
print("Building number is \(pratama.resident?.address?.buildingNumber)")
print("Street name \(pratama.resident?.address?.street)")
