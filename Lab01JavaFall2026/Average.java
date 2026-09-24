/*[EX] [Average.java] Given numbers (the count is not known in advance, take inputs until the
EOF) and find the average of these numbers.
a. If no input is entered, instead of calculating the average, print an error message*/

import java.util.Scanner;

public class Average{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        double sum=0;
        int count =0;
        
        while(sc.hasNextDouble()){

            double number = sc.nextDouble();
            sum+=number;
            count++;
            
        }
        double average = sum/count;
        System.out.println("The average is " + average);

    }

}

