package iddd.ch01.port.adapter.persistence;

import iddd.ch01.domain.model.customer.Customer;
import iddd.ch01.domain.model.customer.CustomerId;

public class CustomerRepository {

    public Customer customerOfId(CustomerId customerId) {
        return CustomerMemDB.getInstance().find(customerId);

    }

    public Customer register(Customer customer){
        return CustomerMemDB.getInstance().persist(customer);
    }
}
