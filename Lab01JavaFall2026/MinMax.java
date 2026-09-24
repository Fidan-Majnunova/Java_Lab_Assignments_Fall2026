/*] [MinMax.java] Given floating-point values (the count is not known in advance, take inputs
until the EOF), find the minimum and the maximum of the numbers */

import java.util.Scanner;
public class MinMax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float min=sc.nextFloat();
        float max=min;

        while(sc.hasNextFloat()){
            float num=sc.nextFloat();
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
