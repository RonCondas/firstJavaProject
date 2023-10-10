/*Ronald Noriega-Valdeolla
 * ITSE 2371
 * 9/06/2023
 In this exercise, I will write a program that allows students to solve arithmetic problems. */

import java.util.Random;
import java.util.Scanner;

public class math_tutor {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//variables
		
		int tutor = 0; // tutor store if they want to add 1 or subtract 2

		int min = 1;

		int max = 500; //random number from 1 to 500

		int add = 0; // Store the add part in case the user input 1

		int substract = 0; // Store the add part in case the user input 2

		int addanswer = 0;

		int substranswer = 0; // substract the to random numbers

		Random random = new Random(); 

		int numb1 = random.nextInt(max)+ min;

		int numb2 = random.nextInt(max)+ min;

		substranswer = numb1 - numb2;

		addanswer = numb1 + numb2;
		
		//Talk to user
		
		System.out.println("Would you like to Add (1) or Subtract (2) your numbers?");
		
		// Costumer input if they want to add or substract
		tutor = input.nextInt();
		
		// Calculation or logic. Whatever solution they enter the program will evaluate that answer 
		
		if (tutor == 1)

		{
			System.out.printf("Please answer the fallowing %d + %d = ", numb1, numb2);
			add = input.nextInt();

		}

		else {
			System.out.printf("Please answer the fallowing  %d - %d = ", numb1, numb2);
			substract = input.nextInt();

		}
		
		// Display if the answer is correct
		
		if (add == addanswer && tutor == 1) {
			System.out.printf("Congratulations %d is the correct answer!!!", addanswer);

		}

		else if (add != addanswer && tutor == 1) {
			System.out.printf("Your answer supose to be actually: %d", addanswer);

		}
		
		else if (substract == substranswer) {
			System.out.printf("Congratulations %d is the correct answer!!!", substranswer);

		}

		else {
			System.out.printf("The difference is: %d", substranswer);
		}

		input.close();

	}
}
