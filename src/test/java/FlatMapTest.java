import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlatMapTest {

    @Test
    public void optionalMapTest(){
        Optional<String> opt = Optional.of("test");
        assertEquals(Optional.of("TEST"), opt.map(String::toUpperCase));
    }

    @Test
    public void optionalMapTest2(){

        assertEquals(Optional.of(Optional.of("STRING")),
                Optional
                        .of("string").map(String::toUpperCase)
                        .map(s -> Optional.of(s)));
    }


    @Test
    public  void    optionalFlatMapTest(){
        assertEquals(Optional.of("string"),Optional.of("string").flatMap(s-> Optional.of(s)));
    }

//    @Test
//    public void    streamMap(){
//        List<List<String>> lists = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
//
//        lists.stream().flatMap(Collection::s);
//
//        assertEquals();
//    }
}
