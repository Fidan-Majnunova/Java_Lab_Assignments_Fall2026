/* [Digits.java] Given an integer (can be negative as well). Find the sum, product, and average
of its numbers. */

import java.util.Scanner;

public class Digits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=Math.abs(n);

        int sum=0;
        int product=1;
        int count=0;
        
        while(n>0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            count++;
            n=n/10;
        }
        double average=(double)sum/count;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
    }
}
