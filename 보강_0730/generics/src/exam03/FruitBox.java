package exam03;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FruitBox<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> gets() {
        return items;
    }
}
