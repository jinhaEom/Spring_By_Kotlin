public class JvmStaticExample {

    public static void main(String[] args){
    /*    String hello = HelloClass.Companion.hello();

       String hi =  HiObject.INSTANCE.hi();*/    //@JVMStatic을 사용했기 때문에 바로 사용 가능

        HelloClass.hello();
        HiObject.hi();
    }
}
