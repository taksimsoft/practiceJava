package Map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsent {

  public static void main(String[] args) {

      Map<String,Integer>   map = new HashMap<>();
      map.computeIfAbsent("servet", String::length);
      map.computeIfAbsent("servets", String::length);
      map.computeIfAbsent("haydar", String::length);
      map.computeIfAbsent("karbas", String::length);
      map.computeIfAbsent("sssssssss", String::length);

      map.entrySet().forEach(System.out::println);

  }
}
