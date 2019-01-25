import FizzBuzz.FizzBuzz3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzz3Test {

    private static FizzBuzz3 fizzBuzz3;

    @BeforeAll
    public static void initialize(){
        fizzBuzz3 = new FizzBuzz3();
    }

    @Test
    public void fizzTest(){
        assertEquals("fizz", fizzBuzz3.process(3));
        assertEquals("fizz", fizzBuzz3.process(6));
        assertEquals("7", fizzBuzz3.process(7));
        assertEquals("fizz", fizzBuzz3.process(9));
        assertNotEquals("fizz", fizzBuzz3.process(15));
    }

    @Test
    public void buzzTest(){
        assertEquals("buzz",fizzBuzz3.process(5));
        assertEquals("buzz",fizzBuzz3.process(10));
//        Assertions.assertEquals("buzz",fizzBuzz3.process(15));
        assertEquals("4",fizzBuzz3.process(4));
    }

    @Test
    public  void    fizzbuzzTest(){
        assertEquals("fizzbuzz", fizzBuzz3.process(15));
        assertEquals("fizzbuzz", fizzBuzz3.process(45));
        assertEquals("fizzbuzz", fizzBuzz3.process(30));
        assertNotEquals("fizzbuzz", fizzBuzz3.process(4));

    }

    @Test
    public void nullTest(){
        assertNotNull(fizzBuzz3.process(null));
        assertEquals("NULL",fizzBuzz3.process(null));
    }
}
