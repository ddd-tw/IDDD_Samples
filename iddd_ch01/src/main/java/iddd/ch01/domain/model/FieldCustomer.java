package iddd.ch01.domain.model;

import iddd.ch01.domain.model.customer.*;

public class FieldCustomer implements Customer {

    private String firstName;
    private String lastName;
    private CustomerId customerId;

    public FieldCustomer(String firstName, String lastName) {
        this.firstName =firstName;
        this.lastName = lastName;
        customerId = CustomerIdGenerator.generate();
    }

    @Override
    public Customer registerCustomer(String firstName, String lastName) {
        return new FieldCustomer(firstName,lastName);
    }

    @Override
    public void changePersonalName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void postalAddress(PostalAddress postalAddress) {

    }

    @Override
    public void relocateTo(PostalAddress changedPostalAddress) {

    }

    @Override
    public void changeHomeTelephone(Telephone telephone) {

    }

    @Override
    public void disconnectHomeTelephone() {

    }

    @Override
    public void changeMobileTelephone(Telephone telephone) {

    }

    @Override
    public void disconnectMobileTelephone() {

    }

    @Override
    public void primaryEmailAddress(EmailAddress emailAddress) {

    }

    @Override
    public void secondaryEmailAddress(EmailAddress Address) {

    }

    @Override
    public String personalName() {
        return firstName.concat(" ").concat(lastName);
    }

    @Override
    public CustomerId displayCustomerId() {
        return customerId;
    }
}
