package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        order.sell();
        order.buy();

        order.order();

        /*
        Buy buy = order; // 다형성
        buy.buy();

        Sell sell = order;
        sell.sell();
         */
    }
}
