import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazyInvocation {

    private    long counter;

    private     void    wasCalled(){
        counter++;
    }

  public static void main(String[] args) {

  List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
    new Product(14, "orange"), new Product(13, "lemon"),
    new Product(23, "bread"), new Product(13, "sugar"));


    Collector<Product, ?, LinkedList<Product>> toLinkedList =
        Collector.of(
            LinkedList::new,
            LinkedList::add,
            (first, second) -> {
              System.out.println("ss");

              first.addAll(second);
              return first;
            });


      LinkedList<Product> collect = productList
              .stream()
              .map(
                      (c) -> {
                          System.out.println(c);
                          return c;
                      })
              .collect(toLinkedList);

      collect.forEach(System.out::println);

      //      (first, second) -> {     LazyInvocation lazyInvocation = new LazyInvocation();
//         first.addAll(second);
//         return first;     List<String> list = Arrays.asList("abc1", "abc2", "abc","abc1", "abc2", "abc","abc1", "abc2", "abc");
//      });    lazyInvocation.counter = 0;
//
//
//      long size = list.stream().map(element -> {
//          lazyInvocation.wasCalled();
//          return element.substring(0, 3);
//      }).skip(3).count();
//
//      System.out.println(lazyInvocation.counter + " : " + size);


//      list.stream().filter(element -> {
//          System.out.println("filter() was called");
//          return element.contains("2");
//      }).sorted().map(element -> {
//          System.out.println("map() was called");
//          return element.toUpperCase();
//      }).forEach(System.out::println);

//      System.out.println(lazyInvocation.counter);
  }

    private static class Product {
        private int id;
        private String name;
        public Product(int i, String orange) {
            this.id = i;
            this.name = orange;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
