/*
 Contoh penggunaan subscript yang lebih advanced dalam pengembangan aplikasi iOS bisa melibatkan struktur atau kelas kustom yang merepresentasikan data dari sumber eksternal, seperti database atau API, dan menggunakan subscript untuk mempermudah akses ke data
 */

struct ApiData {
    private var data: [String: Any]
    
    init(data: [String: Any]) {
        self.data = data
    }
    
    subscript<T>(key: String) -> T? {
        return data[key] as? T
    }
}

let apiResponce = ["name": "John Doe", "age": 24, "isStudent": true] as [String : Any]
let apiData = ApiData(data: apiResponce)

if let name: String = apiData["name"] {
    print("Name: \(name)")
}

if let isStudent: Bool = apiData["isStudent"] {
    print("He is student: \(isStudent)")
}


