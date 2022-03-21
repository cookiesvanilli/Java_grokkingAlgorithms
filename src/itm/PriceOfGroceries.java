package itm;

import java.util.HashMap;
import java.util.Map;

// HashTables

public class PriceOfGroceries {
    public static void main(String[] args) {
        Map<String, Double> book = new HashMap<>();

        book.put("apple", 0.67);
        book.put("milk", 1.49);
        book.put("avocado", 1.49);

        System.out.println(book); // {apple=0.67, avocado=1.49, milk=1.49}
    }
}
