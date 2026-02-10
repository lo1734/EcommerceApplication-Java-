import model.*;
import Service.*;

public class Main {
    public static void main(String[] args){

        InventoryService service = new InventoryService();
        Category ele = new Category(1,"Electronics");

        Product p1 = new Product(100, "Laptop", ele, 20000, 20);
        Product p2 = new Product(101, "Monitor", ele, 12000,20);

        service.addProduct(p1);
        service.addProduct(p2);

        service.viewProducts();
        service.placeOrder();
    }

}