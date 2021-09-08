fun removeDuplicateString() {
    //Loại bỏ Strings bị trùng lặp
    // Duy trì thứ tự ban đầu
    val devs = arrayOf("Amit", "Ali", "Amit", "Sumit", "Sumit", "Himanshu")
    print(devs.distinct()) // [Amit, Ali, Sumit, Himanshu]
}
fun makeArrayOrListToString(){
    //Chuyển array hoặc list thành string
    val someKotlinCollectionFunctions = listOf(
        "distinct", "map",
        "isEmpty", "contains",
        "filter", "first",
        "last", "reduce",
        "single", "joinToString"
    )

    val message = someKotlinCollectionFunctions.joinToString(
        separator = ", ",
        prefix = "Kotlin có nhiều collection functions như: ",
        postfix = " và nó rất xịn xò.",
        limit = 10,
        truncated = "vv "
    )

    print(message)
}
fun transformACollectionToOnlyResult(){
    //Chuyển đổi một collection thành một kết quả duy nhất
    val numList = listOf(1, 2, 3, 4, 5)
    val result = numList.reduce { a, item ->
        a + item
    }
    print(result) // 15

// NOTE: Nếu list rỗng, nó sẽ throw RuntimeException
}
fun checkAllItemIsValidOrNot(){
    //Tìm xem tất cả các phần tử có thỏa mãn một điều kiện cụ thể hay không
    val user1 = Person(id = 1, name = "Amit", isCricketLover = true, isFootballLover = true)
    val user2 = Person(id = 2, name = "Ali", isCricketLover = true, isFootballLover = true)
    val user3 = Person(id = 3, name = "Sumit", isCricketLover = true, isFootballLover = false)
    val user4 = Person(id = 4, name = "Himanshu", isCricketLover = true, isFootballLover = false)

    val users = arrayOf(user1, user2, user3, user4)

    val allLoveCricket = users.all { it.isCricketLover }
    print(allLoveCricket) // true

    val allLoveFootball = users.all { it.isFootballLover }
    print(allLoveFootball) // false
}
fun splitACollection(){
    //Chia danh sách thành nhiều danh sách con có kích thước nhỏ hơn
    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val chunkedLists = numList.chunked(3)
    println(chunkedLists) // [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]
}
fun changeTypeOfCollection(){
    // Thay đổi type của collections sang loại khác
    var uIntArray = UIntArray(5) { 1U }
    var intArray = uIntArray.toIntArray()
    intArray[0] = 0
    print(uIntArray.toList()) // [1, 1, 1, 1, 1]
    print(intArray.toList()) // [0, 1, 1, 1, 1]

}
fun associateData(){
    //Liên kết dữ liệu bằng một số key
    val contactList = listOf(
        Contact("Amit", "+9199XXXX1111"),
        Contact("Ali", "+9199XXXX2222"),
        Contact("Himanshu", "+9199XXXX3333"),
        Contact("Sumit", "+9199XXXX4444")
    )

    val phoneNumberToContactMap = contactList.associateBy { it.phoneNumber }
    print(phoneNumberToContactMap)
// Map with key: phoneNumber and value: Contact
// {
//     +9199XXXX1111=Contact(name=Amit, phoneNumber=+9199XXXX1111),
//     +9199XXXX2222=Contact(name=Ali, phoneNumber=+9199XXXX2222),
//     +9199XXXX3333=Contact(name=Himanshu, phoneNumber=+9199XXXX3333),
//     +9199XXXX4444=Contact(name=Sumit, phoneNumber=+9199XXXX4444)
// }
}
fun findADistinctValue(){
    //Tìm các phần tử riêng biệt trong một collection
    val list = listOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
    println(list.distinct()) // [1, 2, 3, 4]
}
fun findADistinctValueInTwoCollection(){
    //Tìm các phần tử riêng biệt trong hai collection
    val listOne = listOf(1, 2, 3, 3, 4, 5, 6)
    val listTwo = listOf(2, 2, 4, 5, 6, 7, 8)
    println(listOne.union(listTwo)) // [1, 2, 3, 4, 5, 6, 7, 8]
}
fun findASameValueInTwoCollection(){
    val listOne = listOf(1, 2, 3, 3, 4, 5, 6)
    val listTwo = listOf(2, 2, 4, 5, 6, 7, 8)
    println(listOne.intersect(listTwo)) // [2, 4, 5, 6]
}
fun retainItem(){
    //Chỉ giữ các phần tử được chỉ định
    val listOne = mutableListOf(1, 2, 3, 3, 4, 5, 6)
    val listTwo = listOf(1, 2, 3, 3, 4, 5, 6, 7)
    listOne.retainAll(listTwo)
    listOne.forEach{ println(it)}
}
fun splitCollectionByCondition(){
    //Chia collection thành hai phần dựa trên một số điều kiện
    val users = listOf(
        Person(1, "Amit", true, true),
        Person(2, "Ali", true, true),
        Person(3, "Sumit", false, false),
        Person(4, "Himanshu", false, true)
    )

    val (footballLovers, nonFootballLovers) = users.partition { it.isFootballLover }
    println(footballLovers) // [User(id=1, name=Amit, isFootballLover=true), User(id=2, name=Ali, isFootballLover=true)]
    println(nonFootballLovers) // [User(id=3, name=Sumit, isFootballLover=false), User(id=4, name=Himanshu, isFootballLover=false)
}
fun reserveList(){
    //Đảo ngược list
    val list = listOf(1, 2, 3, 4, 5)
    print(list.reversed()) // [5, 4, 3, 2, 1]
    print(list.asReversed()) // [5, 4, 3, 2, 1]
//    Cả hai đều cho cùng một đầu ra nhưng các chức năng này khác nhau.
//
//    reversed() có thể được áp dụng trên Array, List, và MutableList.
//    Nó tạo ra một list mới, ngược lại với list ban đầu.
//
//    Nhưng hàm asReversed() có thể được áp dụng trên List và MutableList.
//    Nó không tạo ra một list mới bởi vì sau khi đảo ngược, các phần tử mới vẫn tham chiếu đến list cũ.
}
fun groupItemInCollection(){
    //Nhóm các phần tử của một collection dựa trên một số điều kiện
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(list.groupBy { it % 4 })
// {
//     1=[1, 5, 9],
//     2=[2, 6, 10],
//     3=[3, 7],
//     0=[4, 8]
// }
}
fun main() {
   splitCollectionByCondition()
}
data class Person(val id: Int, val name: String, val isCricketLover: Boolean, val isFootballLover: Boolean)
data class Contact(val name: String, val phoneNumber: String)
