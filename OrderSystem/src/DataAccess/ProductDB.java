package DataAccess;

import java.util.ArrayList;
import java.util.List;

import BusinessLayer.Product;


public class ProductDB {
List<Product> productList = new ArrayList<Product>();
    
    public  List<Product> products() {
                
            productList.add(new Product(22,"secure item",2,2500));
            productList.add(new Product(33,"handle with care",3,1899));
            productList.add(new Product(44,"handle with care",4,5000));
            return productList;
        }
    
    public  List<Product> getAllProducts() {
            return productList;
        }
}
