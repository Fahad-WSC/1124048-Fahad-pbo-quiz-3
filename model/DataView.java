package model;

import java.util.ArrayList;
import java.util.List;

public class DataView<T> {
    private List<T> records;

    public DataView() {
        this.records = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // Contoh Generic Method dengan Wildcard
    public static void printItemDetails(List<?> list) {
        for (Object obj : list) {
            System.out.println("• " + obj.toString());
        }
    }
}