package strategy;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DiscounterUO {

  public interface Discounter extends UnaryOperator<BigDecimal> {

    static Discounter christmas() {
      return (amount) ->{
          System.out.println("christmas "+amount);
          return amount.multiply(BigDecimal.valueOf(0.1));
      };
      }


    static Discounter newYear() {
      return (amount) ->{
          System.out.println("newYear "+amount);
          return amount.multiply(BigDecimal.valueOf(0.2));
      };
    }

    static Discounter easter() {

      return (amount) -> {
          System.out.println("easter "+amount);
          return amount.multiply(BigDecimal.valueOf(0.5));};
    }

    default Discounter combine(Discounter after) {
      return value -> {

          return apply(after.apply(value));
      };
    }
  }


  public static Discounter compose(Discounter ... allDiscounters){


      return Stream
             .of(allDiscounters)
             .reduce(e->e,Discounter::combine);
  }

  public static void main(String[] args) {

    //System.out.println(Discounter.easter().apply(BigDecimal.valueOf(200)));


      Discounter compose = compose(Discounter.easter(), Discounter.newYear(), Discounter.christmas());

    System.out.println(compose.apply(BigDecimal.valueOf(200)));
//      System.out.println(Discounter.easter()
//              .combine(Discounter.newYear())
//              .compose(Discounter.christmas())
//              .andThen(Discounter.easter())
//              .apply(BigDecimal.valueOf(200)));

  }
}
