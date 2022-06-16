package ca.ciccc.wmad202.assignment3.problem5;

import java.util.Scanner;

public class Problem5 {
    /**Write a method, which receives a list of positive integers between 1 and 99, which may
     or may not contains repeated numbers.
     -The methods should print out how many each item in the list is repeated. */
    public static void RepeatedTimes(int x[]) {
        for (int i=0;i<9;i++) {
            int count=1;
            for (int j=i+1;j<10;j++) {
                if (x[i]==x[j]) count++;
            }
            System.out.println("The number "+ x[i] +" is repeated " + count + " times" + "\n");
        }
    }
    //Take the input number
    public static void TakeNumbers() {
        Scanner in = new Scanner(System.in);
        int n[] = new int[10];
        for(int i = 0; i < n.length; i++) {
            System.out.println("Digit one number:");
            n[i] = in.nextInt();
            if(n[i] < 1 || n[i] > 100) {
                System.out.println("Need to be greater or equal 1 and smaller than 100");
                System.out.println("Digit again:");
                n[i] = in.nextInt();
            }
        }
        RepeatedTimes(n);
    }
}
