package org.ies.tierno.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Bank {
    private final String name;
    private final List<Customer> customers;

    public Bank(String name) {
        this.name = Objects.requireNonNull(name, "name must not be null");
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }

    public void addCustomer(Customer customer) {
        Objects.requireNonNull(customer, "customer must not be null");
        customers.add(customer);
    }
}
