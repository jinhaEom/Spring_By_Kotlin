/*
*LazyThreadSafetyMode.None -> 초기화횟수 랜덤
*
 */

class HelloBot {

    val greeting: String by lazy {
        println("초기화 로직 수행")
        getHello()
    } //불변을 유지하면서 변수를 사용하는 시점에 1회 초기화 할 수 있도록 해줌.

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    for (i in 1..5) {
        Thread {
            helloBot.sayHello()

        }.start()
    }
}