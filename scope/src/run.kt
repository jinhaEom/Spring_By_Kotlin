class DatabaseClient{
    var url: String? =null
    var username: String? = null
    var password : String? = null

    //DB에 접속하고 boolean 결과 반환
    fun connect(): Boolean{
        println("DB 접속중...")
        Thread.sleep(1000)
        println("DB 접속완료")
        return true
    }
}
fun main() {
    /*val config = DatabaseClient()
    config.url = "localhost:3306"
    config.username = "mysql"
    config.password = "1234"
    val connected = config.connect()*/
    val connected = DatabaseClient().run {
        url = "localhost:3306" //수신자 객체에 대한 참조를 자동으로 해주기때문에 this.  을 사용해도되고 안해도 됨
        username = "mysql"
        password = "1234"
        connect()
    }
    println(connected)
}