package DataAccess;

import java.util.ArrayList;
import java.util.List;



import BusinessLayer.Order;

public class OrderDB {
	List<Order> ordersList = new ArrayList<Order>();
    
    public  List<Order> customerOrder() {
               
           ordersList.add(new Order(1,101,"12/01/2020"));
           ordersList.add(new Order(2,102,"09/31/2020"));
           ordersList.add(new Order(3,103,"05/25/2020"));
           return ordersList;
       }
   
    public  List<Order> getAllOrders() {
           return ordersList;
       }

}
