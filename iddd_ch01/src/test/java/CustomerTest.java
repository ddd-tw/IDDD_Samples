import iddd.ch01.domain.model.FieldCustomer;
import iddd.ch01.domain.model.customer.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {


    @Test
    public void changePersonalName(){


        Customer customer = new FieldCustomer();
        customer.changePersonalName("Kim", "Kao");
        assertEquals(customer.personalName(),"Kim Kao");
    }
}
