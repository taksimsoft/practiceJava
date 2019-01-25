package abstractfactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType   choise){
        switch (choise)  {
            case COLORFACTORY:
                return  new ColorFactory();
            case ANIMALFACTORY:
                return  new AnimalFactory();
                default:
                    return  null;
        }
    }
}
