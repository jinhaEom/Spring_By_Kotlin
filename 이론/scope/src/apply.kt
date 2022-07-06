fun main(){
    val client: DatabaseClient= DatabaseClient().apply{
        this.url = "localhost:3306"
        this.username= "mysql"
        this.password = "1234"
        connect()
    }
    println(client)
}