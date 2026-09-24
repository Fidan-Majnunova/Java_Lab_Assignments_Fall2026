/*[EX] [ArmstrongNumbers.java] Given an integer. Check if the number is a Narcissistic number
(Armstrong number) or not.
a. Example: Let us assume the number is 371. To check if the number is an Armstrong
number, we should raise each digit to the power of 3 (number of the its digits). 3^3 +
7^3 + 1^3 = 371. If the sum equals to the number itself, it is considered to be an
Armstrong number.
b. If user enters two integers, can you print out the list of all such numbers in a given
range */

import java.util.Scanner;
public class ArmstrongNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
    
        for(int num=start;num<=end;num++) //will look through one by one
        {
            int original=num;
            int temp=num;
            int digits=0;

            while(temp>0){
                digits++;
                temp/=10;  //found the number of digits in the number
            }

            temp=num;
            int sum=0;
            //finding the sum of powers
            while(temp>0){
                int digit=temp%10;
                sum=sum+(int)Math.pow(digit,digits);
                temp/=10;
            }
            if(sum==original){
                System.out.println(original);
            }

            

        }



    }
}