package exam03;

public class Ex04 {
    public static void main(String[] args) {
        //int[] nums = new int[] {10,20,30,40}; // 배열 선언과 동시에 초기화
        //int[] nums = {10,20,30,40};
        int[] nums;
        //nums = {10,20,30,40};
        nums = new int[] {10,20,30,40};

        for(int i=0; i<=3; i++) {
            System.out.println(nums[i]);
        }
    }
}
