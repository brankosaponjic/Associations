package brankosaponjic.associations.onetomany.repository;

import brankosaponjic.associations.onetomany.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
