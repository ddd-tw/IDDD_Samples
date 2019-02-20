package iddd.ch01.domain.model.customer;

public class CustomerId {
    private String value;
    protected CustomerId(String value){

        if(value==null){
            throw new IllegalStateException("CustomerId shouldn't be empty.");
        }

        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }
}
