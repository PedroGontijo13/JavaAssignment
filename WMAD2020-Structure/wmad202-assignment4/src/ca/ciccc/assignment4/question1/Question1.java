package ca.ciccc.assignment4.question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void Test() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int num = 1;
        do {
            System.out.println("DIGIT THE NUMBER:");
            num = in.nextInt();
            if(numberList.contains(num)) {
                System.out.println("CANT BE A REPETED NUMBER");
                System.out.println("DIGIT THE NUMBER:");
                num = in.nextInt();
            } if(num == 0) {
                break;
            }else {
                numberList.add(num);
                System.out.println(num + " ADDED");
                System.out.println("0 - TO STOP");
            }
        } while(num != 0);
    }
}
