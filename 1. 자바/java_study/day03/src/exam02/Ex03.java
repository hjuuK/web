package exam02;

public class Ex03 {
    public static void main(String[] args) {
        int rank = 1;

        switch(rank){
            case 1:
                System.out.println("금메달!!!");
                break;
            case 2:
                System.out.println("은메달!!");
                break;
            case 3:
                System.out.println("동메달!");
                break;
            default:
                System.out.println("3위 안에 들지 못하셨습니다.");
        }
    }
}
