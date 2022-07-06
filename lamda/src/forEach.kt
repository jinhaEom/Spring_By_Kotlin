fun main(){
    val list = listOf("a","b","c")
    val printStr : (String) -> Unit= {println(it)}
//    forEachStr(list,printStr)
//    val upperCase : (String) -> String = {it.uppercase()}
//
//    println(list.map(upperCase))
    val func = outerFunc()
    func()

}

//람다표현식의 전체 표현식
val sum1 : (Int,Int) -> Int = {x:Int, y:Int -> x+y}

//최대한 생략한 람다식
val sum2 = {x:Int, y:Int -> x+y}

fun outerFunc() :() -> Unit= { println("익명 함수")}

fun forEachStr(collection: Collection<String>, action: (String) -> Unit){
    for (item in collection){
        action(item)
    }
}