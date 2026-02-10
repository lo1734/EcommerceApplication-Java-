package util;

import model.Product;
import java.io.*;
import java.util.*;

public class FileUtil {

    private static final String FILE_NAME = "products.csv";

    public static void saveProducts(List<Product> productList){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
            for(Product p: productList){
                writer.write(p.toString());
                writer.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
