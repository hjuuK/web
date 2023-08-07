package exam01;

public class Ex08 {
    public static void main(String[] args) {
        String str = "";
        System.out.println("isEmpty : " + str.isEmpty()); // true // 공백은 false

        String str2 = "    "; // 공백
        System.out.println("isBlank : " + str2.isBlank()); // true // 공백 체크
        System.out.println("trim().isEmpty() : " + str2.trim().isEmpty());

        String str3 = "      ABC          ";
        System.out.println("trim() : " + str3.trim()); // 좌우 공백 제거
    }
}
