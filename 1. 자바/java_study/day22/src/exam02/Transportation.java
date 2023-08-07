package exam02;

public enum Transportation {
    BUS(1250) {
        @Override
        public String getName() {
            return "버스";
        }
    }, // public static final
    SUBWAY(1250) {
        @Override
        public String getName() {
            return "지하철";
        }
    },
    TAXI(4000) {
        @Override
        public String getName() {
            return "택시";
        }
    };

    /*
    Transportation() { // 생성자 정의 가능 / public은 안됨 / 전부 private

    }
     */

    private int fare;

    Transportation(int fare) {
        this.fare = fare;
    }

    public int getTotal(int personNum) {
        return fare * personNum;
    }

    public abstract String getName(); // Enum클래스는 추상 클래스이다.
}
