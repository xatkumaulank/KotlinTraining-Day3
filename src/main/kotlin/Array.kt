


fun main(){
    val items = arrayOf(1,2,3,4,5,6)
    items.forEach { println(it) }

    // In ra các phần tử ở trong mảng
    var users = arrayOf(
        User("Bui","Hoa"),
        User("Hoa","Bui")
    )
    users.forEach {
        println(it)
    }
    // Thêm một phần tử mới
    var updateUser = users.plus(User("Hoa","Huy"))
    updateUser.forEach { user -> println(user) }

    // Lấy phần tử từ vị trị
    var theUser = users.get(0)
    println(theUser)

    //Update mảng
    users[0] = User("Captain","America")
    println(users[0])
}

data class User(var firstName: String, var lastName : String)