import javax.print.attribute.standard.MediaSize

sealed class Developer{
    abstract val name : String
    abstract fun code(language : String)
}
data class BackendDeveloper(override val name : String): Developer(){
    override fun code(language: String) {
        println("저는 백엔드 개발자 입니다. ${language}를 사용합니다.")
    }
}
data class FrontendDeveloper(override val name:String): Developer(){
    override fun code(language: String) {
        println("저는 프론트엔드 개발자 입니다. ${language}를 사용합니다.")

    }
}
object OtherDeveloper : Developer() {
    override val name : String = "익명"
    override fun code(language: String) {
        TODO("Not yet implemented")
    }
}
object DeveloperPool{
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer){
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자v   종류입니다.")

    }
    fun get(name:String) = pool[name]
}
fun main(){
    val backendDeveloper = BackendDeveloper(name="토니")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name="제임스")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("토니"))
}
/*
* sealed클래스로 작성이 된 상위클래스는 하위클래스에서 컴파일러가
*
*
 */