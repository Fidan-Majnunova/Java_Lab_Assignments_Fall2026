/*[PW] [SumOfOdd.java] Given two integers, find the sum of the odd numbers in between those
numbers. Note: the order of the numbers is not guaranteed. */

import java.util.Scanner;
public class SumOfOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        int sum=0;
        if(num1<num2){
            for(int i=num1;i<num2+1;i++){
                if(i%2!=0){
                    sum=sum+i;
                }
            }
        }
        System.out.println("The sum of odd numbers between these two numbers: "+sum);
        sc.close();
        
       
    }
}