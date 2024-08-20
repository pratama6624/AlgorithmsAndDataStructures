// Mempresentasikan firstname, lastname, age .... fullname

struct Data {
    var firstname: String
    var lastname: String
    var age: Int
    
    var fullname: String {
        return firstname + " " + lastname
    }
}

let myData = Data(firstname: "Pratama", lastname: "One", age: 24)
print("Fullname: \(myData.fullname)")

print("---------------------------------------")

/*
Anda sedang mengembangkan aplikasi untuk manajemen stok barang di suatu toko. Anda memiliki struktur Product yang memiliki properti "stockQuantity" dan "isLowStock". Anda ingin menambahkan computed property baru yang disebut reorderQuantity. Computed property ini akan memberikan nilai berdasarkan aturan sebagai berikut:

Jika stockQuantity kurang dari atau sama dengan 10, reorderQuantity harus diatur menjadi 50.
Jika stockQuantity di antara 11 dan 20, reorderQuantity harus diatur menjadi 30.
Jika stockQuantity lebih dari 20, reorderQuantity harus diatur menjadi 10.
 */

struct BuyerData {
    var name: String
    var contact: String
    var qtyOrder: Int
    
    func toKeyValueArray() -> [String: Any] {
        return ["name": name, "contact": contact, "qty order" : qtyOrder]
    }
}

class MyStore {
    var stockQuantity: Int
    var product: String = "Coca Cola 1L"
    var salesHistory: [[String: Any]] = []
    
    init(stockQuantity: Int) {
        self.stockQuantity = stockQuantity
    }
    
    func order(name: String, contact: String, qty: Int) -> () {
        guard stockQuantity >= qty else {
            print("Gagal, Stok tidak mencukupi")
            return
        }
        stockQuantity -= qty
        salesHistory.append(BuyerData(name: name, contact: contact, qtyOrder: qty).toKeyValueArray())
        print("Pesanan \(name) - \(qty) diterima, Sisa stok \(stockQuantity)")
    }
    
    func reorder() -> () {
        var qtyToOrder: Int = switch stockQuantity {
        case 0..<11: 50
        case 10..<21 : 30
        case 20...: 10
        default: 0
        }
        print("Harus order lagi dari reseller sebanyak \(qtyToOrder), Stok tersisa \(stockQuantity)")
    }
}

var myStore = MyStore(stockQuantity: 60)
myStore.order(name: "Pratama", contact: "081329916624", qty: 12)
print("Sisa stok: \(myStore.stockQuantity)")
myStore.order(name: "Raka", contact: "082991222273", qty: 2)
print("Sisa stok: \(myStore.stockQuantity)")
myStore.order(name: "Nana", contact: "019231239128", qty: 50)
myStore.order(name: "Sinta", contact: "083199293837", qty: 40)

print("\n")
print(myStore.salesHistory)

print("\n")
myStore.reorder()

/*
Buatlah sebuah class TemperatureConverter dengan properti celsius dan fahrenheit. Properti ini harus dapat diakses dan diubah nilai dengan menggunakan setter dan getter 
*/

class TemperatureConverter {
    private var _celcius: Double = 0.0
    private var _fahrenheit: Double = 0.0
    
    // To Celcius
    var celcius: Double {
        get {
            return (_fahrenheit - 32) * 5/9
        }
        set(celcius) { 
            self._celcius = celcius
        }
    }
    
    // To Fahrenheit
    var fahrenheit: Double {
        get {
            return (_celcius * 9/5) + 32
        }
        set(fahrenheit) {
            self._fahrenheit = fahrenheit
        }
    }
}

let converter = TemperatureConverter()
converter.celcius = 50.0
print("50\u{00B0}C = \(converter.fahrenheit)\u{00B0}F")

converter.fahrenheit = 122.0
print("122\u{00B0}F = \(converter.celcius)\u{00B0}C")

//---------------------------------------------------

// Batas Latihan random, kebawah hapus aja

print("\n\n")

@propertyWrapper
struct SmallNumber {
    private var number: Int
    private(set) var projectedValue: Bool
    
    var wrappedValue: Int {
        get { return number }
        set {
            if newValue > 12 {
                number = 12
                projectedValue = false
            } else {
                number = newValue
                projectedValue = true
            }
        }
    }
    
    init() {
        self.number = 0
        self.projectedValue = false
    }
}
struct SomeStructure {
    @SmallNumber var someNumber: Int
}
var someStructure = SomeStructure()

someStructure.someNumber = 10
print(someStructure.$someNumber)

someStructure.someNumber = 13
print(someStructure.$someNumber)




