package abstractfactory;

public class ColorFactory implements AbstractFactory{
    @Override
    public Color   getColor(ColorType type){
        switch(type){
            case WHITE:
                return  new White();
            case BLACK:
                return  new Black();
            case BROWN:
                return  new Brown();
            default:
                return  null;
        }
    }

    @Override
    public Animal getAnimal(AnimalType type) {
        throw new UnsupportedOperationException();
    }

}
