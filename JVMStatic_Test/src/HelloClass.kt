class HelloClass {

    companion object{
        @JvmStatic // 자바와 상호운용하는 경우 사용
        fun hello()= "hello!"
    }
}

object HiObject{

    @JvmStatic
    fun hi()= "hi"
}
fun main(){
    val hello = HelloClass.hello()
    val hi = HiObject.hi()
}