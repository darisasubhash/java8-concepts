package numberplaylist;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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
    }
}
