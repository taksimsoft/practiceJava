package factorytest;

import static factorytest.PolyType.SQUARE;

public class PolygonFactory {

  public static void main(String[] args) {
    System.out.println(new PolygonFactory().getPolygon(PolyType.SQUARE).getType());
  }

    Polygon getPolygon(PolyType type){
        switch (type){
            case TRIANGLE:
                return  new Triangle();
            case SQUARE:
                return  new Square();
            case OTHER:
                return  new Pentagon();
        }
        return null;
    }
}
