package ca.ciccc.wmad202.assignment3.problem4;

import java.util.Scanner;

public class Problem4 {
    /**Implement a function which receives a list of positive integers as input parameter. The
     numbers in the list are only between 1 and 99. The list might have repeated numbers. The
     method will return the number that is repeated the most. If there are multiple numbers
     that are repeated the most, returns only one of them*/
    public static int Repeated(int numbers[]) {
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    // got the duplicate element
                    number = numbers[i];
                    break;
                }
            }
        }
        return number;
    }
    //Take the input number
    public static void TakeNumbers() {
        Scanner in = new Scanner(System.in);
        int n[] = new int[5];
        for(int i = 0; i < n.length; i++) {
            System.out.println("Digit one number:");
            n[i] = in.nextInt();
        }
        if(Repeated(n) == 0) {
            System.out.println("DONT HAVE ANY REPEATED NUMBER!");
        } else {
            System.out.println("REPEATED NUMBER: " + Repeated(n));
        }
    }
}
