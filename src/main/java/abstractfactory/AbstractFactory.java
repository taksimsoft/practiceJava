package abstractfactory;

public interface AbstractFactory {
    Color   getColor(ColorType type);
    Animal  getAnimal(AnimalType    type);
}
