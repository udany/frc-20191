package domain

class LineBlock() : TextBlock() {
    var character:Character? = null

    constructor(text:String) : this() {
        this.text = text
    }

    constructor(text:String, character: Character) : this() {
        this.text = text
        this.character = character
    }
}