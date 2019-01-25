package stream;


import sun.jvm.hotspot.utilities.StreamMonitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    Stream<String>  emptyString =  Stream.empty();




    Stream<String>  streamOf(List<String>   list){

        return  list == null || list.isEmpty() ? Stream.empty() : list.stream();
        
    }

    public static void main(String[] args) throws IOException {

//        streamOfCollection();
//        streamOfArrays();
//        Stream<String> stream = Stream.<String>builder().add("a").add("b").build();
//        streamGenerate();
//        StreamString();
//        streamIterate();
//        patternCompileAsStream();

        Path path = Paths.get("/Users/servetkarabas/dev/test/PiggyMetrics/account-service/src/main/java/com/piggymetrics/account/AccountApplication.java");
        Stream<String> lines = Files.lines(path);
        lines.forEach(System.out::println);

    }

    private static void patternCompileAsStream() {
        Stream<String> stream = Pattern.compile(", ").splitAsStream("a, b, c");
        stream.forEach(System.out::println);
    }

    private static void streamIterate() {
        Stream<Integer> integerStream = Stream.iterate(10, (i) -> i + 5).limit(5);
        integerStream.forEach(System.out::println);
    }

    private static void StreamString() {
        Stream<String> streamString = Stream.iterate("a", (v) -> v + "v").limit(20);
        streamString.forEach(System.out::println);
    }

    private static void streamGenerate() {
        Stream<String> limit = Stream.generate(StreamTest::getStringSupplier).limit(3);
        limit.forEach(System.out::println);
    }

    private static String getStringSupplier() {
        return  "Generated";
    }

    private static void streamOfArrays() {
        Stream<String> stream = Stream.of("a", "b", "c");

        String[] strings = new String[]{"a", "b"};
        Stream<String> stream1 = Arrays.stream(strings);
        Stream<String> stream2 = Arrays.stream(strings, 1, 2);
    }

    private static void streamOfCollection() {
        Collection<String> strings = Arrays.asList("a", "b", "c");
        Stream<String> stream = strings.stream();
    }

}
