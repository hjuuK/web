package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        //ArrayList<String> names = new ArrayList<>();
        //LinkedList<String> names = new LinkedList<>();
        //List<String> names = new LinkedList<>();
        List<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        Iterator<String> iter = names.iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }
        System.out.println("-------------------------------");

        iter = names.listIterator(); // 재생성
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }

        /*
        for (int i=0; i<names.size(); i++) { // 효율성 떨어짐(ArrayList에서)
            names.remove(i);
        }
         */
        /*
        for (int i= names.size()-1; i>=0; i--) { // ArrayList는 삭제를 효율적으로 하기 위해서는 끝부터 삭제(추가도 마찬가지)
            names.remove(i);
        } 

        for (String name : names) {
            System.out.println(name);
        }
         */
    }
}
