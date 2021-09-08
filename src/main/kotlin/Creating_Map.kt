
fun creatingImmutableMap(){
    val states = mapOf(
        "HN" to "Hà Nội",
        "DN" to "Đà Nẵng",
        "HCM" to "Tp.Hồ Chí Minh",
        "DL" to "Đà Lạt"
    )
    for (state in states) {
        println("${state.key} is ${state.value}")
    }
    val result = states["HN"]
    println(result)
    val result2 = states.getOrDefault("DN","Unknow")
    println(result2)
    val result3 = states.getOrElse("abc") { "Unknow" }
    println(result3)
}
fun creatingMutableMap(){
    val states = mutableMapOf(
        "HN" to "Hà Nội",
        "DN" to "Đà Nẵng",
        "HCM" to "Tp.Hồ Chí Minh",
        "DL" to "Đà Lạt"
    )
    states["TH"] = "Thanh Hóa"
    states.remove("abc")
    //states["HN"] = "Hà Nam" // key HN sẽ bị override value
    states.putIfAbsent("HN","Hà Nam") // nếu key HN chưa có thì sẽ put vào, nếu ko thì thôi
    states.remove("DL","Đà Lẵng") // Remove đi phần tử có key là DL mà value là Đà Lẵng
    states.getOrPut("NB") { "Ninh Bình" } // Lấy ra phần tử có key là NB, nếu ko có thì sẽ thêm vào

    for (state in states) {
       println("${state.key} is ${state.value}")
    }
}
fun main()
{
    //creatingImmutableMap()
    creatingMutableMap()
}