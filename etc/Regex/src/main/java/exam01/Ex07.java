package exam01;

public class Ex07 {
    public static void main(String[] args) {
        String fruits = "Apple,Orange,Melon,Banana";
        if (fruits.matches(".*(Orange|Melon).*")) { // 둘 중에 하나라도 포함되어 있으면 참 // .* (그룹화) .*
            System.out.println("포함!");
        }
    }
}
