package exam02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>();
        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");

        members.put("user02", "(수정)사용자02"); // 있는 키 값에 대입하면 교체됨
        
        //members.remove("user02"); // key값을 이용하여 제거

        //String userNm = members.get("user02"); // user02로 조회
        //System.out.println(userNm);

        for (Map.Entry<String, String> entry : members.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key, value);
        }

        for (String key : members.keySet()) {
            String value = members.get(key);
            System.out.printf("key=%s, value=%s%n", key, value);
        }

        /*
        Set<Map.Entry<String, String>> entrySet = members.entrySet();
        Iterator<Map.Entry<String, String>> iter = entrySet.iterator();

        while(iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            // getKey(), getValue()
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key, value);
        }
         */
    }
}
