package exam03;

public class Ex01 {
    public static void main(String[] args) {
        // 202314001
        /*
        int student1 = 202314001;
        int student2 = 202314002;
        int student3 = 202314003;
        //...

        int student100 = 202314100;
         */

        int[] students = new int[100];
        for(int i=0; i<100; i++) {
            students[i] = 202314001 + i;
        }
    }
}
