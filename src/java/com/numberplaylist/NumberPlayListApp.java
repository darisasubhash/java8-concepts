package numberplaylist;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
    }
}
