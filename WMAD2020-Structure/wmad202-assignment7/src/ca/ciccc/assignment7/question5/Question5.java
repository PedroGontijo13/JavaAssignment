package ca.ciccc.assignment7.question5;

import ca.ciccc.assignment7.question1.Index;
import ca.ciccc.assignment7.question4.List;

import java.util.ArrayList;

public class Question5 {
    /*
    public static <T> int findFirst(List<T> list, int begin, int end) {
        int flag = 0;
        int i = 0;
        ArrayList<T> al = list.getArray();
        while(begin > end) {
            end++;
            i = end;
            int number = al.get(i);
            if((number == 0) || (al.get(i) == 1)) {
                System.out.println("NOT PRIME");
            }else{
                int m = al.get(i) / 2;
                for(i=2;i<=m;i++){
                    if(al.get(i)%i==0){
                        System.out.println(al.get(i) +" is not prime number");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)  { System.out.println(al.get(i) +" is prime number"); }
            }//end o
        }*/
    static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if (inputNumber <= 1) {
            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i == inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    boolean IsItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }

    public static void Invoke() {
        int start = 10;
        int end = 30;
        System.out.println("Prime numbers between "+start+" and "+end+" : ");
        for (int i = start; i <= end; i++)
        {
            if(checkForPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}
