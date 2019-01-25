package strategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

      Discounter    discounter = new ChristmasDiscount();
      BigDecimal result = discounter.applyDiscount(BigDecimal.valueOf(100));

      Discounter    anotherDiscount = new Discounter() {
          @Override
          public BigDecimal applyDiscount(BigDecimal amount) {
              return amount.multiply(BigDecimal.TEN);
          }
      };

      Discounter    discountWeekend = ( amount) -> BigDecimal.TEN;
      BigDecimal result2 = anotherDiscount.applyDiscount(BigDecimal.valueOf(2000));

      List<Discounter>  discounters = Arrays.asList((amout)-> (BigDecimal)amout.multiply(BigDecimal.TEN),
              (amount)-> (BigDecimal)amount.multiply(BigDecimal.valueOf(0.1)));

      DiscountStatic.causalDiscount().applyDiscount(BigDecimal.valueOf(10));
      DiscountStatic.newYearDiscount().applyDiscount(BigDecimal.valueOf(20));
  }
}
