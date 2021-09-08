
fun sortSet(){
    val people = setOf(
        User("Steve","Roger"),
        User("Tony","Stark"),
        User("Natasha","Romanoff"),
        User("Clint","Barton"),
        User("Bruce","Banner"),
        User("Thor","Odinson"),
    )
    people.sortedBy { it.firstName }.forEach { println(it) }
    println("------")
    people.sortedWith(compareBy<User> { it.firstName }.thenBy { it.lastName }).forEach { println(it) }
    println("------")
    people.sortedByDescending { it.firstName.length }.forEach { println(it) }
}
fun creatingSet(){
    val names = mutableSetOf("Steve","Tony","Clint","Thor","Natasha","Bruce")
    val newNames = arrayOf("Parker","Ned","Mysterio","Nick","Peter")
    names.add("Tony") // Không add được do trùng phần tử
    names.add("Peter")
    names.remove("Steve")
    //names.retainAll(newNames)
    names.addAll(newNames)
    println(names)
}
fun main(){
    //creatingSet()
    sortSet()
}