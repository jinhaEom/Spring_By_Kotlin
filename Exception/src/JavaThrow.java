import java.io.IOException;

public class JavaThrow {

    public void throwIOException() throws IOException{
        throw new IOException("Checked Exception 인 IOException 발생");
    }
    public static void main(String[] args){
        JavaThrow javaThrow = new JavaThrow();

   /*     try{
            javaThrow.throwIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        KotlinThrow kotlinThrow = new KotlinThrow();
        kotlinThrow.throwIOException();
    }
}
