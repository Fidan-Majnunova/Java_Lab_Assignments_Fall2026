/*[EX] [MonthInfo.java] Given the number of the month (e.g., 1 = Jan, 2 = Feb, etc.), print the
name of the month followed by the number of days in it.
a. Note: Do not consider leap years. For Feb you may print 28 or 29)
b. You may want to use switch…case for this task.
 */

import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Months = sc.nextInt();

        switch(Months){
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;

        
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        
        }

    }   
    
}
