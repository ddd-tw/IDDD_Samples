package solid.humank.dddch01;

public class CustomerDao {
    public solid.humank.dddch01.Customer readCustomer(String customerId) {

        //sudo code, imagine this method call is going to fetch data from database
        return new Customer("DEFAULT");
    }

    public void saveCustomer(Customer customer) {
        // let's say save it in memory
    }
}
