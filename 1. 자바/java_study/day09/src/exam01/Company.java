package exam01;

public class Company { // 쓸때만 공유할 수 있는 형태로 활성화 -> 싱글턴패턴
    /*
    private static Company instance = new Company(); // 클래스 내부에서 정적 객체 생성
         // => 처음부터 만들어져있기 때문에 완전한 싱글턴패턴은 아니다.
     */

    private static Company instance;

    private Company() {} // 외부에서 객체 생성 못하도록 private 설정(통제)

    public static Company getInstance() { // 정적 메서드 생성
        if(instance == null) { // 객체가 생성되지 않은 경우
            instance = new Company(); // 공유하지만 필요할 때만 생성 => 싱글턴패턴
        }
        return instance;
    }
}
