package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIteratorApp {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Stream<Integer> numberStream = numbers.stream();
        numberStream.forEach(number -> System.out.println(number));
    }
}
