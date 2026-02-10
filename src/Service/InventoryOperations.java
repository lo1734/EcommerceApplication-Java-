package Service;
import model.Product;

 public interface InventoryOperations {

     void addProduct(Product product);

     void updateProduct(int id,int newStock);

     void viewProducts();

     void placeOrder();
}

