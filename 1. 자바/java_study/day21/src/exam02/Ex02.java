package exam02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex02 {
    public static void main(String[] args) {
        //Map<String, String> members = new TreeMap<>();
        Map<String, String> members = new TreeMap<>(Comparator.reverseOrder()); // 역순 // Comparator 구현 객체
        members.put("user03", "사용자03");
        members.put("user01", "사용자01");
        members.put("user02", "사용자02");

        for (Map.Entry<String, String> entry : members.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key, value);
        }
    }
}
