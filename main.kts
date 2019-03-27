import domain.*

var user = User("Daniel", "all.your.base@are.belong.to.us", "123456")
print(user.password)


var troupe = Troupe("Trupe do Daniel")
troupe.members.add(TroupeMember(user, troupe.getOrCreateRole("Master", TroupePermission.Admin)))

