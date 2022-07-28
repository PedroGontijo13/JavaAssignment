package ca.ciccc.assignment9.problem1;

import java.util.function.IntSupplier;

public class IntSupplierExample {
    public static void test() {
        IntSupplier is = () -> {
            int a = 5;
            int b = 6;
            return a * b;
        };
        System.out.println(is.getAsInt());
    }
}
