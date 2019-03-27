package domain

class TroupeRole() {
    var name:String = ""
    var permission: TroupePermission = TroupePermission.Member

    constructor(name:String, permission: TroupePermission) : this() {
        this.name = name
        this.permission = permission
    }
}