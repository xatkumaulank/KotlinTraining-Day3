


fun main(){
    val names = mutableSetOf("Steve","Tony","Clint","Thor","Natasha","Bruce")
    val newNames = arrayOf("Parker","Ned","Mysterio","Nick","Peter")
    names.add("Tony") // Không add được do trùng phần tử
    names.add("Peter")
    names.remove("Steve")
    //names.retainAll(newNames)
    names.addAll(newNames)
    println(names)
}