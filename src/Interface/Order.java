package Interface;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> itens = new ArrayList<>();

    public void addItem(Item item) {
        itens.add(item);
    }

    public double totalOrder() {
        double total = 0;
        for (Item item : itens) {
            total += item.total();}

            return total;

    }
}
