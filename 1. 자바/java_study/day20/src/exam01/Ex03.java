package exam01;

import java.util.Vector;

public class Ex03 {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>(5); // 5개의 공간
        System.out.println(nums.capacity());
        for (int i=0; i<5; i++) {
            nums.add(i);
        }

        System.out.println(nums.capacity());
        
        nums.add(5); // 6개째 추가 - 5: 기존 배열 버리고 새로 두배로 키워서 생성
        System.out.println(nums.capacity()); // 10 // 공간이 두배가 됨
    }
}
