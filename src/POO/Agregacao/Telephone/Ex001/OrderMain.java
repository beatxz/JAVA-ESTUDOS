package POO.Agregacao.Telephone.Ex001;

import java.util.ArrayList;

public class OrderMain {
    public static void main(String[]args){
        Order order = new Order();
        order.addItem(new Item("Bean",15.90,7));
        order.addItem(new Item("Pizza",12.90,7));
        order.addItem(new Item("Cheese",12.90,7));

        System.out.println("The total value of the products were: $"+order.totalItem());


    }
}
