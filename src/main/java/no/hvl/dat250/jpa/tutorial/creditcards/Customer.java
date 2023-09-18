package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    private Set<Address> addresses = new HashSet<>();
    @ManyToMany
    private Set<CreditCard> creditCards = new HashSet<>();

    public Customer(){

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddress(Address address) {
        addresses.add(address);
    }

    public void setCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
    }

    public Collection<CreditCard> getCreditCards() {
        return creditCards;
    }
}

