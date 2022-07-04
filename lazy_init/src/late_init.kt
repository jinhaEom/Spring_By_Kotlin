/*
* isIinitialized -> 클래스 내부에서만 사용 가능
*
* */


class late_init {
lateinit var text :String
fun printText(){
    text= "안녕하세요" //초기화가 먼저 되어야 함
    println(text)
}
}
fun main(){
    val test = late_init()
    test.printText()
}
