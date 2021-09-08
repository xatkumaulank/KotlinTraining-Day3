


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
    val ironman = User("Tony","Stark")
    val avengers = mutableListOf(
        User("Steve","Rogers"),
        ironman,
        User("Thor","Odinson"),
        User("Clint","Barton"),
        User("Natasha","Romanoff"),
        User("Bruce","Banner")
    )
    avengers.add(User("Peter","Parker"))
    avengers.removeAt(0)
    avengers.remove(ironman)
    avengers[2] = User("Loki","Laufeyson")

    avengers.forEach { println(it) }
}
fun filteringAList(){
    val names = listOf("Steve","Tony","Clint","Thor","Natasha","Bruce")
    val filerName = names.filter { it.contains("o") }
    println(filerName)

    val ages = listOf(15,48,65,263,1,18,95,12)
    val filterAge = ages.filter(::isAdult)
    println(filterAge)
}
fun sortList(){
    val names = listOf("Steve","Tony","Clint","Thor","Natasha","Bruce")
    println(names.sorted())
    println(names.sortedDescending())
    println(names.sortedBy { it.length })
    println(names.sortedWith(compareBy<String> { it.length }.thenBy { it.last() })) // sắp xếp theo độ dài tên, nếu trùng thì theo chữ cái cuối cùng
}
fun sortListVer2(){
    val avengers = listOf(
        User("Steve","Rogers"),
        User("Tony","Stark"),
        User("Thor","Odinson"),
        User("Clint","Barton"),
        User("Natasha","Romanoff"),
        User("Bruce","Banner")
    )
    avengers.sortedBy { it.lastName }.forEach { println(it) }
    println("---------")
    avengers.sortedByDescending { it.firstName }.forEach { println(it) }
    println("---------")
    avengers.sortedWith(compareBy<User> { it.firstName }.thenBy { it.firstName[1] }.thenBy { it.lastName }).forEach { println(it) }
}
fun isAdult(age : Int) : Boolean{
    return age >= 18
}
fun main(){
    //creatingImmutableList()
    //creatingMutableList()
    //filteringAList()
    //sortList()
    sortListVer2()
}