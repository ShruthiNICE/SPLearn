package LambdaExamples;

import java.util.ArrayList;

public class SimpleLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(28);
        list.add(37);
        list.add(46);
        list.add(55);
        list.forEach(n -> System.out.println(n));


    }
}
