package exam01;

public class Ex06 {
    public static void main(String[] args) {
        String str = "ABC";
        str = str.concat("DEF"); // concat : 문자열 결합
        System.out.println(str);

        System.out.println("startsWith - A : " + str.startsWith("A"));
        System.out.println("endsWith - F : " + str.endsWith("F"));

        System.out.println("contains - BCD : " + str.contains("BCD"));

        System.out.println(str.indent(5)); // 들여쓰기
    }
}
