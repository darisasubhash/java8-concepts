package numberplaylist;

import java.util.function.Consumer;

public class NumberPrinter implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
