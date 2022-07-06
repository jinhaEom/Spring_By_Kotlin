fun main() {
    val str: String? = "Hello"
    val result: Int? = str?.let {
        println(it)

        val abc : String? = "abc"
        val def : String? = "def"
        if(!abc.isNullOrEmpty() && !def.isNullOrEmpty()){
            println("abcdef가 null 이 아님")
        }

        1234   //마지막에 들어오는 값을 리턴값으로 인식식
    }
}

//let은 null이 아닌 경우에만 활용 가능