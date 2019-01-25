package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
  private static    Predicate<String> predicateImplementation = new Predicate<String>() {
      @Override
      public boolean test(String s) {
          return s.length() < 20;
      }
  };

  private static Predicate<String>  predicateLambda =  $ -> $.length() > 10 ;


  public static void main(String[] args) {

      boolean result = predicateLambda.and(predicateImplementation).test("HKHKHKHKHKHKHKJHKJHKJKJHKJHKJHKJ");
    System.out.println(result);

      List<String> list = Arrays.asList("a", "b", "absbsbsbdjdjsdk", "kjdslajdlajdlsaj", "hsadkhasdkjhask");
      List<String> collect = list.stream().filter(predicateLambda).collect(Collectors.<String>toList());
      collect.forEach(System.out::println);
  }

}
