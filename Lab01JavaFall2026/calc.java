/*Write a program that takes two integers from command-line arguments and
prints the sum, subtraction, multiplication, integer division and remainder of the division of
those two numbers
*/
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1=sc.nextInt();
        System.out.println("Enter second integer: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int rem=num1%num2;
        System.out.println("Sum: "+sum);
        System.out.println("subtraction is "+sub);
        System.out.println("multiplication is "+mul);
        System.out.println("integer division is "+div);     
        System.out.println("remainder is "+rem);
        sc.close();

    }
}
