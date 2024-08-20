
// Prroperti Wrapper

import Foundation

@propertyWrapper
struct UserDefaultsWrapper<T> {
    private let key: String
    private let defaultValue: T
    
    init(_ key: String, defaultValue: T) {
        self.key = key
        self.defaultValue = defaultValue
    }
    
    var wrappedValue: T {
        get {
            return UserDefaults.standard.object(forKey: key) as? T ?? defaultValue
        }
        set {
            UserDefaults.standard.set(newValue, forKey: key)
        }
    }
}

struct UserSettings {
    @UserDefaultsWrapper("username", defaultValue: "Guest")
    var username: String
}

var userSettings = UserSettings()

print(userSettings.username)

userSettings.username = "John Doe"

print(userSettings.username)
