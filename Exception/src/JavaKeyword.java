import java.io.InputStream;

public class JavaKeyword {
    private InputStream in;    //kotlin에서 is 나 in 을 바로  호출하면 오류 발생

    private Boolean is;

    public InputStream getIn() { return in;}
    public void setIn(InputStream in) { this.in = in;}

    public Boolean getIs() { return is;}

    public void setIs(Boolean is) { this.is= is;}
}
enum countryCodeJava{
    kr, jp, us, ;
}