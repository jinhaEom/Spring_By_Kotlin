## Annotation 정리
--------
### 어노테이션이란?
+ 코드에 부가 정보를 달기 위해 클래스, 함수 ,프로퍼티 선언 앞에 추가하는 구문.
+ 컴파일러에게 코드 문법 에러를 체크하기 위한 정보 제공
+ 개발 Tool이나 Builder에게 코드 자동 추가를 위한 정보 제공
+ 실행 시 특정 기능을 실행하기 위한 정보 제공

- Configuration : configuration class에서 쓰이며, 해당클래스
- Component : 개발자가 직접 작성한 class를 bean으로 등록한다. 'Bean은 Spring IoC 컨테이너가 관리하는 자바객체'
- Entity : DB의 Table과 1:1로 매칭되는 객체단위, Entity 객체의 인스턴스 하나가 테이블에서 하나의 레코드 값을 의미함.
객체의 인스턴스를 구분하기 위한 유일한 키값을 가지는데 이는 Primary key와 같은 의미이고 @Id 어노테이션으로 표기됨
- Table : 맵핑할 Table 지정 
- GeneratedValue : DBMS 종류에 따라 맞춰 자동적으로 값을 JPA에서 생성해 입력해줌
- ManyToOne : N:1 관계를 나타냄
- JoinColumn : 테이블간 연관관계를 설정해 줄때 일대다(1:N) 관계일때 사용
- Column : 객체 필드와 DB 테이블 컬럼을 맵핑
- Enumerated :Entity 매에서 Enum 타입을 사용할때 사용
- ExceptionHandler : Controller 계층에서 발생하는 에러를 잡아서 Method 로 처리해주는 기능 
- RestControllerAdvice : 객체 리턴 가능(@ResponseBody 붙히지 않아도 가능 )
- Service : 해당 클래스가 비즈니스 로직을 담은 Service 클래스임을 명시, @Sevice 어노테이션에 @Component 어노테이션의 
    기능이 포함되어 있고 @Service를 사용함으로써 해당 클래스가 Service의 역할을 하는 것을 명확하게 알 수 있음
- Transactional : 클래스나 메소드에 붙여줄 경우, 해당 범위 내 메서드가 처리(Transaction) 되도록 보장
- RequestMapping :컨트롤러에 URL을 매핑 해줌
- PostMapping : 데이터를 저장할 때 주로 사용 
- GetMapping : 데이터를 조회하거나 짧은 데이터를 전달할때 사용 
- PutMapping : 데이터를 업데이트 할 때 사용
- DeleteMapping : 데이터를 삭제할 때 사용
- ResponseStatus : http 에러가 발생했을 시 상태코드를 의미가 있는 코드로 변환하여 돌려준다. 

- SpringBootApplication : 스프링 부트의 자동설정, 스프링 Bean 일기와 생성을 모두 자동으로 설정(이 어노테이션이 쓰인 위치부터 설정을 읽어가기 때문에 항상 프로젝트 최상단에 위치해야함)
- EnableJpaAuditing - JPA Auditing 어노테이션들이 활성화 될 수 있도록 도와줌 

+ JPA Auditing 이란? 

    Entity는 언제 만들어졌는지, 언제 수정되었는지같은 중요한 정보를 포함함. 모든 Entity에 생성시간, 
        수정시간 필드를 넣어서 생성하는것은 비효율 적이기 때문에 JPA Auditing 사용.
