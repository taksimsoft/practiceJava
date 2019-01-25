package abstractfactory;

public class Main {

  public static void main(String[] args) {
      System.out.println(FactoryProvider.getFactory(FactoryType.ANIMALFACTORY).getAnimal(AnimalType.BEAR).getType());
  }
}
