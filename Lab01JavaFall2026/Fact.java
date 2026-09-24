/*EX] [Fact.java] Write a program that takes an integer using command-line arguments and find
the factorial of that number.
a. If the given number is negative, you should print an error message without attempting
to calculate the factorial */

import java.util.Scanner;
public class Fact {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int factorial=1;

        if(n<0) {
            System.out.println("Error, enter a positive number to find the factorial");
        }
        else
        {
            for(int i=1;i<n+1;i++){
                factorial=factorial*i;
            }
            System.out.println("The factorial is "+factorial);
        }



    }

    
}
