package org.ies.tierno.bank;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private final String iban;
    private final String nif;
    private BigDecimal balance;

    public Account(String iban, String nif, BigDecimal balance) {
        this.iban = Objects.requireNonNull(iban, "iban must not be null");
        this.nif = Objects.requireNonNull(nif, "nif must not be null");
        this.balance = Objects.requireNonNull(balance, "balance must not be null");
    }

    public String getIban() {
        return iban;
    }

    public String getNif() {
        return nif;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = Objects.requireNonNull(balance, "balance must not be null");
    }
}
