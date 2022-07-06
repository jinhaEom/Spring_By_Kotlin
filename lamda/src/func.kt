fun main(){
//    val list = mutableListOf(printHello)
//    val func = list[0]
//    func()
//    call(printHello)
    val result : Int= plus(1,3)
    println(result)
}
//val printMessage : (String) -> Unit = {message: String -> println(message)} //줄이면 printMessage2 처럼 사용도 가능
//val printMessage2 : (String) -> Unit = { println(it)}

val plus : (Int,Int) -> Int={ a,b -> a+b}

val printHello :() -> Unit = { println("Hello")}
//val func: () -> String= {""}

//함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit){
    block()
}
fun printNo() = println("No")