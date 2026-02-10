package model;
import java.util.*;

public class Order {
    private int orderid;
    private model.Customer customer;
    private List<model.Product> products;

    public Order(int orderid, model.Customer customer, List<model.Product> products){
        this.orderid=orderid;
        this.customer=customer;
        this.products=products;
    }

    public double calculateTotal(){
        double total = 0;
        for(model.Product p: products){
            total+=p.getPrice();
        }
        return total;
    }
    public List<model.Product> getProducts(){
        return products;
    }
}
