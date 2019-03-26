class User {
    var name:String = ""
    var email:String = ""
    var password:String = ""
        set(value) {
            field = value + "salt"
        }

    constructor(name:String, email:String, password:String) {
        this.name = name
        this.email = email
        this.password = password
    }
}