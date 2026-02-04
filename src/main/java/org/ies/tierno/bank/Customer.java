package org.ies.tierno.bank;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Customer {
    private final String nif;
    private final String name;
    private final String surname;
    private final String zipCode;
    private final Map<String, Account> accountsByIban;

    public Customer(String nif, String name, String surname, String zipCode) {
        this.nif = Objects.requireNonNull(nif, "nif must not be null");
        this.name = Objects.requireNonNull(name, "name must not be null");
        this.surname = Objects.requireNonNull(surname, "surname must not be null");
        this.zipCode = Objects.requireNonNull(zipCode, "zipCode must not be null");
        this.accountsByIban = new LinkedHashMap<>();
    }

    public String getNif() {
        return nif;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Map<String, Account> getAccountsByIban() {
        return Collections.unmodifiableMap(accountsByIban);
    }

    public void addAccount(Account account) {
        Objects.requireNonNull(account, "account must not be null");
        accountsByIban.put(account.getIban(), account);
    }
}
