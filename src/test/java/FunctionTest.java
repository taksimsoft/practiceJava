import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.lang.System.out;

public class FunctionTest {

    class   Customer<T>{
        T name;
    }

    class Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }
    }

    @Test
    public void applyTest(){
        List<? extends Person> people = Arrays.asList(new Person("Ali"), new Person("mehmet"));

        Customer<String> stringCustomer = new Customer<>();

        Function<Person,String> functionPerToName = (Person p) -> p.name;

        List<String> names = getConvert((List<Person>) people, functionPerToName);
        names.forEach(out::println);
    }

    private List<String> getConvert(List<Person> people, Function<Person, String> functionPerToName) {
        List<String>    list = new ArrayList<>();
        people.forEach(person -> list.add(functionPerToName.apply(person)));
        return list;
    }


    @Test
    public void andThenTest(){
        List<Person> people = Arrays.asList(new Person("Ali"), new Person("Kemal"), new Person("Hasan"));
        Function<Person,String> applyFunction = (Person p) -> p.name;
    Function<String, String> andThen =
        (String s) -> {
            String s1 = "" + s.charAt(0);
            System.out.println(s1);
            return s1;
        };

        people.forEach(item -> applyFunction.andThen(andThen).apply(item));




//        List<String> convertedList = getConvert(people, finalFunction);
//        convertedList.forEach(System.out::println);
    }
}
