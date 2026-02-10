package Service;

import model.Product;
import util.FileUtil;

import java.util.*;

public class InventoryService implements InventoryOperations{

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
        FileUtil.saveProducts(productList);
    }

    public void updateProduct(int id,int newStock){
        for(Product p: productList){
            if(p.getId()==id){
                p.setStock(newStock);
                break;
            }
        }
        FileUtil.saveProducts(productList);
    }
    public void viewProducts(){
        for(Product p : productList){
            System.out.println(p);
        }
    }

    public void placeOrder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Quantity: ");
        int qty = sc.nextInt();

        for(Product p: productList){
            if(p.getId()==id && p.getStock() >= qty){
                p.reduceStock(qty);
                System.out.println(qty+" "+p.getName()+" added successfully.");
                break;
            }
        }
        FileUtil.saveProducts(productList);
    }

}
