package domain

class Play() {
    var name:String = ""
    var characters:ArrayList<Character> = ArrayList()
    var acts:ArrayList<Act> = ArrayList()
    var authors:ArrayList<User> = ArrayList()
    var collabortors:ArrayList<User> = ArrayList()

    constructor(name:String) : this() {
        this.name = name
    }
}