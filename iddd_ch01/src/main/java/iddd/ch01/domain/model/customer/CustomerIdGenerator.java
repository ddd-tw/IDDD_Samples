package iddd.ch01.domain.model.customer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerIdGenerator {
    public static CustomerId generate() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String uniqueId = now.format(formatter);
        return new CustomerId(uniqueId);
    }
}
