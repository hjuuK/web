package exam01;

public class Ex07 {
    public static void main(String[] args) {
        String str1 = "ABC"; // 문자열 상수
        String str2 = "ABC"; // str1, str2 는 동일한 객체이기 때문에 주소가 같음

        System.out.println(str1 == str2);
        System.out.println("str1 : " + System.identityHashCode(str1));
        System.out.println("str2 : " + System.identityHashCode(str2));


    }
}
