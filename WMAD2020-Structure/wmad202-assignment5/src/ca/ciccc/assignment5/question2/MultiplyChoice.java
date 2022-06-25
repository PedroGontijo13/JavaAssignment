package ca.ciccc.assignment5.question2;

import java.util.ArrayList;

public class MultiplyChoice {
    private ArrayList<String> ChoiceList = new ArrayList<>();

    public void giveChoices() {
        ChoiceList.add("A");
        System.out.println("A");
        ChoiceList.add("B");
        System.out.println("B");
        ChoiceList.add("C");
        System.out.println("C");
        ChoiceList.add("D");
        System.out.println("D");
    }

    public void checkChoice(String answer) {
        String correct = "A";
        if(answer == correct) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }

}
