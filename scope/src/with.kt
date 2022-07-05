
//결과 반환없이 내부에서 수신 객체를 이용해서 다른 함수를 호출하고 싶을때 사용

fun main(){
    val str = "안녕하세요"
    /*with(str){
        println("length=$length")
    }*/
    val length : Int= with(str){
        length
    }
    println(length)
}
