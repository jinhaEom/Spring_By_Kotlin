class MyGenerics<out T>(val t:T) { //<T> 는 TypeParameter

}
class Bag<T> {
    fun saveAll(
        to:MutableList<in T>,
        from: MutableList<T>,
    ){
        to.addAll(from) // from List와 To List 결합
    }

}
fun main(){
    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1","2"), mutableListOf<String>("3","4"))

    // 제네릭을 사용한 클래스의 인스턴스를 만드려면 타입 아규먼트를 제공
/*
    val generics = MyGenerics<String>("Test")
    <String> 생략 가능
*/
/*    val generics = MyGenerics<String>("테스트")

    val charGenerics : MyGenerics<CharSequence> = generics*/

    /*//변수의 타입에 제네릭을 사용한 경우
    val list1 : MutableList<String> = mutableListOf()
    // 타입아규먼트를 생성자에서 추가
    val list2 = mutableListOf<String>()

    val list3: List<*> = listOf<String>("테스트")
    val list4: List<*> = listOf<Int>(1,2,3,4)*/
    // 정확한 타입을 모르는 경우에도 제네릭함수 사용 가능.

    //PECS 규칙 (producer - Extends , Consumer-super)
    // 공변성은 자바 제네릭의 extends 코틀린에선 out
    // 반공변성은 자바 제네릭에선 super 코틀린에선 in

}