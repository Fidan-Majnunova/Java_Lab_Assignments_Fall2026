/* [PW] [GuessGame.java] Write a program to simulate the “Guess Game”. Your program takes a
positive random integer number not greater than A (to be entered by the user). It then lets user
to guess the number. If the number is guessed correctly, user wins. Otherwise, the program
helps user by indicating whether the number entered is LOWER or HIGHER.
a. Program should terminate:
i. If user guesses the correct number
ii. If user enters end of file flag. (Ctrl+Z for Win, CTRL+D for Unix & Linux,
Command+Z for Mac)
b. Can you modify the program so that user can be scored by the number of attempts s/he
does before guessing the number correctly? */

import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Random random = new Random();
       
       System.out.println("Enter A: ");
       int A=sc.nextInt();
       int secret_number = random.nextInt(A)+1;

       while(true)
        {
            System.out.println("Your guess: ");
            if(!sc.hasNextInt()){ //EOF
                break;
            }
            int guess = sc.nextInt();

            if(guess==secret_number){
                System.out.println("Correct!");
                break;
            }
            else if(guess<secret_number){
                System.out.println("Higher!");
            }
            else if(guess>secret_number){
                System.out.println("Lower!");
            }
        }
    }
    
}
