package builder;

import java.math.BigDecimal;

public class BankAccount {
    private String  name;
    private BigDecimal accountNumber;
    private String email;
    private String newsletter;



    public BankAccountBuilder getBuilder(){
        return new BankAccountBuilder();
    }

    public BankAccount(BankAccountBuilder builder) {
        this.name = builder.name;
        this.accountNumber = builder.account;
    }

    public BankAccount(String name, BigDecimal accountNumber, String email, String newsletter) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.newsletter = newsletter;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(BigDecimal accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }
}
