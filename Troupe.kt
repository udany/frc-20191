package domain

class Troupe() {
    var name:String = ""
    var roles:ArrayList<TroupeRole> = ArrayList()
    var members:ArrayList<TroupeMember> = ArrayList()

    constructor(name:String) : this() {
        this.name = name
    }

    fun getOrCreateRole(name: String, permission: TroupePermission) : TroupeRole {
        var role:TroupeRole? = roles.find { r -> r.name == name }

        if (role === null) {
            role = TroupeRole(name, permission)
            roles.add(role)
        }

        return role
    }
}