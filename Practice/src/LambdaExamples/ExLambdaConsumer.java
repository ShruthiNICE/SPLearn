package LambdaExamples;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ExLambdaConsumer {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(91);
        numbers.add(82);
        numbers.add(73);
        numbers.add(64);
        numbers.add(55);
        Consumer<Integer> method = n -> System.out.println(n);
        numbers.forEach(method);

    }
}
