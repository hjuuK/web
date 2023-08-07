package exam01;

public class Outer2 {

    public Calculator cal = new Calculator() {
        public int add(int num1, int num2){
            return num1+num2;
        }
    };

    public Calculator method(int num3) {

        // Calculator cal - 생성된 객체의 주소
        // Calculator 객체 - 힙에 생성이 되어 있다.
        // int num3은 지역변수이나 지역 내부 클래스의 메서드에서 사용되면 제거 X
        // 값을 유지해야 정상적인 연산이 가능 하기 때문
        // num3 변수가 제거 되지 않는 형태로 변경 - 지역변수의 상수화(final)
        
        //Calculator cal = new Calculator(){
        return new Calculator(){
            public int add(int num1, int num2){
                //num3 *= num3; // final int num3 -> 상수로 변경된 상태이므로 값의 변경이 불가

                return num1+num2+num3;  // int num3 => 데이터메모리로 옮김 -> 상수화
            }
        };

        //return cal;

        //int result = cal.add(10,20);
        //System.out.println(result);
        
        // 연산 종료 - cal - 스택에서 제거
        // Calculator 객체 - GC(가비지 콜렉터)에 의해서 힙에서 제거
    }
}
