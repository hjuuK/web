package exam03;

public class Ex02 {
    public static void main(String[] args) {
        int num = 1, total = 0;
        while(num<=100){
            total += num++;
        }
        System.out.printf("총합=%d%n",total);
        
        // int num - 초기값, num <= 100 - 조건식, num++ - 증가식
    }
}
