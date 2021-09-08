

val ironman = User("Tony","Stark")
val avengers = mutableListOf(
    User("Steve","Rogers"),
    ironman,
    User("Thor","Odinson"),
    User("Clint","Barton"),
    User("Natasha","Romanoff"),
    User("Bruce","Banner")
)
fun creatingImmutableList(){
    val items = listOf(1,2,3,4,5,6)
    items.forEach { println(it) }

    // Immutable list : Không thể thay đổi
    // items.add(6) -> Không add được
    // items.remove(2) -> Không thể remove

    val users = listOf(
        User("Spider","Man"),
        User("Iron","Man"),
        User("Hulk","")
    )
    users.forEach { user -> println(user) }
    println(users.firstOrNull())
    // Lấy ra phần từ đầu tiên
    val first = users.first()

    // Lấy ra phần từ cuối
    val last = users.last()

    val name : String? = null
    val stuff = if (name == null) emptyList() else listOf(name)
    println(stuff.isEmpty())
}
fun creatingMutableList(){
//    val items = mutableListOf(1,2,3,4,5,6)
//
//    items.add(7)
//    items.remove(4)
//    items.removeAt(0)
//    items[2] = 12
//    items.forEach{
//        println(it)
//    }

    avengers.add(User("Peter","Parker"))
    avengers.removeAt(0)
    avengers.remove(ironman)
    avengers[2] = User("Loki","Laufeyson")

    avengers.forEach { println(it) }
}
fun main(){
    //creatingImmutableList()
    creatingMutableList()
}