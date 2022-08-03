public class JvmFieldExample {

    public static void main(String[] args){
        JvmFieldClass.Companion.getId();

        JvmFieldObject.INSTANCE.getName();

        //상수의 경우 직접접근 가능
         int code = JvmFieldClass.CODE;
         String familyName = JvmFieldObject.FAMILY_NAME;
    }
}
