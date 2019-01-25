package abstractfactory;

public class AnimalFactory implements AbstractFactory {
    @Override
    public Color getColor(ColorType type) {
        throw new UnsupportedOperationException();
    }


    public Animal getAnimal(AnimalType type){
        switch (type){
            case DUG:
                return  new Dug();
            case    BEAR:
                return  new Bear();
            case DOG:
                return  new Dog();
            default:
                return  null;
        }
    }
}
