package builder;

import java.math.BigDecimal;

public class BankAccountBuilder {
    public  String name;
    public BigDecimal account;
    public String email;
    public boolean newsletter;

    BankAccountBuilder  newEmail(String email){
        this.email = email;
        return this;
    }

    BankAccountBuilder  newAccount(BigDecimal account){
        this.account = account;
        return this;
    }

    BankAccount build(){
        return new BankAccount(this);
    }

}
