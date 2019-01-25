package strategy;

import java.math.BigDecimal;
import java.util.Dictionary;

public interface DiscountStatic {

    BigDecimal  applyDiscount(BigDecimal    apply);

    static DiscountStatic   newYearDiscount(){
        return  (amount) -> amount.multiply(BigDecimal.valueOf(0.5));
    }

    static  DiscountStatic  weekendDiscount(){
        return  (amount) -> amount.multiply(BigDecimal.valueOf(0.6));
    }

    static DiscountStatic   causalDiscount(){
        return  (amount) -> amount.multiply(BigDecimal.valueOf(0.8));
    }
}
