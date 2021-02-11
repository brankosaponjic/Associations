package brankosaponjic.associations;

import brankosaponjic.associations.onetomany.entity.Customer;
import brankosaponjic.associations.onetomany.entity.PhoneNumber;
import brankosaponjic.associations.onetomany.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AssociationsApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setName("Paolo Rossi");

        PhoneNumber pn1 = new PhoneNumber();
        pn1.setNumber("+3486590982");
        pn1.setType("cell");

        PhoneNumber pn2 = new PhoneNumber();
        pn2.setNumber("+6491903933");
        pn2.setType("office");

        customer.addPhoneNumber(pn1);
        customer.addPhoneNumber(pn2);

        customerRepository.save(customer);
    }
}