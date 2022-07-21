package ca.ciccc.assignment8.main;

import ca.ciccc.assignment8.question1.Question1;
import ca.ciccc.assignment8.question2.ApplicationDriver;

public class Assignment8Driver {
    public static void run() {
        Question1 question1 = new Question1();
        question1.invoke();
        ApplicationDriver ap = new ApplicationDriver();
        ap.invoke();
    }
}
