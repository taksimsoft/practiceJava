package FizzBuzz;

import java.util.Optional;
import java.util.stream.IntStream;

public class FizzBuzz3 {

  public String process(Integer item) {
    return Optional.ofNullable(item).map(this::toFizzBuzz).orElse("NULL");
  }

  private String toFizzBuzz(Integer item) {
    return (item % 15 == 0)
        ? "fizzbuzz"
        : (item % 3 == 0) ? "fizz" : (item % 5 == 0) ? "buzz" : String.valueOf(item);
  }

  public static void main(String[] args) {
      IntStream.rangeClosed(1,100).forEach($->System.out.println( new FizzBuzz3().toFizzBuzz($)));
  }
}
