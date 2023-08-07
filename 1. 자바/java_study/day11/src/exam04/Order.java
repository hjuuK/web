package exam04;

public class Order implements Buy, Sell {
    public void buy() {
        System.out.println("구매!");
    }

    public void sell() {
        System.out.println("판매!");
    }
}
