package numberplaylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberPlayListApp {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,5,7,8);
        System.out.println("Using Proper Class:");
        numbers.forEach(new NumberPrinter());

        System.out.println("\nUsing Anonymous Class:");
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println(number);
            }
        });

        System.out.println("\nUsing Lambda Function:");
        numbers.forEach(number -> System.out.println(number));

        Function<Integer,Double> doubleFunction=Integer::doubleValue;
        System.out.println("Printing in double values ");
        numbers.forEach(n-> {System.out.println("double number "+doubleFunction.apply(n));});

        System.out.println("Print Only Even Elements ");
        Predicate<Integer> isEven=n -> n%2 == 0;
        numbers.forEach(n -> System.out.println(isEven.test(n)));
        numbers.stream().filter(n-> n%2 ==0).forEach(System.out::println);

        //UC-2.2
        List<Double> doubledNumbers = numbers.stream()
                .map(number -> number * 2.0)
                .collect(Collectors.toList());
        doubledNumbers.forEach(System.out::println);

        //UC-2.3
        List<Double> doubleList = numbers.stream()
                .map(n -> n.doubleValue())
                .collect(Collectors.toList());
        doubleList.forEach(System.out::println);

        //UC-2.4
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);

        //UC-2.5
        Optional<Integer> firstEvenNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        firstEvenNumber.ifPresent(n -> System.out.println("First even number: " + n));

        //UC-2.6
        Optional<Integer> minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Comparator.naturalOrder());

        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder());
        minEven.ifPresent(n -> System.out.println("Minimum even number: " + n));

        maxEven.ifPresent(n -> System.out.println("Maximum even number: " + n));

    }
}
