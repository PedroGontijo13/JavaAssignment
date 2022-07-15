package ca.ciccc.assignment7.question3;

import ca.ciccc.assignment7.question4.List;

import java.util.ArrayList;

public class Question3 {
    public void exchangeElements(int index, ArrayList<Integer> al) {
        al.get(index);
    }
    public void invoke() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(5);
        al.add(5);
        al.add(5);
        al.add(5);
        exchangeElements(5, al);
    }
}
