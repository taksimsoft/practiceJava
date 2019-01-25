import org.junit.jupiter.api.Test;

import java.util.*;

public class ListFindDublicate {

  List<String> filenames = Arrays.asList("aa", "bbb", "aa", "bbb","ccc");

  @Test
  public void findDublciateFilesTest() {
    Set<String> uniques = new HashSet<>();
    Set<String> duplicates = new HashSet<>();

    filenames
        .stream()
        .forEach(
            item -> {
              if (!uniques.add(item))duplicates.add(item);
            });
    if (duplicates.size() > 0) {
        duplicates.forEach(System.out::println);
    }
  }
}
