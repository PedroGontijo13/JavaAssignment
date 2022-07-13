package ca.ciccc.assignment7.question4;

import java.util.ArrayList;

public class List<T> {
    private T t;
    private ArrayList<T> ListA;
    public void addToList(T obj) {
        ListA.add(obj);
    }
    public void removeFromList(T obj) {
        if (ListA.contains(obj)) {
            ListA.remove(obj);
        } else {
            System.out.println("This obj dosent exist yet");
        }
    }
    public T performOperation(T operator) {
        ArrayList<T> al = new ArrayList<>();
        for(int i = 0; i < ListA.size(); i++) {
            if(ListA.get(i) == operator) {
                al.add(ListA.get(i));
                System.out.println(operator);
            }
        }
        return (T) al;
    }
    /*
    public void setType(T t) {
        this.t = t;
    }
    public T getType() {
        return t;
    }*/
}
