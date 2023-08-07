package exam04;

public class Outer {
    public Calculator method(int num3) {
        //Calculator cal = new Calculator() {
        return new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2 + num3;
                // num3 -> 상수화 / final int num3 // 지역 변수이기 때문에 스택 메모리에 있어야하는것이 맞지만 스택에 있으면 제거되기 때문에 상수화하여 데이터 영역 메모리에 저장
            }
        };

       // return cal;

//        int result = cal.add(10, 20);
//        System.out.println(result);
    }
}
