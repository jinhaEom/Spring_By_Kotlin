fun String.first() : Char{
    return this[0]

}

fun String.addFirst(char:Char) : String{
    return char + this.substring(0)
}

class MyExample{
    fun printMessage() = println("클래스 출력")   ///멤버가 우선으로 실행됨
}

fun MyExample.printMessage() = println("확장 출력") // 후순위

fun MyExample?.printNullOrNotNull(){
    if(this == null) println("null 인 경우에만 출력")
    else println("null이 아닌 경우에만 출력")
}

fun main(){
    var myExample : MyExample?= null
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()

//    println("ABCD".first())
//
//    println("ABCD".addFirst('Z'))
}