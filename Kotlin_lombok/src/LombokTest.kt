fun main() {
   /* val hero = Hero()

    hero.name="아이언맨"
    println(hero.name)    //-> cannot access name Error ,자바파일에서 main() 안에 내용 삭제시 정상 작동*/


    val hero = Hero(name = "아이언맨", age=50, address="스타크타워")
    println(hero)

}