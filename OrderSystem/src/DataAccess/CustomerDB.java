package DataAccess;

import java.util.ArrayList;
import java.util.List;


import BusinessLayer.Customer;

public class CustomerDB {
	 List<Customer> customerList = new ArrayList<Customer>();
     
     
     
     
     
     public  List<Customer> createCustomer() {
         customerList.add(new Customer(101, "Gopal", "Tadivaka", "6207190139"));
         customerList.add(new Customer(102, "Naga", "Tadivaka", "9492469649"));
         customerList.add(new Customer(103, "Harika", "Tadivaka", "8340804878"));
         return customerList;
     }
     
     public  List<Customer> getAllCustomers() {
         return customerList;
     }

}
