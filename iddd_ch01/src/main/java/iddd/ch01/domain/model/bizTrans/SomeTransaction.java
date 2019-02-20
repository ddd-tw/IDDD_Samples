package iddd.ch01.domain.model.bizTrans;

import iddd.ch01.domain.model.customer.Customer;
import iddd.ch01.port.adapter.persistence.CustomerRepository;

public class SomeTransaction {


    private CustomerRepository customerRepository;

    public void changeCustomerPersonalName(String customerId, String customerFirstName, String customerLastName){

        Customer customer = customerRepository.customerOfId(customerId);

        if(customer ==null){
            throw new IllegalStateException("Customer does not exist,");
        }

        customer.changePersonalName(customerFirstName,customerLastName);
    }


}
