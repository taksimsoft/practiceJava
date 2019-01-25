package abstractfactory;

public class Dug implements Animal {
    @Override
    public String getType() {
        return "Dug";
    }

    @Override
    public String makeSound() {
        return "Dug Sound";
    }
}
