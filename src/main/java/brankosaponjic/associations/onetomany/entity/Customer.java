package brankosaponjic.associations.onetomany.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    // by default is LAZY
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<PhoneNumber> numbers;

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (phoneNumber != null) {
            if (numbers == null) {
                numbers = new HashSet<>();
            }
            phoneNumber.setCustomer(this);
            numbers.add(phoneNumber);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PhoneNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<PhoneNumber> numbers) {
        this.numbers = numbers;
    }
}