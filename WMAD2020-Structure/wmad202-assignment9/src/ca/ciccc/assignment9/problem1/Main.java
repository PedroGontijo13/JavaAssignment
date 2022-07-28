package ca.ciccc.assignment9.problem1;

public class Main {
    public static void main() {
        BiConsumerExample bic = new BiConsumerExample();
        bic.test();
        IntSupplierExample is = new IntSupplierExample();
        is.test();
        //ToDoubleBiFunctionExample tbe = new ToDoubleBiFunctionExample();
        //tbe.test();
        UnaryOperatorExample ue = new UnaryOperatorExample();
        ue.Test();
    }
}
