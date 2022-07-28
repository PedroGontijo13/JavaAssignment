package ca.ciccc.assignment9.problem2;

import java.util.ArrayList;
import java.util.List;

public class TestListSupplierExample {
    public static void test() {
        ListSupplier<String> ls = () -> {
            List<String> myList = new ArrayList<>();

            myList.add("A");
            myList.add("B");
            myList.add("C");

            return myList;
        };

        ArrayList<String> result = (ArrayList<String>) (ls.supplyList());

        for(String item: result) {
            System.out.println(item);
        }
    }
}
