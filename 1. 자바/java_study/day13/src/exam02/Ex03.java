package exam02;

public class Ex03 {
    public static void main(String[] args) {
        try {
            String str = null;
            //String str = "abc";
            str = str.toUpperCase(); // throw new NullPointerException(....);

            // str null 이면 절대로 실행되면 안되는 코드
            System.out.println("str 값이 반드시 있어야 정상 실행되는 소스");
        } catch (NullPointerException e) { // NullPointerException e = new NullPointerException(...)
            //System.out.println("적절한 예외 처리...");
            //String message = e.getMessage();
            //System.out.println(message);
            e.printStackTrace();
        }

        System.out.println("매우 중요한 코드!!");
        
    }
}
