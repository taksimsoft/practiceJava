package functional;

import java.util.function.Function;

public class FunctionalProgramming {


  public static void main(String[] args) {

    Function<String, Integer> strToIntFnc =
        $ -> {
          System.out.println(" apply function " +  $);
          return Integer.valueOf($);
      };

      Function<Integer, Integer> integerToIntFnc =
              $ -> {
                  System.out.println(" After function " +  $);
                  return Integer.valueOf($ * 2);
              };


      Integer result = strToIntFnc.andThen(integerToIntFnc).apply("200");


//      System.out.println(result);

    System.out.println(integerToIntFnc.compose(strToIntFnc).apply("200"));
  }


}
