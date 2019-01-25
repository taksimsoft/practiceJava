package abstractfactory;

public class Dog implements Animal{
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Dog Sound";
    }
}
