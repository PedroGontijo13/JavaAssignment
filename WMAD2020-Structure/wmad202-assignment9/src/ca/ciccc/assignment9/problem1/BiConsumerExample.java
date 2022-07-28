package ca.ciccc.assignment9.problem1;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void test() {
        BiConsumer<Integer, String> bic = (i, s) -> {
            System.out.println(i+"========"+s);
        };
        bic.accept(5, "Pedro");
    }
}
