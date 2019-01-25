package builderPatternwithFunction;

import java.util.function.Consumer;

public  class AddressBuilder {

    public String city;
    public String state;
    public String  pin;

    public AddressBuilder   with(Consumer<AddressBuilder>  builderFunction){
        builderFunction.accept(this);
        return  this;
    }


    public Address createAddress() {
        return  new Address(this.city,this.state,this.pin);
    }
}