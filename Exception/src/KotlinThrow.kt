import java.io.IOException
import kotlin.jvm.Throws

class KotlinThrow {

    @Throws(IOException::class)  //코틀린에서 자바와 상호작용을 위한 Throws (IOException try Catch 문)
    fun throwIOException() {
        throw IOException("Checked Exception 인 IOException 발생")
    }
}
fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

     val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}