import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private static FizzBuzz fizzBuzz;

    @BeforeAll
    public static   void initialize(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzTest(){
        assertEquals("1",fizzBuzz.convert(1));
        assertEquals("2",fizzBuzz.convert(2));
        assertEquals("fizz",fizzBuzz.convert(3));
        assertEquals("fizz",fizzBuzz.convert(6));
        assertEquals("fizz",fizzBuzz.convert(9));
        assertEquals("fizz",fizzBuzz.convert(12));
    }

    @Test
    public void buzzTest(){
        assertEquals("1",fizzBuzz.convert(1));
        assertEquals("2",fizzBuzz.convert(2));
        assertEquals("buzz",fizzBuzz.convert(5));
        assertEquals("buzz",fizzBuzz.convert(10));
    }

    @Test
    public  void    fizzBuzzTest(){
        assertEquals("fizzbuzz",fizzBuzz.convert(15));
        assertEquals("fizzbuzz",fizzBuzz.convert(15*2));
        assertEquals("fizzbuzz",fizzBuzz.convert(15*3));
        assertEquals("fizzbuzz",fizzBuzz.convert(15*4));
        assertEquals("fizzbuzz",fizzBuzz.convert(15*5));
    }
}
