class JvmFieldClass {

    companion object{
        val id = 1234

        const val CODE = 1234
    }
}

object JvmFieldObject{
    val name = "tony"

    const val FAMILY_NAME = "jina"

}

fun main() {

    val id= JvmFieldClass.id

    val name = JvmFieldObject.name
}