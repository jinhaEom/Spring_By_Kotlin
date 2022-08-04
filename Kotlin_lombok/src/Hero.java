import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Hero {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int age;

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public static void main(String[] args) {
       /* Hero hero = new Hero();
        hero.setName("아이언맨");
        hero.setAge(53);
        hero.setAddress("스타크타워");*/
    }
}

//lombok -> 데이터관련 클래스(DTO)에서 쓰이는 경우가 많음.

