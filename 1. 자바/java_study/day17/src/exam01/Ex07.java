package exam01;

public class Ex07 {
    public static void main(String[] args) {
        String fruits = "Apple,Orange,Mango,Melon,Apple";
        int index = fruits.indexOf("Apple"); // 왼쪽 -> 오른쪽
        System.out.println("indexOf : " + index);

        int index2 = fruits.lastIndexOf("Apple"); // 오른쪽 -> 왼쪽
        System.out.println("lastIndexOf : " + index2);
        
        /*
        int index = fruits.indexOf("Mango"); // 시작하는 위치
        System.out.println(index);

        int index2 = fruits.indexOf("Mango2"); // 없는 단어 -1 반환
        System.out.println(index2); // -1
         */
    }
}
