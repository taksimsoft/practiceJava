import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorTest implements Comparator<ComparableComparatorTest.Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return 0;
    }

    class Player{
        private int age;
        private String  name;

        public Player(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

//        @Override
//        public int compareTo(Player o) {
//            return this.age-o.age;
//        }

        @Override
        public String toString() {
            return "Player{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Test
    void    compareTest(){
        List<Player> players = Arrays.asList(new Player(12, "baa"), new Player(33, "caa"), new Player(11, "sdd"));

        Comparator<Player>  compaaratir = (f,s) -> {return f.getAge()-s.getAge();};

//        players.forEach(System.out::println);
        players.stream().sorted((first, second) -> {return  first.getAge() - second.getAge();}).forEach(System.out::println);

    }




}
