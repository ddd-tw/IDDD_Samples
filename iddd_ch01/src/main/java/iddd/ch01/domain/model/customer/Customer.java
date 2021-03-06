package iddd.ch01.domain.model.customer;

public interface Customer {

    public Customer registerCustomer(String firstName, String lastName);
    public void changePersonalName(String firstName, String lastName);
    public void postalAddress(PostalAddress postalAddress);
    public void relocateTo(PostalAddress changedPostalAddress);
    public void changeHomeTelephone(Telephone telephone);
    public void disconnectHomeTelephone();
    public void changeMobileTelephone(Telephone telephone);
    public void disconnectMobileTelephone();
    public void primaryEmailAddress(EmailAddress emailAddress);
    public void secondaryEmailAddress(EmailAddress Address);
    public String personalName();

    public CustomerId displayCustomerId();
}
