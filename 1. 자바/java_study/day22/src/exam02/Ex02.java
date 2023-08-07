package exam02;

import static exam02.Transportation.*;

public class Ex02 {
    public static void main(String[] args) {
        //Transportation trans = Transportation.BUS;
        Transportation trans = BUS; // import static exam02.Transportation.*; 했을 때
        System.out.println(BUS instanceof Transportation);

        //Transportation trans2 = Transportation.valueOf("BUS");

        //System.out.println(trans == trans2); // 주소 비교 == 참

        switch (trans) {
            case BUS :
                System.out.println("버스!");
                break;
            case SUBWAY:
                System.out.println("지하철1");
                break;
            case TAXI:
                System.out.println("택시!");
                break;
        }
    }
}
