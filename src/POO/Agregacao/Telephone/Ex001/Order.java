package POO.Agregacao.Telephone.Ex001;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> itens = new ArrayList<Item>();

    public void addItem(Item item){
        itens.add(item);
    }
    public double totalItem(){
        double total = 0;
        for(Item item : itens){
        total += item.total();}
        return total;
    }
}
