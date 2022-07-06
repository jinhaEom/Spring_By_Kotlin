fun getStr(): Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {
//    val result = try{
//        getStr()
//    }catch(e:Exception){
//        println(e.message)
//        "기본값"
//    }

//    val result = runCatching { getStr() }
//        .getOrElse {
//            println(it.message)
//            "기본값"
//        }
        // .getOrNull()  // 실패가 발생했을때 null을 반환

//    val result = runCatching { getStr() }
//        .getOrDefault("기본값")
//    val result : String = runCatching { "안녕" }
//        .map{
//            "${it}하세요"
//        }.getOrThrow()

//    val result = runCatching { "안녕" }
//        .mapCatching{
//            throw Exception("예외")
//        }.getOrDefault("기본값")
//    println(result)

    val result = runCatching { "정상" }
        .recover { "복구" }  //성공시에는 동작하지 않고 실패시에 동작 함.
        .getOrNull()

    println(result)
}