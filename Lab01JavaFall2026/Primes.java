/* [Primes.java] Given an integer. Check if the number is prime. */

import java.util.Scanner;

public class Primes{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime=true;

        if(n<0){
            System.out.println("Enter a positive number");
        }
        else if(n==0){
            System.out.println("Please enter another number");
        }
        else if(n==1){
            System.out.println("1 is not a prime number");
        }
        else if(n==2){
            System.out.println("2 is a prime number");
        } 
        else{
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n%i==0) prime=false;
            }
            if(prime){
                System.out.println(n + " is prime");
            }
            else{
                System.out.println(n + " is not prime");
            }

        }
        
    }
}