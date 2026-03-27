package POO.Agregacao.Ex0000.Ex003;

public class CartMain {
    public static void main(String[]args){
        Cart cart = new Cart();
        cart.addProduct(new Product("Mouse",199.90,3));
        cart.addProduct(new Product("Headset",900,2));
        cart.addProduct(new Product("WebCam",1000,7));
        cart.addProduct(new Product("SmartWatch",3500,1));
        cart.addProduct(new Product("Rice",10,10));

        for(Product p : cart.getProducts()){
            System.out.println(p);
        }
        System.out.println("The total value of the cart is: $"+cart.totalCart());
        Product result = cart.searchProduct("Mouse");
        if(result != null){
            System.out.println(result);
        }else{
            System.out.println("Product not found");
        }

    }
}
