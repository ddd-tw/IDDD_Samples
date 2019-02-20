import iddd.ch01.domain.model.FieldCustomer;
import iddd.ch01.domain.model.customer.Customer;
import iddd.ch01.domain.model.customer.CustomerId;
import iddd.ch01.port.adapter.persistence.CustomerRepository;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {


    @Test
    public void changePersonalName(){

        //Arrange
        String lastName = "World";
        String firstName ="hello";
        Customer customer = new FieldCustomer(firstName,lastName);
        CustomerId customerId = customer.displayCustomerId();

        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.register(customer);

        //Act

        Customer fetchedCustomer = customerRepository.customerOfId(customerId);
        customer.changePersonalName("Kim", "Kao");

        //Assert
        assertEquals(fetchedCustomer.personalName(),"Kim Kao");
    }
}
