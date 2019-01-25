package abstractfactory;

public class Bear   implements Animal {
    @Override
    public String getType() {
        return "bear";
    }

    @Override
    public String makeSound() {
        return "bear sound";
    }
}
