package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        names.stream().forEach(System.out::println);

        System.out.println("--------------------------------");

        Iterator<String> iter = names.iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        } // 커서가 뒤로 이동하여 반복 X

        System.out.println("--------------------------------");
        iter = names.iterator(); // iterator 재생성
        
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }
    }
}
