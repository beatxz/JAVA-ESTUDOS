package arrays;

import java.util.ArrayList;

public class EX0026ArrayListItem {
    public static void main(String[] args) {
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item("Beans",25.95,78));
        itens.add(new Item("Rice",69.78,50));
        itens.add(new Item("Bacon",50,90));

        double total=0;

        for(Item item : itens){
            System.out.println("Product: "+item.getName()+" Price: "+item.getPrice()+" Quantity: "+item.getQuantity());
            total += item.getPrice() * item.getQuantity();
        }
            System.out.println("Total purchase value: $"+total);

    }
}
