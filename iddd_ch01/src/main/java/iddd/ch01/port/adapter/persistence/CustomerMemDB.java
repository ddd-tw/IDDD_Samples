package iddd.ch01.port.adapter.persistence;

import iddd.ch01.domain.model.customer.Customer;
import iddd.ch01.domain.model.customer.CustomerId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerMemDB implements Serializable {

    private static List<Customer> customerLists = new ArrayList<>();

    private CustomerMemDB(){
    }

    private static class SingletonHelper{
        private static final CustomerMemDB instance = new CustomerMemDB();
    }

    public static CustomerMemDB getInstance(){
        return SingletonHelper.instance;
    }

    protected Customer persist(Customer customer){
        Customer target = find(customer.displayCustomerId());
        if(target==null){
            customerLists.add(customer);
        }else{
            customerLists.remove(target);
            customerLists.add(customer);
        }
        return customer;
    }

    protected Customer find(CustomerId customerId) {

        Customer target = customerLists.stream()
                .filter(customer -> customerId.equals(customer.displayCustomerId()))
                .findAny()
                .orElse(null);

        return target;
    }
}
