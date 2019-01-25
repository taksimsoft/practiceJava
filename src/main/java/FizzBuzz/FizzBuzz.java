package FizzBuzz;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FizzBuzz {

    Function<Integer,String>    fizzFunction = this::getIntegerStringFunction;

    Predicate<Integer>  fizbuzzTest = ($) ->  ($ % 15) == 0;
    Predicate<Integer>  fizzTest = ($) ->  ($ % 3) == 0;
    Predicate<Integer>  buzzTest = ($) ->  ($ % 5) == 0;

    private String getIntegerStringFunction(Integer item) {
        String  result;
        if(fizbuzzTest.test(item))
            result = "fizzbuzz";
        else if(buzzTest.test(item))
            result = "buzz";
        else if(fizzTest.test(item))
            result = "fizz";
        else
            result = String.valueOf(item);
        return  result;
    }


    public String convert(int i) {
        return  fizzFunction.apply(i);
    }

  public static void main(String[] args) {

      FizzBuzz fizzBuzz = new FizzBuzz();

      IntStream.rangeClosed(0,100).forEach($ -> System.out.println($ + " " + fizzBuzz.convert2($)));

      System.out.print(fizzBuzz.convert2(null));
  }

    private String convert2(Integer item) {
        return Optional.ofNullable(item).
                map(($) -> $ % 15 == 0 ? "fizbuzz" : $ % 3 == 0 ? "fizz" : $ % 5 == 0 ? "buzz" : "" + $).orElse("a");
    }
}
